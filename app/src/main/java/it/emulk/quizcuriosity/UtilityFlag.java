package it.emulk.quizcuriosity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.util.Log;

public class UtilityFlag extends Activity {
	/* per il debug, mi indica l'activity in esecuzione */
	private static final String TAG = "UtilityFlag";

	static int carnumber = 24;
	// static int startSocialNumber = 24;
	static int endSocialNumber = 35;
	// static int startDress = 35;
	static int endDress = 41;
	static int Nflag = 0;
	static String rightanswer;

	/**
	 * l'oracolo che decide le auto e le risposte giuste asegna la risposta
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
		"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla",
				"Antarctica", "Argentina", "Armenia", "Aruba", "Australia",
				"Austria", "Azerbaijan",
				/* B */
				"Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus",
				"Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
				"Botswana", "Brazil", "Bulgaria", "Burma", "Burundi",
				/* C */
				"Cambodia", "Cameroon", "Canada", "Cape Verde", "Chad",
				"Chile", "China", "Colombia", "Comoros", "Costa Rica",
				"Cote D'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic",
				/* D */
				"Denmark", "Djibouti", "Dominica",
				/* E */
				"Ecuador", "Egypt", "El Salvador", "Eritrea", "Estonia",
				"Ethiopia",
				/* F */
				"Fiji", "Finland", "France",
				/* G */
				"Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar",
				"Greece", "Greenland", "Grenada", "Guadeloupe", "Guam",
				"Guatemala", "Guinea", "Guyana",
				/* H */
				"Haiti", "Honduras", "Hong Kong", "Hungary",
				/* I */
				"Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland",
				"Israel", "Italy",
				/* J */
				"Jamaica", "Japan", "Jordan",
				/* K */
				"Kazakhstan","Kenya","Kiribati","Korea (North)","Korea (South)","Kuwait","Kyrgyzstan",
				/* L */
				"Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg",
				/* M */
				"Macau","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Martinique",
				"Mauritania","Mauritius","Mayotte","Mexico","Micronesia","Moldova","Monaco","Mongolia",
				"Montserrat","Morocco","Mozambique","Myanmar",
				/* N */
				"Namibia","NATO","Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger",
				"Nigeria","Niue","Norway",
				/* O */
				"Oman",
				/* P */
				"Pakistan","Palau","Palestine","Panama","Paraguay","Peru","Philippines",
				"Pitcairn","Poland","Portugal","Puerto Rico",
				/* Q */
				"Qatar",
				/* R */
				"Romania","Rwanda",
				/* S */
				"San Marino","Saudi Arabia","Senegal","Singapore","Slovenia","Somalia","South Africa",
				"Spain","Sri Lanka","Sudan","Suriname","Sweden","Switzerland","Syria",
				/* T */
				"Taiwan","Tajikistan","Tanzania","Thailand","Togo","Tunisia","Turkey",
				/* U */
				"Uganda","Ukraine","United Kingdom","United States","Uruguay","USSR","Uzbekistan",
				/* V */
				"Vanuatu","Venezuela","Vietnam",
				/* Y */
				"Yugoslavia",
				/* Z */
				"Zambia","Zimbabwe"
				
		};

		rightanswer = caranswer[Nflag];
		return rightanswer;
	}

	public final static int GetNewFlag() {
		int[] getcar = {
		/**
		 * solo le auto
		 */
		R.drawable.afghanistan, R.drawable.albania, R.drawable.algeria,
				R.drawable.andorra, R.drawable.angola, R.drawable.anguilla,
				R.drawable.antarctica, R.drawable.argentina,
				R.drawable.armenia, R.drawable.aruba, R.drawable.australia,
				R.drawable.austria, R.drawable.azerbaijan,
				/* B */
				R.drawable.bahamas, R.drawable.bahrain, R.drawable.bangladesh,
				R.drawable.barbados, R.drawable.belarus, R.drawable.belgium,
				R.drawable.belize, R.drawable.benin, R.drawable.bermuda,
				R.drawable.bhutan, R.drawable.bolivia, R.drawable.botswana,
				R.drawable.brazil, R.drawable.bulgaria, R.drawable.burma,
				R.drawable.burundi,
				/* C */
				R.drawable.cambodia, R.drawable.cameroon, R.drawable.canada,
				R.drawable.capeverde, R.drawable.chad, R.drawable.chile,
				R.drawable.china, R.drawable.colombia, R.drawable.comoros,
				R.drawable.costarica, R.drawable.cotedivoire,
				R.drawable.croatia, R.drawable.cuba, R.drawable.cyprus,
				R.drawable.czechrepublic,
				/* D */
				R.drawable.denmark, R.drawable.djibouti, R.drawable.dominica,
				/* E */
				R.drawable.ecuador, R.drawable.egypt, R.drawable.elsalvador,
				R.drawable.eritrea, R.drawable.estonia, R.drawable.ethiopia,
				/* F */
				R.drawable.fiji, R.drawable.finland, R.drawable.france,
				/* G */
				R.drawable.gabon, R.drawable.gambia, R.drawable.georgia,
				R.drawable.germany, R.drawable.ghana, R.drawable.gibraltar,
				R.drawable.greece, R.drawable.greenland, R.drawable.grenada,
				R.drawable.guadeloupe, R.drawable.guam, R.drawable.guatemala,
				R.drawable.guinea, R.drawable.guyana,
				/* H */
				R.drawable.haiti, R.drawable.honduras, R.drawable.hongkong,
				R.drawable.hungary,
				/* I */
				R.drawable.iceland, R.drawable.india, R.drawable.indonesia,
				R.drawable.iran, R.drawable.iraq, R.drawable.ireland,
				R.drawable.israel, R.drawable.italy,
				/* J */
				R.drawable.jamaica, R.drawable.japan, R.drawable.jordan,
				/* K */
				R.drawable.kazakhstan,R.drawable.kenya,R.drawable.kiribati,R.drawable.korean,R.drawable.koreas,R.drawable.kuwait,R.drawable.kyrgyzstan,
				/* L */
				R.drawable.laos,R.drawable.latvia,R.drawable.lebanon,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.liechtenstein,R.drawable.lithuania,
				R.drawable.luxembourg,
				/* M */
				R.drawable.macau,R.drawable.madagascar,R.drawable.malawi,R.drawable.malaysia,R.drawable.maldives,R.drawable.mali,R.drawable.malta,R.drawable.martinique,
				R.drawable.mauritania,R.drawable.mauritius,R.drawable.mayotte,R.drawable.mexico,R.drawable.micronesia,R.drawable.moldova,R.drawable.monaco,
				R.drawable.mongolia,R.drawable.montserrat,R.drawable.morocco,R.drawable.mozambique,R.drawable.myanmar,
				/* N */
				R.drawable.namibia,R.drawable.nato,R.drawable.nauru,R.drawable.nepal,R.drawable.netherlands,R.drawable.newzealand,R.drawable.nicaragua,R.drawable.niger,
				R.drawable.nigeria,R.drawable.niue,R.drawable.norway,
				/* O */
				R.drawable.oman,
				/* P */
				R.drawable.pakistan,R.drawable.palau,R.drawable.palestine,R.drawable.panama,R.drawable.paraguay,R.drawable.peru,R.drawable.philippines,
				R.drawable.pitcairn,R.drawable.poland,R.drawable.portugal,R.drawable.puertorico,
				/* Q */
				R.drawable.qatar,
				/* R */
				R.drawable.romania,R.drawable.rwanda,
				/* S*/
				R.drawable.sanmarino,R.drawable.saudiarabia,R.drawable.senegal,R.drawable.singapore,R.drawable.slovenia,R.drawable.somalia,R.drawable.southafrica,
				R.drawable.spain,R.drawable.srilanka,R.drawable.sudan,R.drawable.suriname,R.drawable.sweden,R.drawable.switzerland,R.drawable.syria,
				/* T */
				R.drawable.taiwan,R.drawable.tajikistan,R.drawable.tanzania,R.drawable.thailand,R.drawable.togo,R.drawable.tunisia,R.drawable.turkey,
				/* U */
				R.drawable.uganda,R.drawable.ukraine,R.drawable.unitedkingdom,R.drawable.unitedstates,R.drawable.uruguay,R.drawable.ussr,R.drawable.uzbekistan,
				/* V */
				R.drawable.vanuatu,R.drawable.venezuela,R.drawable.vietnam,
				/* Y */
				R.drawable.yugoslavia,
				/* Z */
				R.drawable.zambia,R.drawable.zimbabwe
				

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
		Answer.add("Afghanistan");
		Answer.add("Albania");
		Answer.add("Algeria");
		Answer.add("Andorra");
		Answer.add("Angola");
		Answer.add("Anguilla");
		Answer.add("Antarctica");
		Answer.add("Argentina");
		Answer.add("Armenia");
		Answer.add("Aruba");
		Answer.add("Australia");
		Answer.add("Austria");
		Answer.add("Azerbaijan");
		Answer.add("Bahamas");
		Answer.add("Bahrain");
		Answer.add("Bangladesh");
		Answer.add("Barbados");
		Answer.add("Belarus");
		Answer.add("Belgium");
		Answer.add("Belize");
		Answer.add("Benin");
		Answer.add("Bermuda");
		Answer.add("Bhutan");
		Answer.add("Bolivia");
		Answer.add("Botswana");
		Answer.add("Brazil");
		Answer.add("Bulgaria");
		Answer.add("Burma");
		Answer.add("Burundi");
		Answer.add("Cambodia");
		Answer.add("Cameroon");
		Answer.add("Canada");
		Answer.add("Cape Verde");
		Answer.add("Chad");
		Answer.add("Chile");
		Answer.add("China");
		Answer.add("Colombia");
		Answer.add("Comoros");
		Answer.add("Costa Rica");
		Answer.add("Cote D'Ivoire");
		Answer.add("Croatia");
		Answer.add("Cuba");
		Answer.add("Cyprus");
		Answer.add("Czech Republic");
		Answer.add("Denmark");
		Answer.add("Djibouti");
		Answer.add("Dominica");
		Answer.add("Ecuador");
		Answer.add("Egypt");
		Answer.add("El Salvador");
		Answer.add("Eritrea");
		Answer.add("Estonia");
		Answer.add("Ethiopia");
		Answer.add("Fiji");
		Answer.add("Finland");
		Answer.add("France");
		Answer.add("Gabon");
		Answer.add("Gambia");
		Answer.add("Georgia");
		Answer.add("Germany");
		Answer.add("Ghana");
		Answer.add("Gibraltar");
		Answer.add("Greece");
		Answer.add("Greenland");
		Answer.add("Grenada");
		Answer.add("Guadeloupe");
		Answer.add("Guam");
		Answer.add("Guatemala");
		Answer.add("Guinea");
		Answer.add("Guyana");
		Answer.add("Haiti");
		Answer.add("Honduras");
		Answer.add("Hong Kong ");
		Answer.add("Hungary");
		Answer.add("Iceland");
		Answer.add("India");
		Answer.add("Indonesia");
		Answer.add("Iran");
		Answer.add("Iraq");
		Answer.add("Ireland");
		Answer.add("Israel");
		Answer.add("Italy");
		Answer.add("Jamaica");
		Answer.add("Japan");
		Answer.add("Jordan");
		Answer.add("Kazakhstan");
		Answer.add("Kenya");
		Answer.add("Kiribati");
		Answer.add("Korea (North)");
		Answer.add("Korea (South)");
		Answer.add("Kuwait");
		Answer.add("Kyrgyzstan");
		Answer.add("Laos");
		Answer.add("Latvia");
		Answer.add("Lebanon");
		Answer.add("Lesotho");
		Answer.add("Liberia");
		Answer.add("Libya");
		Answer.add("Liechtenstein");
		Answer.add("Lithuania");
		Answer.add("Luxembourg");
		Answer.add("Macau");
		Answer.add("Madagascar");
		Answer.add("Malawi");
		Answer.add("Malaysia");
		Answer.add("Maldives");
		Answer.add("Mali");
		Answer.add("Malta");
		Answer.add("Martinique");
		Answer.add("Mauritania");
		Answer.add("Mauritius");
		Answer.add("Mayotte");
		Answer.add("Mexico");
		Answer.add("Micronesia");
		Answer.add("Moldova");
		Answer.add("Monaco");
		Answer.add("Mongolia");
		Answer.add("Montserrat");
		Answer.add("Morocco");
		Answer.add("Mozambique");
		Answer.add("Myanmar");
		Answer.add("Namibia");
		Answer.add("NATO");
		Answer.add("Nauru");
		Answer.add("Nepal");
		Answer.add("Netherlands");
		Answer.add("New Zealand");
		Answer.add("Nicaragua");
		Answer.add("Niger");
		Answer.add("Nigeria");
		Answer.add("Niue");
		Answer.add("Norway");
		Answer.add("Oman");
		Answer.add("Pakistan");
		Answer.add("Palau");
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
		
		
		Answer.add("Romania");
		Answer.add("Rwanda");
		Answer.add("San Marino");
		Answer.add("Saudi Arabia");
		Answer.add("Senegal");
		Answer.add("Singapore");
		Answer.add("Slovenia");
		Answer.add("Somalia");
		Answer.add("South Africa");
		Answer.add("Spain");
		Answer.add("Sri Lanka");
		Answer.add("Sudan");
		Answer.add("Suriname");
		Answer.add("Sweden");
		Answer.add("Switzerland");
		Answer.add("Syria");
		
		
		Answer.add("Taiwan");
		Answer.add("Tajikistan");
		Answer.add("Tanzania");
		Answer.add("Thailand");
		Answer.add("Togo");
		Answer.add("Tunisia");
		Answer.add("Turkey");
		Answer.add("Uganda");
		Answer.add("Ukraine");
		Answer.add("United Kingdom");
		Answer.add("United States");
		Answer.add("Uruguay");
		Answer.add("USSR ");
		Answer.add("Uzbekistan");
		Answer.add("Vanuatu");
		Answer.add("Venezuela");
		Answer.add("Vietnam");
		Answer.add("Yugoslavia");
		Answer.add("Zambia");
		Answer.add("Zimbabwe");

		Random random = new Random();
		String randomElement;
		int listSize = Answer.size();

		randomElement = Answer.get(random.nextInt(listSize));
		return randomElement;
	}

}