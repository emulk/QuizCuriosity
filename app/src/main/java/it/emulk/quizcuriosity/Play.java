package it.emulk.quizcuriosity;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.analytics.tracking.android.EasyTracker;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class Play extends Activity {
	private final static String APP_PNAME = "it.emulk.quizcuriosity";
	private final static String Gamestory_NAME = "it.example.storygame";
	private final static String subject = "Recommendations on QuizCuriosity";
	Button Technology;
	Button Science;
	Button Logo;
	Button Level;
	Button Level2;
	Button Statistiche;
	Button Indietro;
	Button Reset;
	Button FlagQuiz;
	Database myDB;
	Button RateApp;
	Button Capital;
	Button UsStates;
	Button About;
	/*sezione about*/
	Button Email;
	Button More;
	Button Findgamestory;

	int Nvittorie = 0;
	int Nperdite = 0;
	int NTempo = 0;
	int NObiettivi = 0;
	int PercentualeCorr = 0;
	TextView Questions;

	private static final String TAG = "Play";
	ImageView imageview;
	String randomString;
	Random rand = new Random();
	/**
	 * i quattro button che conterrano le varie risposte uno dei quatro sara
	 * corretto
	 */
	Button zero;
	Button uno;
	Button due;
	Button tre;
	/**
	 * ATTENTION: This was auto-generated to implement the App Indexing API.
	 * See https://g.co/AppIndexing/AndroidStudio for more information.
	 */
	private GoogleApiClient client;

	/* per il debug, mi indica l'activity in esecuzione */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/* FULL SCREEN */
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// assing the xml layout
		setContentView(R.layout.play);

		/**
		 * costumnize font for the title and the level
		 *
		 */
		TextView texttitle = (TextView) findViewById(R.id.choose);
		Typeface typface = Typeface.createFromAsset(getAssets(),
				"fonts/Carrington.ttf");
		texttitle.setTypeface(typface);


		MobileAds.initialize(getApplicationContext(), "ca-app-pub-4209540176643828/3973226192");

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		/* test */
		//AppRater.showRateDialog(this, null);
/*		Technology = (Button) findViewById(R.id.TechonolgyQuizButton);
		Technology.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent technologyIntent = new Intent(Play.this,
						Technology.class);
				startActivity(technologyIntent);
			}
		});
		
		*/
		/*
		 * //Science = (Button) findViewById(R.id.scencequiz);
		 * Science.setOnClickListener(new View.OnClickListener() {
		 * 
		 * @Override public void onClick(View v) {
		 * 
		 * Intent scienceIntent = new Intent(Play.this, Science.class);
		 * startActivity(scienceIntent); } });
		 */

		/**
		 * inizio statistiche l'activity statistiche si trova tutto
		 * nell'activity play
		 */
		Statistiche = (Button) findViewById(R.id.statistics);
		Statistiche.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				/*
				 * Intent intent=new Intent(Play.this, Statistiche.class);
				 * startActivity(intent);
				 */
				setContentView(R.layout.statistiche);

				// apro il DB
				openDB();

				/*
				 * ritorno in ReadActivity Read = (Button)
				 * findViewById(R.id.readButton); Read.setOnClickListener(new
				 * View.OnClickListener() {
				 * 
				 * @Override public void onClick(View v) {
				 * 
				 * Intent Readintent = new Intent(Statistiche.this, Read.class);
				 * startActivity(Readintent); Vibrator vb = (Vibrator)
				 * getSystemService(Context.VIBRATOR_SERVICE); vb.vibrate(100);
				 * } });
				 */
				Indietro = (Button) findViewById(R.id.indietro);
				Indietro.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						Intent Obieintent = new Intent(Play.this, Play.class);
						startActivity(Obieintent);
						// Vibrator vb = (Vibrator)
						// getSystemService(Context.VIBRATOR_SERVICE);
						// vb.vibrate(100);

					}
				});

				/* Reset all db data */
				Reset = (Button) findViewById(R.id.reset);
				Reset.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {

						myDB.deleteAll();
						/*
						 * refresho l'activity, altrimenti rimanevano i vecchi
						 * valori anceh se cancellati
						 */
						Intent refresh = new Intent(Play.this, Play.class);
						startActivity(refresh);
						Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
						vb.vibrate(100);
					}
				});
				/**
				 * RateApp e il bottone che ti porta sulla pagine dello store dove si puo votare per l'applicazione
				 */
				RateApp = (Button) findViewById(R.id.Rate);
				RateApp.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {

						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + APP_PNAME)));
					}
				});

				Cursor cursorlast = myDB.LastQuery();
				if (cursorlast.moveToLast()) {
					Nvittorie = cursorlast.getInt(Database.COL_VITTORIE);
				}

				if (cursorlast.moveToLast()) {
					Nperdite = cursorlast.getInt(Database.COL_PERDITE);
				}

				if (cursorlast.moveToLast()) {
					NTempo = cursorlast.getInt(Database.COL_TEMPO);
				}
				if (cursorlast.moveToLast()) {
					NObiettivi = cursorlast.getInt(Database.COL_OBIETTIVI);
				}

				/* faccio il modulo di ogni valore per avere i valori corretti */
				int seconds = (int) (NTempo) % 60;
				int minutes = (int) ((NTempo / (60)) % 60);
				int hours = (int) ((NTempo / (60 * 60)) % 24);

				TextView textView = (TextView) findViewById(R.id.perdite);
				textView.setText(String.valueOf(Nperdite));

				TextView textViewVinto = (TextView) findViewById(R.id.vittorie);
				textViewVinto.setText(String.valueOf(Nvittorie));

				TextView textViewTime = (TextView) findViewById(R.id.secondi);
				textViewTime.setText(String.valueOf(seconds));

				TextView textViewTimem = (TextView) findViewById(R.id.minuti);
				textViewTimem.setText(String.valueOf(minutes));

				TextView textViewTimeo = (TextView) findViewById(R.id.ore);
				textViewTimeo.setText(String.valueOf(hours));
				// TextView textViewObiettivi = (TextView)
				// findViewById(R.id.TextViewObiettivi);
				// textViewObiettivi.setText(String.valueOf(NObiettivi));

				/**
				 * Calcolo la percentuale di vittorie
				 * faccio la divisione tra 100 (la percentuale in centesimi) e il numero tatale (somma di vittorie e perdite)
				 * dopo lo moltiplico per il numero delle vittorie
				 */
				if (Nperdite > 0 && Nvittorie > 0) {
					PercentualeCorr = (100 * Nvittorie) / (Nperdite + Nvittorie);
				} else if (Nperdite == 0 && Nvittorie > 0) {
					PercentualeCorr = 100;
				} else {
					PercentualeCorr = 0;
				}
				Questions = (TextView) findViewById(R.id.QuestionsCorrect);

				Questions.setText(String.valueOf(PercentualeCorr + "%"));

			}
		});

		/**
		 * fine statistiche
		 */

		Logo = (Button) findViewById(R.id.logoquiz);
		Logo.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent logoIntent = new Intent(Play.this, Logo.class);
				startActivity(logoIntent);
			}


		});
		FlagQuiz = (Button) findViewById(R.id.flagquiz);
		FlagQuiz.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent flagintent = new Intent(Play.this, Flag.class);
				startActivity(flagintent);
			}
		});

		Capital = (Button) findViewById(R.id.capitalquiz);
		Capital.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent capitalintent = new Intent(Play.this, Capital.class);
				startActivity(capitalintent);
			}
		});

		UsStates = (Button) findViewById(R.id.usstate);
		UsStates.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent usstateslintent = new Intent(Play.this, UsStates.class);
				startActivity(usstateslintent);
			}
		});

		About = (Button) findViewById(R.id.about);
		About.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				setContentView(R.layout.about);


				Findgamestory = (Button) findViewById(R.id.findgamestory);
				Findgamestory.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {

						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + Gamestory_NAME)));
					}
				});


				Email = (Button) findViewById(R.id.email);
				Email.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent mailer = new Intent(Intent.ACTION_SEND);
						mailer.setType("text/plain");
						mailer.putExtra(Intent.EXTRA_EMAIL, new String[]{"gamestoryemulk@gmail.com"});
						mailer.putExtra(Intent.EXTRA_SUBJECT, subject);
						//mailer.putExtra(Intent.EXTRA_TEXT, bodyText);
						startActivity(Intent.createChooser(mailer, "Send email..."));

					}
				});


				Indietro = (Button) findViewById(R.id.indietroabout);
				Indietro.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						Intent Obieintent = new Intent(Play.this, Play.class);
						startActivity(Obieintent);
						// Vibrator vb = (Vibrator)
						// getSystemService(Context.VIBRATOR_SERVICE);
						// vb.vibrate(100);

					}
				});

			}

		});

		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
	}


	/**
	 * inizio delle funzioni
	 */
	/**
	 * La funzaione wrong mi serve per colorare di rosso i bottoni sbagliati
	 *
	 * @param zero
	 * @param uno
	 * @param due
	 */
	public void wrong(final Button zero, final Button uno, final Button due) {
		zero.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				zero.setBackgroundResource(R.drawable.redbutton);

			}
		});
		uno.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				uno.setBackgroundResource(R.drawable.redbutton);

			}
		});
		due.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				due.setBackgroundResource(R.drawable.redbutton);

			}
		});

	}

	/**
	 * La funzione reset() mi serve per resetare i bottoni al loro stato
	 * originale dopo che sono stati colorati di rosi
	 */
	public void reset() {
		zero.setBackgroundResource(R.drawable.emulk);
		uno.setBackgroundResource(R.drawable.emulk);
		due.setBackgroundResource(R.drawable.emulk);
		tre.setBackgroundResource(R.drawable.emulk);
	}

	@Override
	public void onStart() {
		super.onStart();
		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		client.connect();

		EasyTracker.getInstance(this).activityStart(this);
		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		Action viewAction = Action.newAction(
				Action.TYPE_VIEW, // TODO: choose an action type.
				"Play Page", // TODO: Define a title for the content shown.
				// TODO: If you have web page content that matches this app activity's content,
				// make sure this auto-generated web page URL is correct.
				// Otherwise, set the URL to null.
				Uri.parse("http://host/path"),
				// TODO: Make sure this auto-generated app URL is correct.
				Uri.parse("android-app://it.emulk.quizcuriosity/http/host/path")
		);
		AppIndex.AppIndexApi.start(client, viewAction);
	}

	@Override
	public void onStop() {
		super.onStop();
		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		Action viewAction = Action.newAction(
				Action.TYPE_VIEW, // TODO: choose an action type.
				"Play Page", // TODO: Define a title for the content shown.
				// TODO: If you have web page content that matches this app activity's content,
				// make sure this auto-generated web page URL is correct.
				// Otherwise, set the URL to null.
				Uri.parse("http://host/path"),
				// TODO: Make sure this auto-generated app URL is correct.
				Uri.parse("android-app://it.emulk.quizcuriosity/http/host/path")
		);
		AppIndex.AppIndexApi.end(client, viewAction);

		EasyTracker.getInstance(this).activityStop(this);
		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		client.disconnect();
	}

	// apro il database
	private void openDB() {
		myDB = new Database(this);
		myDB.open();

	}

	/* chiudo il DB su onDestroy */
	@Override
	protected void onDestroy() {
		super.onDestroy();
		closeDB();
	}

	private void closeDB() {
		myDB.close();

	}

}
/*
 * Intent logoIntent = new Intent(Play.this, Logo.class);
 * startActivity(logoIntent);
 */

