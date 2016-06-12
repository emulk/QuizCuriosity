package it.emulk.quizcuriosity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.util.Log;

public class UtilityCapital {
	/* per il debug, mi indica l'activity in esecuzione */
	private static final String TAG = "UtilityCapital";
	
	static int Nflag = 0;
	static String rightanswer;
	static String rightanswerC;

	public final static String WrongCountry() {
		List<String> Answer = new ArrayList<String>();
		/* A States */
		Answer.add("Kabul");
		Answer.add("Tirana");
		Answer.add("Algiers");
		Answer.add("Andorra la Vella");
		Answer.add("Luanda");
		Answer.add("Saint John's");
		// Answer.add("Antarctica");
		Answer.add("Buenos Aires");
		Answer.add("Yerevan");
		// Answer.add("Aruba");
		Answer.add("Canberra");
		Answer.add("Vienna");
		Answer.add("Baku");
		/* B states */
		Answer.add("Nassau");
		Answer.add("Al-Manamah");
		Answer.add("Dhaka");
		Answer.add("Bridgetown");
		Answer.add("Minsk");
		Answer.add("Brussels");
		Answer.add("Belmopan");
		Answer.add("Porto-Novo");
		// Answer.add("Bermuda");
		Answer.add("Thimphu");
		Answer.add("Sucre");
		Answer.add("Gaborone");
		Answer.add("Brasilia");
		Answer.add("Sofia");
		// Answer.add("Burma");
		Answer.add("Bujumbura");
		/* C States */
		Answer.add("Phnom Penh");
		Answer.add("Yaounde");
		Answer.add("Ottawa");
		Answer.add("Praia");
		Answer.add("N'Djamena");
		Answer.add("Santiago");
		Answer.add("Beijing");
		Answer.add("Bogota");
		Answer.add("Moroni");
		Answer.add("San Jose");
		Answer.add("Abidjan");
		Answer.add("Zagreb");
		Answer.add("Havana");
		Answer.add("Nicosia");
		Answer.add("Prague");
		/* D States */
		Answer.add("Copenhagen");
		Answer.add("Djibouti City");
		Answer.add("Roseau");
		/* E States */
		Answer.add("Quito");
		Answer.add("Cairo");
		Answer.add("San Salvador");
		Answer.add("Asmara");
		Answer.add("Tallinn");
		Answer.add("Addis Ababa");
		/* F States */
		Answer.add("Suva");
		Answer.add("Helsinki");
		Answer.add("Paris");
		/* G States */
		Answer.add("Libreville");
		Answer.add("Banjul");
		Answer.add("Tbilisi");
		Answer.add("Berlin");
		Answer.add("Accra");
		// Answer.add("Gibraltar");
		Answer.add("Athens");
		Answer.add("Saint George's");
		// Answer.add("Grenada");
		// Answer.add("Guadeloupe");
		// Answer.add("Guam");
		Answer.add("Guatemala City");
		Answer.add("Conakry");
		Answer.add("Georgetown");
		/* H States */
		Answer.add("Port-au-Prince");
		Answer.add("Tegucigalpa");
		// Answer.add("Hong Kong ");
		Answer.add("Budapest");
		/* I States */
		Answer.add("Reykjavik");
		Answer.add("New Delhi");
		Answer.add("Jakarta");
		Answer.add("Tehran");
		Answer.add("Baghdad");
		Answer.add("Dublin");
		Answer.add("Jerusalem");
		Answer.add("Rome");
		/* J States */
		Answer.add("Kingston");
		Answer.add("Tokyo");
		Answer.add("Amman");
		/* K States */
		Answer.add("Astana");
		Answer.add("Nairobi");
		Answer.add("Karawa Atoll");
		Answer.add("Pyongyang");
		Answer.add("Seoul");
		Answer.add("Kuwait City");
		Answer.add("Bishkek");
		/* L Stataes */
		Answer.add("Vientiane");
		Answer.add("Riga");
		Answer.add("Beirut");
		Answer.add("Maseru");
		Answer.add("Monrovia");
		Answer.add("Tripoli");
		Answer.add("Vaduz");
		Answer.add("Vilnius");
		Answer.add("Luxembourg");
		/* M States */
		// Answer.add("Macau");
		Answer.add("Antananarivo");
		Answer.add("Lilongwe");
		Answer.add("Kuala Lumpur");
		Answer.add("Male");
		Answer.add("Bamako");
		Answer.add("Valletta");
		Answer.add("Nouakchott");
		Answer.add("Port Louis");
		// Answer.add("Mauritius");
		// Answer.add("Mayotte");
		Answer.add("Mexico City");
		Answer.add("Palikir");
		Answer.add("Chisinau");
		Answer.add("Monaco");
		Answer.add("Ulaanbaatar");
		// Answer.add("Montserrat");
		Answer.add("Rabat");
		Answer.add("Maputo");
		Answer.add("Rangoon");
		/* N States */
		Answer.add("Windhoek");
		// Answer.add("NATO");
		Answer.add("Yaren District");
		Answer.add("Kathmandu");
		Answer.add("Amsterdam");
		Answer.add("Wellington");
		Answer.add("Managua");
		Answer.add("Niamey");
		Answer.add("Abuja");
		// Answer.add("Niue");
		Answer.add("Oslo");
		/* O */
		Answer.add("Muscat");
		/* P */
		Answer.add("Islamabad");
		Answer.add("Melekeok");
		// Answer.add("Palestine");
		Answer.add("Panama City");
		Answer.add("Asuncion");
		Answer.add("Lima");
		Answer.add("Manila");
		// Answer.add("Pitcairn");
		Answer.add("Warsaw");
		Answer.add("Lisbon");
		// Answer.add("Puerto Rico");
		/* Q States */
		Answer.add("Doha");
		/* R States */
		// Answer.add("Reunion");
		Answer.add("Bucharest");
		Answer.add("Kigali");
		/* S States */
		Answer.add("San Marino");
		Answer.add("Riyadh");
		Answer.add("Dakar");
		Answer.add("Singapore");
		Answer.add("Ljubljana");
		Answer.add("Mogadishu");
		Answer.add("Pretoria");
		Answer.add("Madrid");
		Answer.add("Colombo");
		Answer.add("Khartoum");
		Answer.add("Paramaribo");
		Answer.add("Stockholm");
		Answer.add("Bernd");
		Answer.add("Damascus");
		/* T States */
		Answer.add("Taipei");
		Answer.add("Dushanbe");
		Answer.add("Dodoma");
		Answer.add("Bangkok");
		Answer.add("Lome");
		Answer.add("Tunis");
		Answer.add("Ankara");
		/* U States */
		Answer.add("Kampala");
		Answer.add("Kyiv");
		Answer.add("London");
		Answer.add("Washington D.C.");
		Answer.add("Montevideo");
		// Answer.add("USSR ");
		Answer.add("Tashkent");
		/* V States */
		Answer.add("Port-Vila");
		Answer.add("Caracas");
		Answer.add("Hanoi");
		// Answer.add("Yugoslavia");
		Answer.add("Lusaka");
		Answer.add("Harare");

		Random random = new Random();
		String randomElement;
		int listSize = Answer.size();

		randomElement = Answer.get(random.nextInt(listSize));
		return randomElement;
	}
	
	
	
	public final static String RightCapital() {
		String[] rightcapital = {
		/* A States */
		"Kabul",
		"Tirana",
		"Algiers",
		"Andorra la Vella",
		"Luanda",
		"Saint John's",
		// "Antarctica"
		"Buenos Aires",
		"Yerevan",
		// "Aruba"
		"Canberra",
		"Vienna",
		"Baku",
		/* B states */
		"Nassau",
		"Al-Manamah",
		"Dhaka",
		"Bridgetown",
		"Minsk",
		"Brussels",
		"Belmopan",
		"Porto-Novo",
		// "Bermuda"
		"Thimphu",
		"Sucre",
		"Gaborone",
		"Brasilia",
		"Sofia",
		// "Burma"
		"Bujumbura",
		/* C States */
		"Phnom Penh",
		"Yaounde",
		"Ottawa",
		"Praia",
		"N'Djamena",
		"Santiago",
		"Beijing",
		"Bogota",
		"Moroni",
		"San Jose",
		"Abidjan",
		"Zagreb",
		"Havana",
		"Nicosia",
		"Prague",
		/* D States */
		"Copenhagen",
		"Djibouti City",
		"Roseau",
		/* E States */
		"Quito",
		"Cairo",
		"San Salvador",
		"Asmara",
		"Tallinn",
		"Addis Ababa",
		/* F States */
		"Suva",
		"Helsinki",
		"Paris",
		/* G States */
		"Libreville",
		"Banjul",
		"Tbilisi",
		"Berlin",
		"Accra",
		// "Gibraltar"
		"Athens",
		"Saint George's",
		// "Grenada"
		// "Guadeloupe"
		// "Guam"
		"Guatemala City",
		"Conakry",
		"Georgetown",
		/* H States */
		"Port-au-Prince",
		"Tegucigalpa",
		// "Hong Kong "
		"Budapest",
		/* I States */
		"Reykjavik",
		"New Delhi",
		"Jakarta",
		"Tehran",
		"Baghdad",
		"Dublin",
		"Jerusalem",
		"Rome",
		/* J States */
		"Kingston",
		"Tokyo",
		"Amman",
		/* K States */
		"Astana",
		"Nairobi",
		"Karawa Atoll",
		"Pyongyang",
		"Seoul",
		"Kuwait City",
		"Bishkek",
		/* L Stataes */
		"Vientiane",
		"Riga",
		"Beirut",
		"Maseru",
		"Monrovia",
		"Tripoli",
		"Vaduz",
		"Vilnius",
		"Luxembourg",
		/* M States */
		// "Macau"
		"Antananarivo",
		"Lilongwe",
		"Kuala Lumpur",
		"Male",
		"Bamako",
		"Valletta",
		"Nouakchott",
		"Port Louis",
		// "Mauritius"
		// "Mayotte"
		"Mexico City",
		"Palikir",
		"Chisinau",
		"Monaco",
		"Ulaanbaatar",
		// "Montserrat"
		"Rabat",
		"Maputo",
		"Rangoon",
		/* N States */
		"Windhoek",
		// "NATO"
		"Yaren District",
		"Kathmandu",
		"Amsterdam",
		"Wellington",
		"Managua",
		"Niamey",
		"Abuja",
		// "Niue"
		"Oslo",
		/* O */
		"Muscat",
		/* P */
		"Islamabad",
		"Melekeok",
		// "Palestine"
		"Panama City",
		"Asuncion",
		"Lima",
		"Manila",
		// "Pitcairn"
		"Warsaw",
		"Lisbon",
		// "Puerto Rico"
		/* Q States */
		"Doha",
		/* R States */
		// "Reunion"
		"Bucharest",
		"Kigali",
		/* S States */
		"San Marino",
		"Riyadh",
		"Dakar",
		"Singapore",
		"Ljubljana",
		"Mogadishu",
		"Pretoria",
		"Madrid",
		"Colombo",
		"Khartoum",
		"Paramaribo",
		"Stockholm",
		"Bernd",
		"Damascus",
		/* T States */
		"Taipei",
		"Dushanbe",
		"Dodoma",
		"Bangkok",
		"Lome",
		"Tunis",
		"Ankara",
		/* U States */
		"Kampala",
		"Kyiv",
		"London",
		"Washington D.C.",
		"Montevideo",
		// "USSR "
		"Tashkent",
		/* V States */
		"Port-Vila",
		"Caracas",
		"Hanoi",
		// "Yugoslavia"
		"Lusaka",
		"Harare"
		};

		rightanswerC = rightcapital[Nflag];
		return rightanswerC;
	}
	
	public final static String RightAnswer() {
		String[] flaganswer = {
		/* car */
		"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla",
				/*"Antarctica",*/ "Argentina", "Armenia", /*"Aruba",*/ "Australia",
				"Austria", "Azerbaijan",
				/* B */
				"Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus",
				"Belgium", "Belize", "Benin", /*"Bermuda",*/ "Bhutan", "Bolivia",
				"Botswana", "Brazil", "Bulgaria", /*"Burma",*/ "Burundi",
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
				"Gabon", "Gambia", "Georgia", "Germany", "Ghana", /*"Gibraltar",*/
				"Greece", "Greenland", /*"Grenada",*/ /*"Guadeloupe",*/ /*"Guam",*/
				"Guatemala", "Guinea", "Guyana",
				/* H */
				"Haiti", "Honduras", /*"Hong Kong",*/ "Hungary",
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
				/*"Macau",*/"Madagascar","Malawi","Malaysia","Maldives","Mali","Malta",/*"Martinique",*/
				"Mauritania","Mauritius",/*"Mayotte",*/"Mexico","Micronesia","Moldova","Monaco","Mongolia",
				/*"Montserrat",*/"Morocco","Mozambique","Myanmar",
				/* N */
				"Namibia",/*"NATO",*/"Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger",
				"Nigeria",/*"Niue",*/"Norway",
				/* O */
				"Oman",
				/* P */
				"Pakistan","Palau",/*"Palestine",*/"Panama","Paraguay","Peru","Philippines",
				/*"Pitcairn",*/"Poland","Portugal",/*"Puerto Rico",*/
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
				"Uganda","Ukraine","United Kingdom","United States","Uruguay",/*"USSR",*/"Uzbekistan",
				/* V */
				"Vanuatu","Venezuela","Vietnam",
				/* Y */
				/*"Yugoslavia",*/
				/* Z */
				"Zambia","Zimbabwe"
				
		};

		rightanswer = flaganswer[Nflag];
		return rightanswer;
	}

	public final static int GetNewFlag() {
		int[] getflag = {
		/**
		 * solo le auto
		 */
		R.drawable.afghanistan, R.drawable.albania, R.drawable.algeria,
				R.drawable.andorra, R.drawable.angola, R.drawable.anguilla,
				/*R.drawable.antarctica,*/ R.drawable.argentina,
				R.drawable.armenia, /*R.drawable.aruba,*/ R.drawable.australia,
				R.drawable.austria, R.drawable.azerbaijan,
				/* B */
				R.drawable.bahamas, R.drawable.bahrain, R.drawable.bangladesh,
				R.drawable.barbados, R.drawable.belarus, R.drawable.belgium,
				R.drawable.belize, R.drawable.benin, /*R.drawable.bermuda,*/
				R.drawable.bhutan, R.drawable.bolivia, R.drawable.botswana,
				R.drawable.brazil, R.drawable.bulgaria,/* R.drawable.burma,*/
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
				R.drawable.germany, R.drawable.ghana, /*R.drawable.gibraltar,*/
				R.drawable.greece, R.drawable.greenland, /*R.drawable.grenada,*/
				/*R.drawable.guadeloupe,*/ /*R.drawable.guam,*/ R.drawable.guatemala,
				R.drawable.guinea, R.drawable.guyana,
				/* H */
				R.drawable.haiti, R.drawable.honduras, /*R.drawable.hongkong,*/
				R.drawable.hungary,
				/* I */
				R.drawable.iceland, R.drawable.india, R.drawable.indonesia,
				R.drawable.iran, R.drawable.iraq, R.drawable.ireland,
				R.drawable.israel, R.drawable.italy,
				/* J */
				R.drawable.jamaica, R.drawable.japan, R.drawable.jordan,
				/* K */
				R.drawable.kazakhstan, R.drawable.kenya, R.drawable.kiribati,
				R.drawable.korean, R.drawable.koreas, R.drawable.kuwait,
				R.drawable.kyrgyzstan,
				/* L */
				R.drawable.laos, R.drawable.latvia, R.drawable.lebanon,
				R.drawable.lesotho, R.drawable.liberia, R.drawable.libya,
				R.drawable.liechtenstein, R.drawable.lithuania,
				R.drawable.luxembourg,
				/* M */
				/*R.drawable.macau,*/ R.drawable.madagascar, R.drawable.malawi,
				R.drawable.malaysia, R.drawable.maldives, R.drawable.mali,
				R.drawable.malta, /*R.drawable.martinique,*/ R.drawable.mauritania,
				R.drawable.mauritius, /*R.drawable.mayotte, */R.drawable.mexico,
				R.drawable.micronesia, R.drawable.moldova, R.drawable.monaco,
				R.drawable.mongolia, /*R.drawable.montserrat,*/ R.drawable.morocco,
				R.drawable.mozambique, R.drawable.myanmar,
				/* N */
				R.drawable.namibia, /*R.drawable.nato,*/ R.drawable.nauru,
				R.drawable.nepal, R.drawable.netherlands,
				R.drawable.newzealand, R.drawable.nicaragua, R.drawable.niger,
				R.drawable.nigeria, /*R.drawable.niue,*/ R.drawable.norway,
				/* O */
				R.drawable.oman,
				/* P */
				R.drawable.pakistan, R.drawable.palau, /*R.drawable.palestine,*/
				R.drawable.panama, R.drawable.paraguay, R.drawable.peru,
				R.drawable.philippines, /*R.drawable.pitcairn,*/ R.drawable.poland,
				R.drawable.portugal, /*R.drawable.puertorico,*/
				/* Q */
				R.drawable.qatar,
				/* R */
				R.drawable.romania, R.drawable.rwanda,
				/* S */
				R.drawable.sanmarino, R.drawable.saudiarabia,
				R.drawable.senegal, R.drawable.singapore, R.drawable.slovenia,
				R.drawable.somalia, R.drawable.southafrica, R.drawable.spain,
				R.drawable.srilanka, R.drawable.sudan, R.drawable.suriname,
				R.drawable.sweden, R.drawable.switzerland, R.drawable.syria,
				/* T */
				R.drawable.taiwan, R.drawable.tajikistan, R.drawable.tanzania,
				R.drawable.thailand, R.drawable.togo, R.drawable.tunisia,
				R.drawable.turkey,
				/* U */
				R.drawable.uganda, R.drawable.ukraine,
				R.drawable.unitedkingdom, R.drawable.unitedstates,
				R.drawable.uruguay, /*R.drawable.ussr, */R.drawable.uzbekistan,
				/* V */
				R.drawable.vanuatu, R.drawable.venezuela, R.drawable.vietnam,
				/* Y */
				/*R.drawable.yugoslavia,*/
				/* Z */
				R.drawable.zambia, R.drawable.zimbabwe

		};

		Random random = new Random();

		int randomElement;
		int size = getflag.length;
		Nflag = random.nextInt(size);
		randomElement = getflag[Nflag];
		return randomElement;
	}
	
	
	
	
	public final static String LogoOracle() {
		String element;
		element = WrongCountry();
		
		Log.v(TAG,"Dentro oracolo "+ element   );
		while (element.equalsIgnoreCase(rightanswerC)) {
			Log.v(TAG, "dentro oracolo " + element + " risposta giusta "
					+ rightanswerC );
			element = WrongCountry();
		}

		return element;
	}

}