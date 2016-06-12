package it.emulk.quizcuriosity;

import it.emulk.quizcuriosity.R;

import java.util.Random;

import com.google.analytics.tracking.android.EasyTracker;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Flag extends Activity {

	private static final String TAG = "Flag";
	/**
	 * per tenere traccia del tempo totale di gioco
	 */
	long startTime;
	long elapsedTime;
	int endTime;
	int Nperdite;
	int Nvittorie;
	/**
	 * tiene conto del numero delle perdite e lo visualizza al giocatore
	 */
	TextView nPerdite;
	TextView nVittorie;
	TextView Question;
	ImageView imageview;
	String randomString;
	Random rand = new Random();
	Cursor cursorlast;
	/**
	 * istanzio il database
	 */
	Database myDB;
	/**
	 * i quattro button che conterrano le varie risposte uno dei quatro sara
	 * corretto
	 */
	Button zero;
	Button uno;
	Button due;
	Button tre;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/* FULL SCREEN */
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// assing the xml layout
		setContentView(R.layout.logo);
		MobileAds.initialize(getApplicationContext(), "ca-app-pub-4209540176643828/3973226192");

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
		/**
		 * apro il database in lettura
		 */
		openDB();
		/**
		 * tengo traccia del tempo
		 */
		startTime = System.currentTimeMillis();
		nPerdite = (TextView) findViewById(R.id.nperdite);
		nVittorie = (TextView) findViewById(R.id.vittorie);
		Nperdite = perdite();
		Nvittorie = vittorie();
		nPerdite.setText(String.valueOf(Nperdite));
		nVittorie.setText(String.valueOf(Nvittorie));
		elapsedTime = 0;

		Log.d(TAG, "dopo il layout");

		Question = (TextView) findViewById(R.id.question);
		imageview = (ImageView) findViewById(R.id.LogoView);
		zero = (Button) findViewById(R.id.button4);
		uno = (Button) findViewById(R.id.button1);
		due = (Button) findViewById(R.id.button2);
		tre = (Button) findViewById(R.id.button3);

		imageview.setImageDrawable(getResources().getDrawable(
				(UtilityFlag.GetNewFlag())));

		uno.setText(randomString = UtilityFlag.LogoOracle());
		due.setText(randomString = UtilityFlag.LogoOracle());
		tre.setText(randomString = UtilityFlag.LogoOracle());
		wrong(uno, due, tre);
		zero.setText(UtilityFlag.RightAnswer());
		zero.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Nperdite = perdite();
				reset();
				imageview.setImageDrawable(getResources().getDrawable(
						UtilityFlag.GetNewFlag()));
				zero.setText(randomString = UtilityFlag.LogoOracle());
				uno.setText(UtilityFlag.RightAnswer());
				due.setText(randomString = UtilityFlag.LogoOracle());
				// wrong(uno);
				tre.setText(randomString = UtilityFlag.LogoOracle());
				wrong(zero, due, tre);
				// wrong(tre);
				uno.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {

						reset();
						imageview.setImageDrawable(getResources().getDrawable(
								UtilityFlag.GetNewFlag()));
						zero.setText(randomString = UtilityFlag.LogoOracle());
						uno.setText(randomString = UtilityFlag.LogoOracle());
						due.setText(randomString = UtilityFlag.LogoOracle());
						tre.setText(UtilityFlag.RightAnswer());
						wrong(zero, due, uno);
						tre.setOnClickListener(new View.OnClickListener() {

							@Override
							public void onClick(View v) {
								reset();
								imageview.setImageDrawable(getResources()
										.getDrawable(UtilityFlag.GetNewFlag()));
								zero.setText(UtilityFlag.RightAnswer());
								uno.setText(randomString = UtilityFlag.LogoOracle());
								due.setText(randomString = UtilityFlag.LogoOracle());
								tre.setText(randomString = UtilityFlag.LogoOracle());
								wrong(tre, uno, due);
								zero.setOnClickListener(new View.OnClickListener() {

									@Override
									public void onClick(View v) {
										reset();
										imageview
												.setImageDrawable(getResources()
														.getDrawable(
																UtilityFlag.GetNewFlag()));
										due.setText(UtilityFlag.RightAnswer());
										zero.setText(randomString = UtilityFlag
												.LogoOracle());
										uno.setText(randomString = UtilityFlag
												.LogoOracle());
										
										tre.setText(randomString = UtilityFlag
												.LogoOracle());
										wrong(tre, uno, zero);
										due.setOnClickListener(new View.OnClickListener() {

											@Override
											public void onClick(View v) {
												reset();
												imageview
														.setImageDrawable(getResources()
																.getDrawable(
																		UtilityFlag.GetNewFlag()));
												uno.setText(UtilityFlag
														.RightAnswer());
												zero.setText(randomString = UtilityFlag
														.LogoOracle());
												
												due.setText(randomString = UtilityFlag
														.LogoOracle());
												tre.setText(randomString = UtilityFlag
														.LogoOracle());
												wrong(tre, due, zero);
												uno.setOnClickListener(new View.OnClickListener() {

													@Override
													public void onClick(View v) {
														reset();
														imageview
																.setImageDrawable(getResources()
																		.getDrawable(
																				UtilityFlag.GetNewFlag()));
														zero.setText(UtilityFlag
																.RightAnswer());
														uno.setText(randomString = UtilityFlag
																.LogoOracle());
														due.setText(randomString = UtilityFlag
																.LogoOracle());
														tre.setText(randomString = UtilityFlag
																.LogoOracle());
														wrong(tre, uno, due);
														zero.setOnClickListener(new View.OnClickListener() {

															@Override
															public void onClick(
																	View v) {
																reset();
																imageview
																		.setImageDrawable(getResources()
																				.getDrawable(
																						UtilityFlag.GetNewFlag()));
																tre.setText(UtilityFlag
																		.RightAnswer());
																zero.setText(randomString = UtilityFlag
																		.LogoOracle());
																uno.setText(randomString = UtilityFlag
																		.LogoOracle());
																due.setText(randomString = UtilityFlag
																		.LogoOracle());
																
																wrong(zero,
																		uno,
																		due);
																tre.setOnClickListener(new View.OnClickListener() {

																	@Override
																	public void onClick(
																			View v) {
																		reset();
																		imageview
																				.setImageDrawable(getResources()
																						.getDrawable(
																								UtilityFlag.GetNewFlag()));
																		uno.setText(UtilityFlag
																				.RightAnswer());
																		zero.setText(randomString = UtilityFlag
																				.LogoOracle());
																		
																		due.setText(randomString = UtilityFlag
																				.LogoOracle());
																		tre.setText(randomString = UtilityFlag
																				.LogoOracle());
																		wrong(zero,
																				tre,
																				due);
																		uno.setOnClickListener(new View.OnClickListener() {

																			@Override
																			public void onClick(
																					View v) {
																				reset();
																				imageview
																						.setImageDrawable(getResources()
																								.getDrawable(
																										UtilityFlag.GetNewFlag()));
																				tre.setText(UtilityFlag
																						.RightAnswer());
																				zero.setText(randomString = UtilityFlag
																						.LogoOracle());
																				uno.setText(randomString = UtilityFlag
																						.LogoOracle());
																				due.setText(randomString = UtilityFlag
																						.LogoOracle());
																				
																				wrong(zero,
																						uno,
																						due);
																				tre.setOnClickListener(new View.OnClickListener() {

																					@Override
																					public void onClick(
																							View v) {
																						reset();
																						imageview
																								.setImageDrawable(getResources()
																										.getDrawable(
																												UtilityFlag.GetNewFlag()));
																						zero.setText(UtilityFlag
																								.RightAnswer());
																						uno.setText(randomString = UtilityFlag
																								.LogoOracle());
																						due.setText(randomString = UtilityFlag
																								.LogoOracle());
																						tre.setText(randomString = UtilityFlag
																								.LogoOracle());
																						wrong(tre,
																								uno,
																								due);
																						zero.setOnClickListener(new View.OnClickListener() {

																							@Override
																							public void onClick(
																									View v) {
																								reset();
																								imageview
																										.setImageDrawable(getResources()
																												.getDrawable(
																														UtilityFlag.GetNewFlag()));
																								due.setText(UtilityFlag
																										.RightAnswer());
																								zero.setText(randomString = UtilityFlag
																										.LogoOracle());
																								uno.setText(randomString = UtilityFlag
																										.LogoOracle());
																								
																								tre.setText(randomString = UtilityFlag
																										.LogoOracle());
																								wrong(tre,
																										uno,
																										zero);
																								due.setOnClickListener(new View.OnClickListener() {

																									@Override
																									public void onClick(
																											View v) {
																										reset();
																										imageview
																												.setImageDrawable(getResources()
																														.getDrawable(
																																UtilityFlag.GetNewFlag()));
																										uno.setText(UtilityFlag
																												.RightAnswer());
																										zero.setText(randomString = UtilityFlag
																												.LogoOracle());
																										
																										due.setText(randomString = UtilityFlag
																												.LogoOracle());
																										tre.setText(randomString = UtilityFlag
																												.LogoOracle());
																										wrong(tre,
																												due,
																												zero);
																										uno.setOnClickListener(new View.OnClickListener() {

																											@Override
																											public void onClick(
																													View v) {
																												reset();
																												imageview
																														.setImageDrawable(getResources()
																																.getDrawable(
																																		UtilityFlag.GetNewFlag()));
																												tre.setText(UtilityFlag
																														.RightAnswer());
																												zero.setText(randomString = UtilityFlag
																														.LogoOracle());
																												uno.setText(randomString = UtilityFlag
																														.LogoOracle());
																												due.setText(randomString = UtilityFlag
																														.LogoOracle());
																												
																												wrong(due,
																														uno,
																														zero);
																												tre.setOnClickListener(new View.OnClickListener() {

																													@Override
																													public void onClick(
																															View v) {
																														reset();
																														imageview
																																.setImageDrawable(getResources()
																																		.getDrawable(
																																				UtilityFlag.GetNewFlag()));
																														zero.setText(UtilityFlag
																																.RightAnswer());
																														uno.setText(randomString = UtilityFlag
																																.LogoOracle());
																														due.setText(randomString = UtilityFlag
																																.LogoOracle());
																														tre.setText(randomString = UtilityFlag
																																.LogoOracle());
																														wrong(due,
																																uno,
																																tre);
																														zero.setOnClickListener(new View.OnClickListener() {

																															@Override
																															public void onClick(
																																	View v) {
																																reset();
																																imageview
																																		.setImageDrawable(getResources()
																																				.getDrawable(
																																						UtilityFlag.GetNewFlag()));
																																tre.setText(UtilityFlag
																																		.RightAnswer());
																																zero.setText(randomString = UtilityFlag
																																		.LogoOracle());
																																uno.setText(randomString = UtilityFlag
																																		.LogoOracle());
																																due.setText(randomString = UtilityFlag
																																		.LogoOracle());
																																
																																wrong(due,
																																		uno,
																																		zero);
																																tre.setOnClickListener(new View.OnClickListener() {

																																	@Override
																																	public void onClick(
																																			View v) {
																																		reset();
																																		imageview
																																				.setImageDrawable(getResources()
																																						.getDrawable(
																																								UtilityFlag.GetNewFlag()));
																																		uno.setText(UtilityFlag
																																				.RightAnswer());
																																		zero.setText(randomString = UtilityFlag
																																				.LogoOracle());
																																		
																																		due.setText(randomString = UtilityFlag
																																				.LogoOracle());
																																		tre.setText(randomString = UtilityFlag
																																				.LogoOracle());
																																		wrong(due,
																																				tre,
																																				zero);
																																		uno.setOnClickListener(new View.OnClickListener() {

																																			@Override
																																			public void onClick(
																																					View v) {
																																				reset();
																																				imageview
																																						.setImageDrawable(getResources()
																																								.getDrawable(
																																										UtilityFlag.GetNewFlag()));
																																				tre.setText(UtilityFlag
																																						.RightAnswer());
																																				zero.setText(randomString = UtilityFlag
																																						.LogoOracle());
																																				uno.setText(randomString = UtilityFlag
																																						.LogoOracle());
																																				due.setText(randomString = UtilityFlag
																																						.LogoOracle());
																																				
																																				wrong(due,
																																						uno,
																																						zero);
																																				tre.setOnClickListener(new View.OnClickListener() {

																																					@Override
																																					public void onClick(
																																							View v) {
																																						reset();
																																						imageview
																																								.setImageDrawable(getResources()
																																										.getDrawable(
																																												UtilityFlag.GetNewFlag()));
																																						zero.setText(UtilityFlag
																																								.RightAnswer());
																																						uno.setText(randomString = UtilityFlag
																																								.LogoOracle());
																																						due.setText(randomString = UtilityFlag
																																								.LogoOracle());
																																						tre.setText(randomString = UtilityFlag
																																								.LogoOracle());
																																						wrong(due,
																																								uno,
																																								tre);
																																						zero.setOnClickListener(new View.OnClickListener() {

																																							@Override
																																							public void onClick(
																																									View v) {
																																								reset();
																																								imageview
																																										.setImageDrawable(getResources()
																																												.getDrawable(
																																														UtilityFlag.GetNewFlag()));
																																								due.setText(UtilityFlag
																																										.RightAnswer());
																																								zero.setText(randomString = UtilityFlag
																																										.LogoOracle());
																																								uno.setText(randomString = UtilityFlag
																																										.LogoOracle());
																																								
																																								tre.setText(randomString = UtilityFlag
																																										.LogoOracle());
																																								wrong(zero,
																																										uno,
																																										tre);
																																								due.setOnClickListener(new View.OnClickListener() {

																																									@Override
																																									public void onClick(

																																											View v) {
																																										reset();
																																										/**
																																										 * tengo
																																										 * traccia
																																										 * del
																																										 * tempo
																																										 * passato
																																										 * su
																																										 * questa
																																										 * activity
																																										 */
																																										elapsedTime = elapsedTime
																																												+ (System
																																														.currentTimeMillis() - startTime);
																																										updateTime(elapsedTime);
																																										imageview
																																												.setVisibility(View.INVISIBLE);
																																										Question.setText("Do you want to continue?");
																																										uno.setVisibility(View.INVISIBLE);
																																										tre.setVisibility(View.INVISIBLE);
																																										due.setText("Quit");
																																										due.setOnClickListener(new View.OnClickListener() {

																																											@Override
																																											public void onClick(
																																													View v) {
																																												Intent quit = new Intent(
																																														Flag.this,
																																														Play.class);
																																												startActivity(quit);

																																											}
																																										});
																																										zero.setText("Continue");
																																										zero.setOnClickListener(new View.OnClickListener() {

																																											@Override
																																											public void onClick(
																																													View v) {
																																												Intent more = new Intent(
																																														Flag.this,
																																														Flag.class);
																																												startActivity(more);

																																											}
																																										});
																																									}
																																								});
																																							}
																																						});
																																					}
																																				});
																																			}
																																		});
																																	}
																																});
																															}
																														});

																													}
																												});
																											}
																										});
																									}
																								});
																							}
																						});
																					}
																				});
																			}
																		});
																	}
																});
															}
														});
													}
												});

											}
										});
									}
								});
							}
						});
					}
				});

			}
		});

	}

	@Override
	public void onStart() {
		super.onStart();

		EasyTracker.getInstance(this).activityStart(this);
	}

	@Override
	public void onStop() {
		super.onStop();

		EasyTracker.getInstance(this).activityStop(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		closeDB();
	}

	/**
	 * istanzio il database, ora è pronto per essere usato
	 */
	public void openDB() {
		myDB = new Database(this);
		myDB.open();
	}

	/**
	 * chiudo il database
	 */
	private void closeDB() {
		myDB.close();

	}

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
				Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				vb.vibrate(100);
				zero.setBackgroundResource(R.drawable.redbutton);
				UpdatePerdite();
			}
		});
		uno.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				vb.vibrate(100);
				uno.setBackgroundResource(R.drawable.redbutton);
				UpdatePerdite();
			}
		});
		due.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				vb.vibrate(100);
				due.setBackgroundResource(R.drawable.redbutton);
				UpdatePerdite();
			}
		});
		int p = perdite();
		nPerdite.setText(String.valueOf(p));

	}

	/**
	 * La funzione reset() mi serve per resetare i bottoni al loro stato
	 * originale dopo che sono stati colorati di rosi
	 * 
	 */
	public void reset() {
		IncVittorie();
		zero.setBackgroundResource(R.drawable.emulk);
		uno.setBackgroundResource(R.drawable.emulk);
		due.setBackgroundResource(R.drawable.emulk);
		tre.setBackgroundResource(R.drawable.emulk);
		int p = vittorie();
		nVittorie.setText(String.valueOf(p));
	}

	/**
	 * incrementa di uno il numero delle perdeite ogni volta che perdo
	 * 
	 * @param elapsedTime
	 */
	private void IncPerdite() {
		int vittorie = 0;
		int perdite = 0;
		int tempo = 0;
		int obiettivi = 0;
		cursorlast = myDB.LastQuery();
		if (cursorlast.moveToLast()) {
			perdite = cursorlast.getInt(Database.COL_PERDITE) + 1;
			vittorie = cursorlast.getInt(Database.COL_VITTORIE);
			tempo = cursorlast.getInt(Database.COL_TEMPO);
			obiettivi = cursorlast.getInt(Database.COL_OBIETTIVI);

			myDB.insertRow(vittorie, perdite, tempo, obiettivi);

		} else {
			perdite = 1;
			vittorie = 0;
			tempo = 0;
			obiettivi = 0;
			myDB.insertRow(vittorie, perdite, tempo, obiettivi);
		}
		int p = perdite();
		nPerdite.setText(String.valueOf(p));

	}
	/**
	 * UpdatePerdite aggiorna i dati correnti ma a differenza di IncPerdite non va a inserire una nuova righa nel database ma usa una 
	 * l'ultima righa che e' stata inserita nel database
	 */
	private void UpdatePerdite() {
		int vittorie = 0;
		int perdite = 0;
		int tempo = 0;
		int obiettivi = 0;
		long rowID=0;
		cursorlast = myDB.LastQuery();
		if (cursorlast.moveToLast()) {
			rowID=cursorlast.getLong(Database.COL_ROWID);
			perdite = cursorlast.getInt(Database.COL_PERDITE) + 1;
			vittorie = cursorlast.getInt(Database.COL_VITTORIE);
			tempo = cursorlast.getInt(Database.COL_TEMPO);
			obiettivi = cursorlast.getInt(Database.COL_OBIETTIVI);
			myDB.updateRow(rowID,vittorie, perdite, tempo, obiettivi);

		} else {
			perdite = 1;
			myDB.insertRow(vittorie, perdite, tempo, obiettivi);
		}
		int p = perdite();
		nPerdite.setText(String.valueOf(p));

	}

	/**
	 * aggiorna il numero degli obiettivi sbloccati
	 * 
	 * @param Obiettivi
	 */
	private void updateObiettivi(int Obiettivi) {
		int tempo = 0;
		int perdite = 0;
		int vittorie = 0;
		int obiettivi = 0;
		cursorlast = myDB.LastQuery();
		if (cursorlast.moveToLast()) {
			perdite = cursorlast.getInt(Database.COL_PERDITE);
			vittorie = cursorlast.getInt(Database.COL_VITTORIE);

			tempo = cursorlast.getInt(Database.COL_TEMPO) + endTime;
			obiettivi = cursorlast.getInt(Database.COL_OBIETTIVI);
			if (obiettivi < Obiettivi) {
				obiettivi = Obiettivi;
			}
			myDB.insertRow(vittorie, perdite, tempo, obiettivi);
		} else {
			perdite = 0;
			vittorie = 0;
			tempo = endTime;
			obiettivi = Obiettivi;
			myDB.insertRow(vittorie, perdite, tempo, obiettivi);
		}
	}

	/**
	 * aggiorna il tempo totale di gioco
	 * 
	 * @param elapsedTime
	 */
	private void updateTime(long elapsedTime) {
		endTime = (int) elapsedTime / 1000;
		Log.v(TAG, "endTime = " + endTime);
		int tempo = 0;
		int perdite = 0;
		int vittorie = 0;
		int obiettivi = 0;
		cursorlast = myDB.LastQuery();
		if (cursorlast.moveToLast()) {
			perdite = cursorlast.getInt(Database.COL_PERDITE);
			vittorie = cursorlast.getInt(Database.COL_VITTORIE);

			tempo = cursorlast.getInt(Database.COL_TEMPO) + endTime;
			obiettivi = cursorlast.getInt(Database.COL_OBIETTIVI);
			myDB.insertRow(vittorie, perdite, tempo, obiettivi);
		} else {
			perdite = 0;
			vittorie = 0;
			tempo = endTime;
			obiettivi = 0;
			myDB.insertRow(vittorie, perdite, tempo, obiettivi);
		}
	}

	/**
	 * legge gli obbietti attuali sbloccati
	 * 
	 * @return
	 */
	private int attuali() {
		int Attuali;
		cursorlast = myDB.LastQuery();
		if (cursorlast.moveToLast()) {
			Attuali = cursorlast.getInt(Database.COL_OBIETTIVI);
			return Attuali;
		} else {
			return 0;
		}
	}

	/**
	 * aggiorna il numero delle perdite
	 * 
	 * @return
	 */
	public int perdite() {
		int P;
		Cursor cursorlast = myDB.LastQuery();
		if (cursorlast.moveToLast()) {
			P = cursorlast.getInt(Database.COL_PERDITE);
			return P;
		} else {
			return 0;
		}
	}

	public int vittorie() {
		int P;
		Cursor cursorlast = myDB.LastQuery();
		if (cursorlast.moveToLast()) {
			P = cursorlast.getInt(Database.COL_VITTORIE);
			return P;
		} else {
			return 0;
		}
	}

	/**
	 * funzione che incrementa le vittorie ovvero ogni volta che faccio una
	 * scelta giusta
	 * 
	 * @param elapsedTime2
	 */

	/* never used */
	public void IncVittorie() {
		int vittorie = 0;
		int perdite = 0;
		int tempo = 0;
		int obiettivi = 0;
		cursorlast = myDB.LastQuery();
		if (cursorlast.moveToLast()) {
			perdite = cursorlast.getInt(Database.COL_PERDITE);
			vittorie = cursorlast.getInt(Database.COL_VITTORIE) + 1;
			tempo = cursorlast.getInt(Database.COL_TEMPO);
			obiettivi = cursorlast.getInt(Database.COL_OBIETTIVI);

			myDB.insertRow(vittorie, perdite, tempo, obiettivi);

		} else {
			perdite = 0;
			vittorie = 1;
			tempo = 0;
			obiettivi = 0;
			myDB.insertRow(vittorie, perdite, tempo, obiettivi);
		}

	}

}
