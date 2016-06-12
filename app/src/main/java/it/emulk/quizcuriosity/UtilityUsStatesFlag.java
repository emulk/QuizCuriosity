package it.emulk.quizcuriosity;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UtilityUsStatesFlag extends Activity {
	/* per il debug, mi indica l'activity in esecuzione */
	private static final String TAG = "UtilityUsStatesFlag";

	static int carnumber = 24;
	// static int startSocialNumber = 24;
	static int endSocialNumber = 35;
	// static int startDress = 35;
	static int endDress = 41;
	static int Nflag = 0;
	static String rightanswer;

	/**
	 * l'oracolo che decide le bandiere e le risposte giuste asegna la risposta
	 * appropriata ad ogni bottone (sbagliato)
	 * 
	 * @return
	 */

	public final static String LogoOracle() {
		String element;
		element = WrongCountry();
		
		Log.v(TAG,"Dentro oracolo "+ element   );
		while (element.equalsIgnoreCase(rightanswer)) {
			Log.v(TAG, "dentro oracolo " + element + " risposta giusta "
					+ rightanswer );
			element = WrongCountry();
		}

		return element;
	}

	public final static String RightAnswer() {
		String[] caranswer = {
		/* car */
		"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
				"Connecticut", "Delaware", "Florida", "Georgia", "Hawaii",
				"Idaho", "Illinois",
				"Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana",
				"Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
				"Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
				"New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota",
				"Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
				"South Carolina", "South Dakota", "Tennessee", "Texas", "Utah",
				"Vermont", "Virginia", "Washington",
				"West Virginia", "Wisconsin", "Wyoming"
				
		};

		rightanswer = caranswer[Nflag];
		return rightanswer;
	}

	public final static int GetNewFlag() {
		int[] getcar = {
		/**
		 *
		 */
				R.drawable.alabama,	R.drawable.alaska,R.drawable.arizona,
				R.drawable.arkansas,R.drawable.california,R.drawable.colorado,
				R.drawable.connecticut,	R.drawable.delaware,R.drawable.florida,
				R.drawable.georgiaus,	R.drawable.hawaii,R.drawable.idaho,
				R.drawable.illinois,R.drawable.indiana,	R.drawable.iowa,
				R.drawable.kansas,R.drawable.kentucky, R.drawable.louisiana, R.drawable.maine,
				R.drawable.maryland, R.drawable.massachusetts, R.drawable.michigan,
				R.drawable.minnesota, R.drawable.mississippi, R.drawable.missouri,
				R.drawable.montana, R.drawable.nebraska, R.drawable.nevada,
				R.drawable.newhampshire,
				R.drawable.newjersey, R.drawable.newmexico, R.drawable.newyork,
				R.drawable.northcarolina, R.drawable.northdakota, R.drawable.ohio,
				R.drawable.oklahoma, R.drawable.oregon, R.drawable.pennsylvania,
				R.drawable.rhodeisland, R.drawable.southcarolina,
				R.drawable.southdakota, R.drawable.tennessee, R.drawable.texas,
				R.drawable.utah,
				R.drawable.vermont, R.drawable.virginia, R.drawable.washington,
				R.drawable.westvirginia, R.drawable.wisconsin, R.drawable.wyoming

		};

		Random random = new Random();

		int randomElement;
		int size = getcar.length;
		Nflag = random.nextInt(size);
		randomElement = getcar[Nflag];
		return randomElement;
	}

	/**
	 * Array con tutti i nomi dei paesi, queste sarano le risposte sbagliate,
	 * quelle prese a caso
	 * 
	 * @return
	 */
	public final static String WrongCountry() {
		List<String> Answer = new ArrayList<String>();
		Answer.add("Alabama");
		Answer.add("Alaska");
		Answer.add("Arizona");
		Answer.add("Arkansas");
		Answer.add("California");
		Answer.add("Colorado");
		Answer.add("Connecticut");
		Answer.add("Delaware");
		Answer.add("Florida");
		Answer.add("Georgia");
		Answer.add("Hawaii");
		Answer.add("Idaho");
		Answer.add("Illinois");
		Answer.add("Indiana");
		Answer.add("Iowa");
		Answer.add("Kansas");
		Answer.add("Kentucky");
		Answer.add("Louisiana");
		Answer.add("Maine");
		Answer.add("Maryland");
		Answer.add("Massachusetts");
		Answer.add("Michigan");
		Answer.add("Minnesota");
		Answer.add("Mississippi");
		Answer.add("Missouri");
		Answer.add("Montana");
		Answer.add("Nebraska");
		Answer.add("Nevada");
		Answer.add("New Hampshire");
		Answer.add("New Jersey");
		Answer.add("New Mexico");
		Answer.add("New York");
		Answer.add("North Carolina");
		Answer.add("North Dakota");
		Answer.add("Ohio");
		Answer.add("Oklahoma");
		Answer.add("Oregon");
		Answer.add("Pennsylvania");
		Answer.add("Rhode Island");
		Answer.add("South Dakota");
		Answer.add("Tennessee");
		Answer.add("Texas");
		Answer.add("Utah");
		Answer.add("Vermont");
		Answer.add("Virginia");
		Answer.add("Washington");
		Answer.add("West Virginia");
		Answer.add("Wisconsin");
		Answer.add("Wyoming");
		Answer.add("Canada");
		Answer.add("Eritrea");
		Answer.add("Estonia");
		Answer.add("Ethiopia");
		Answer.add("Fiji");
		Answer.add("Finland");
		Answer.add("Iceland");
		Answer.add("India");
		Answer.add("Indonesia");
		Answer.add("Iran");
		Answer.add("Liberia");
		Answer.add("Libya");
		Answer.add("Liechtenstein");
		Answer.add("Lithuania");
		Answer.add("Luxembourg");
		Answer.add("Micronesia");
		Answer.add("Moldova");
		Answer.add("Monaco");
		Answer.add("Mongolia");
		Answer.add("Montserrat");
		Answer.add("Morocco");
		Answer.add("Mozambique");
		Answer.add("Myanmar");
		Answer.add("Palestine");
		Answer.add("Panama");
		Answer.add("Paraguay");
		Answer.add("Peru");
		Answer.add("Philippines");
		Answer.add("Pitcairn");
		Answer.add("Poland");
		Answer.add("Portugal");
		Answer.add("Puerto Rico");
		Answer.add("Qatar");
		Answer.add("Reunion");
		Answer.add("Somalia");
		Answer.add("South Africa");
		Answer.add("Spain");
		Answer.add("Sri Lanka");
		Answer.add("Sudan");
		Answer.add("Suriname");
		Answer.add("Venezuela");


		Random random = new Random();
		String randomElement;
		int listSize = Answer.size();

		randomElement = Answer.get(random.nextInt(listSize));
		return randomElement;
	}

}
