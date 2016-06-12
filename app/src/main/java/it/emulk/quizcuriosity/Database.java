package it.emulk.quizcuriosity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database {

	/* per il debug, mi indica l'activity in esecuzione */
	private static final String TAG = "Database";

	// DB Fields
	public static final String KEY_ROWID = "_id";

	//public static final String Immagine = "immagine";
	public static final String Vittorie = "nvittorie";
	public static final String Perdite = "perdite";
	public static final String Tempo = "tempo";
	public static final String Obiettivi = "obiettivi";

	/* nella colonna 0 c'e' l'id che si autoincrementa */
	//public static final int COL_IMMAGINE = 1;
	public static final int COL_ROWID = 0;
	public static final int COL_VITTORIE = 1;
	public static final int COL_PERDITE = 2;
	public static final int COL_TEMPO = 3;
	public static final int COL_OBIETTIVI = 4;

	public static final String[] ALL_KEYS = new String[] { KEY_ROWID, 
			Vittorie, Perdite, Tempo, Obiettivi };

	// DB info: il nome del database e la tabella che stiamo utilizzando
	public static final String DATABASE_NAME = "LogoQuiz";
	public static final String DATABASE_TABLE = "LogoTable";

	// Track DB version if a new version of your app changes the format.
	public static final int DATABASE_VERSION = 2;

	/* Query SQL per creare la tabella, con le determinate righe e colonne */
	private static final String DATABASE_CREATE_SQL = "create table "
			+ DATABASE_TABLE + " (" + KEY_ROWID
			+ " integer primary key autoincrement, " 
			+ Vittorie + " integer , " + Perdite + " integer , " + Tempo
			+ " integer ," + Obiettivi + " integer "

			+ ");";

	// Context of application who uses us.
	private final Context context;

	private DatabaseHelper myDBHelper;
	private SQLiteDatabase db;

	// ///////////////////////////////////////////////////////////////////
	// Public methods:
	// ///////////////////////////////////////////////////////////////////

	public Database(Context ctx) {
		this.context = ctx;
		myDBHelper = new DatabaseHelper(context);
	}

	// Open the database connection.
	public Database open() {
		db = myDBHelper.getWritableDatabase();
		return this;
	}

	// Close the database connection.
	public void close() {
		myDBHelper.close();
	}

	// inserisce una nuova righa all'interno del database
	public long insertRow( int vittorie, int perdite, int tempo,
			int obiettivi) {

		// Create row's data:
		ContentValues initialValues = new ContentValues();
		//initialValues.put(Immagine, immagine);
		initialValues.put(Vittorie, vittorie);
		initialValues.put(Perdite, perdite);
		initialValues.put(Tempo, tempo);
		initialValues.put(Obiettivi, obiettivi);

		// Insert it into the database.
		return db.insert(DATABASE_TABLE, null, initialValues);
	}

	// Delete a row from the database, by rowId (primary key)
	public boolean deleteRow(long rowId) {
		String where = KEY_ROWID + "=" + rowId;
		return db.delete(DATABASE_TABLE, where, null) != 0;
	}

	/* delete all data */
	public void deleteAll() {
		Cursor c = getAllRows();
		long rowId = c.getColumnIndexOrThrow(KEY_ROWID);
		if (c.moveToFirst()) {
			do {
				deleteRow(c.getLong((int) rowId));
			} while (c.moveToNext());
		}
		c.close();
	}

	// Return all data in the database.
	public Cursor getAllRows() {
		String where = null;
		Cursor c = db.query(true, DATABASE_TABLE, ALL_KEYS, where, null, null,
				null, null, null);
		if (c != null) {
			c.moveToFirst();
		}
		return c;
	}

	// Get a specific row (by rowId)
	public Cursor getRow(long rowId) {
		String where = KEY_ROWID + "=" + rowId;
		Cursor c = db.query(true, DATABASE_TABLE, ALL_KEYS, where, null, null,
				null, null, null);
		if (c != null) {
			c.moveToFirst();
		}
		return c;
	}

	public Cursor LastQuery() {
		Cursor cursorlast = db.query(true, DATABASE_TABLE, ALL_KEYS, null,
				null, null, null, null, null);

		if (cursorlast.moveToFirst() == cursorlast.moveToLast()) {
			cursorlast.moveToFirst();
			return cursorlast;
		} else {
			cursorlast.moveToLast();
			return cursorlast;
		}

	}

	
	/**
	 * // Change an existing row to be equal to new data.
	 * invece di inserire una nuova righa va a modificare la righa che li viene passato come paramettro 
	 * con i nuovi valori
	 * @param rowId
	 * @param vittorie
	 * @param perdite
	 * @param tempo
	 * @param obiettivi
	 * @return
	 */
	public boolean updateRow(long rowId, int vittorie, int perdite, int tempo,
			int obiettivi) {
		String where = KEY_ROWID + "=" + rowId;
		// Create row's data:
		ContentValues newValues = new ContentValues();
		newValues.put(Vittorie, vittorie);
		newValues.put(Perdite, perdite);
		newValues.put(Tempo, tempo);
		newValues.put(Obiettivi, obiettivi);

		// Insert it into the database.
		return db.update(DATABASE_TABLE, newValues, where, null) != 0;
	}

	// ///////////////////////////////////////////////////////////////////
	// Private Helper Classes:
	// ///////////////////////////////////////////////////////////////////

	/**
	 * Private class which handles database creation and upgrading. Used to
	 * handle low-level database access.
	 */
	private static class DatabaseHelper extends SQLiteOpenHelper {
		DatabaseHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase _db) {
			_db.execSQL(DATABASE_CREATE_SQL);
		}

		@Override
		public void onUpgrade(SQLiteDatabase _db, int oldVersion, int newVersion) {
			Log.w(TAG, "Upgrading application's database from version "
					+ oldVersion + " to " + newVersion
					+ ", which will destroy all old data!");

			// Destroy old database:
			_db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);

			// Recreate new database:
			onCreate(_db);
		}
	}

}
