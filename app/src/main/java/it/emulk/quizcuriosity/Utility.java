package it.emulk.quizcuriosity;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Utility extends Logo {
	static int Nscience;
	static int Ncar;
	static String rightanswer;
	/* per il debug, mi indica l'activity in esecuzione */
	private static final String TAG = "Utility";
	/**
	 * Sezione Social Network
	 */
	final static String Facebook = "Facebook";
	final static String Twitter = "Twitter";
	final static String Knowem = "Knowem";
	final static String Squido = "Squido";
	final static String Fiverr = "Fiverr";
	final static String WordPress = "WordPress";
	final static String Spoke = "Spoke";
	final static String Reddit = "Reddit";
	final static String Yahoo = "Yahoo";
	final static String Ebay = "Ebay";
	final static String Wikipedia = "Wikipedia";
	final static String Technorati = "Technorati";
	final static String Myspace = "Myspace";
	final static String Digg = "Digg";
	final static String Lastfm = "Last.fm";
	final static String Stumbleupon = "Stumbleupon";
	final static String Flicker = "Flicker";

	/**
	 * sezione rimanenze
	 * 
	 */
	final static String Apple = "Apple";
	final static String Google = "Google";
	final static String Ariel = "Ariel";
	final static String At = "AT&T";
	final static String Pepsi = "Pepsi";
	final static String Motorola = "Motorola";
	final static String IBM = "IBM";
	final static String Tux = "Tux";
	final static String Blender = "Blender";
	final static String Firefox = "Firefox";
	final static String Chromium = "Chromium";
	final static String Shell = "Shell";
	final static String Starbucks = "Starbucks";
	final static String Adobe = "Adobe";
	final static String Kfc = "Kfc";
	final static String Kodak = "Kodak";
	final static String Windows = "Windows";
	final static String Skol = "Skol";
	final static String Gameloft = "Gameloft";
	final static String McDonalds = "McDonald's";

	/**
	 * Sezione Abbigliamento
	 * 
	 */

	final static String Vuiton = "Louis Vuitton";
	final static String Armani = "Emporio Armani";
	final static String Chanel = "Chanel";
	final static String Diesel = "Diesel";
	final static String Eagle = "American Eagle";
	final static String Lacoste = "LaCoste";
	final static String Levis = "Levi's";
	final static String FredPerry = "Fred Perry";
	final static String Zara = "Zara";
	final static String Guess = "Guess";
	final static String NewBalance = "New Balance";
	final static String Timberland = "Timberland";
	final static String CalvinKlein = "Calvin Klein";
	final static String Quicksilver = "Quicksilver";
	final static String Burberry = "Burberry";
	final static String Champion = "Champion";
	final static String AntonyMorato = "Antony Morato";
	final static String GStar = "G-STAR RAW";
	final static String Dondup = "Dondup";
	final static String Adidas = "Adidas";
	final static String Nike = "Nike";
	final static String Reebok = "Reebok";
	final static String Puma = "Puma";

	/**
	 * Sezione Macchine
	 * */

	final static String Astonmartin = "Aston Martin";
	final static String Audi = "Audi";
	final static String Bentley = "Bentley";
	final static String Benz = "Benz";
	final static String BMV = "BMV";
	final static String Bugatti = "Bugatti";
	final static String Buick = "Buick";
	final static String Cadillac = "Cadillac";
	final static String Caterham = "Caterham";
	final static String Chevrolet = "Chevrolet";
	final static String Jaguar = "Jaguar";
	final static String Lamborghini = "Lamborghini";
	final static String Volkswagen = "Volkswagen";
	final static String Volvo = "Volvo";
	final static String Vauxhall = "Vauxhall Motors";
	final static String Chrysler = "Chrysler";
	final static String Koenigsegg = "Koenigsegg";
	final static String Citroen = "Citroen";
	final static String Corvette = "Corvette";
	final static String Dacia = "Dacia";
	final static String Daihatsu = "Daihatsu";
	final static String Dodge = "Dodge";
	final static String Ferrari = "Ferrari";
	final static String Fiat = "Fiat";
	final static String Fisker = "Fisker";
	final static String Ford = "Ford";
	final static String Holden = "Holden";
	final static String GMC = "GMC";
	final static String Honda = "Honda";
	final static String Infiniti = "Infiniti";
	final static String Jeep = "Jeep";
	final static String Isuzu = "Isuzu";
	final static String Kia = "Kia";
	final static String Lancia = "Lancia";
	final static String Land = "Land Rover";
	final static String Lexus = "Lexus";
	final static String Lotus = "Lotus";
	final static String Mazda = "Mazda";
	final static String McLaren = "McLaren";
	final static String Mini = "Mini";
	final static String Mitsubishi = "Mitsubishi";
	final static String Morgan = "Morgan";
	final static String Nissan = "Nissan";
	final static String Noble = "Noble";
	final static String Pagani = "Pagani";
	final static String Peugeot = "Peugeot";
	final static String Porsche = "Porsche";
	final static String Proton = "Proton";
	final static String Renault = "Renault";
	final static String Scion = "Scion";
	final static String Skoda = "Skoda";
	final static String Ram = "Dodge Ram";

	// //////////////////////////////////////////////////////////////////////////
	// // Obiettivi
	// /////////////////////////////////////////////////////////////////////////
	final static int Obiettivo1 = 1;
	final static int Obiettivo2 = 2;
	final static int Obiettivo3 = 3;
	final static int Obiettivo4 = 4;
	final static int Obiettivo5 = 5;
	final static int Obiettivo6 = 6;
	final static int Obiettivo7 = 7;
	final static int Obiettivo8 = 8;
	final static int Obiettivo9 = 10;
	final static int Obiettivo10 = 9;
	final static int Obiettivo11 = 11;
	final static int Obiettivo12 = 12;
	final static int Obiettivo13 = 13;
	final static int Obiettivo14 = 14;
	final static int Obiettivo15 = 15;
	final static int Obiettivo16 = 16;

	public final static String GetRest() {
		List<String> Rest = new ArrayList<String>();
		Rest.add(Utility.Adobe);
		Rest.add(Utility.Chromium);
		Rest.add(Utility.At);
		Rest.add(Utility.Motorola);
		Rest.add(Utility.Firefox);
		Rest.add(Utility.Tux);
		Rest.add(Utility.Kodak);
		Rest.add(Utility.Ariel);
		Rest.add(Utility.IBM);
		Rest.add(Utility.Kfc);
		Rest.add(Utility.Skol);
		Rest.add(Utility.Gameloft);
		Rest.add("Chrome");
		Rest.add("Explorer");
		Rest.add("Aple");
		Rest.add("Acer");
		Rest.add("Samsung");
		Rest.add("LG");
		Rest.add("Canyon");
		Rest.add("Pepsi");
		Rest.add("CocaCola");
		Rest.add("Shell");
		Rest.add("Starbucks");
		Rest.add("Playboy");
		Rest.add("Xbox");
		Rest.add("PlayStation");
		Rest.add("Blackberry");
		Rest.add("Amazon");
		Rest.add("Opera");
		Rest.add("PSP");

		
		
		
		
		Random random = new Random();
		String randomElement;
		int listSize = Rest.size();
		randomElement = Rest.get(random.nextInt(listSize));
		return randomElement;
	}

	public final static String GetSocial() {
		List<String> Social = new ArrayList<String>();
		Social.add(Utility.WordPress);
		Social.add(Utility.Knowem);
		Social.add(Utility.Fiverr);
		Social.add(Utility.Yahoo);
		Social.add(Utility.Ebay);
		Social.add(Utility.Technorati);
		Social.add(Utility.Myspace);
		Social.add(Utility.Digg);
		Social.add(Utility.Lastfm);
		Social.add(Utility.Stumbleupon);
		Social.add(Utility.Flicker);
		Social.add("Linkedin");
		Social.add("Vimeo");
		Social.add("Facebook");
		Social.add("YouTube");
		Social.add("Ning");
		Social.add("msn");
		Social.add("Yahoo!");
		Social.add("Blogger");
		Social.add("Twitter");
		Social.add("Bebo");
		Social.add("Badoo");
		Social.add("hi5");
		Social.add("Instagram");

		Random random = new Random();
		String randomElement;
		int listSize = Social.size();
		randomElement = Social.get(random.nextInt(listSize));
		return randomElement;

	}

	/**
	 * la funzione GetCar restituisce il nome di un auto a random dopo averla
	 * presa nella lista delle auto
	 * 
	 * @return
	 */
	public final static String GetCar() {
		List<String> Car = new ArrayList<String>();
		Car.add(Utility.Audi);
		Car.add(Utility.Astonmartin);
		Car.add(Utility.Benz);
		Car.add(Utility.BMV);
		Car.add(Utility.Bugatti);
		Car.add(Utility.Buick);
		Car.add(Utility.Cadillac);
		Car.add(Utility.Caterham);
		Car.add(Utility.Chevrolet);
		Car.add(Utility.Chrysler);
		Car.add(Utility.Citroen);
		Car.add(Utility.Corvette);
		Car.add(Utility.Dacia);
		Car.add(Utility.Daihatsu);
		Car.add(Utility.Dodge);
		Car.add(Utility.GMC);
		Car.add(Utility.Isuzu);
		Car.add(Utility.Kia);
		Car.add(Utility.Lancia);
		Car.add(Utility.Land);
		Car.add(Utility.Lexus);
		Car.add(Utility.Lotus);
		Car.add(Utility.Mazda);
		Car.add(Utility.McLaren);
		Car.add(Utility.Mini);
		Car.add(Utility.Mitsubishi);
		Car.add(Utility.Morgan);
		Car.add(Utility.Nissan);
		Car.add(Utility.Noble);
		Car.add(Utility.Pagani);
		Car.add(Utility.Peugeot);
		Car.add(Utility.Porsche);
		Car.add(Utility.Proton);
		Car.add(Utility.Renault);
		Car.add(Utility.Scion);
		Car.add(Utility.Skoda);
		Car.add(Utility.Ram);
		Car.add("Great Wall Moto");
		Car.add("Elfin");
		Car.add("Farbio");
		Car.add("Ferrari");
		Car.add(Utility.Fiat);
		Car.add(Utility.Fisker);
		Car.add(Utility.Ford);
		Car.add("Gumpert");
		Car.add("HSV");
		Car.add("Hamann");
		Car.add(Utility.Holden);
		Car.add(Utility.Honda);
		Car.add("Hummer");
		Car.add("Hyundai");
		Car.add(Utility.Infiniti);
		Car.add("Isuzu");
		Car.add(Utility.Jaguar);
		Car.add(Utility.Jeep);
		Car.add("KTM");
		Car.add("Kia");
		Car.add("Kleemann");
		Car.add("Koenigsegg");
		Car.add("LCC");
		Car.add("Lada");
		Car.add(Utility.Lamborghini);
		Car.add("Lancia ");
		Car.add("Land Rover ");
		Car.add("Leblanc");
		Car.add("Lexus");
		Car.add("Lincoln");
		Car.add("Lobini");
		Car.add("Loremo");
		Car.add("Lotus");
		Car.add("Mansory");
		Car.add("Marcos");
		Car.add("Maserati");
		Car.add("Maybach");
		Car.add("Mazda");
		Car.add("Mazel");
		Car.add("Mercedes-Benz ");
		Car.add("Mindset");
		Car.add("Mini");
		Car.add("Mitsubishi");
		Car.add("Morgan");
		Car.add("Nismo");
		Car.add("Nissan");
		Car.add("Noble");
		Car.add("ORCA");
		Car.add("Oldsmobile");
		Car.add("Opel");
		Car.add("Pagani");
		Car.add("Panoz");
		Car.add("Peugeot");
		Car.add("Pininfarina");
		Car.add("Plymouth");
		Car.add("Pontiac");
		Car.add("Porsche");
		Car.add("Proton");
		Car.add("Renault");
		Car.add("Rinspeed");
		Car.add("Rover");
		Car.add("Saab");
		Car.add("Saleen");
		Car.add("Saturn");
		Car.add("Scion");
		Car.add("Seat");
		Car.add("Skoda");
		Car.add("Smart");
		Car.add("Spyker");
		Car.add("Startech");
		Car.add("Stola");
		Car.add("Strosek");
		Car.add("Subaru");
		Car.add("Suzuki");
		Car.add("Tesla");
		Car.add("Think");
		Car.add("Toyota");
		Car.add("Tramontana");
		Car.add("Valmet");
		Car.add("Vauxhall");
		Car.add("Venturi");
		Car.add("Volkswagen");
		Car.add(Utility.Volvo);
		Car.add("Wald");
		Car.add("Wiesmann");
		Car.add("Zagato");

		Random random = new Random();
		String randomElement;
		int listSize = Car.size();
		randomElement = Car.get(random.nextInt(listSize));
		return randomElement;
	}

	/**
	 * La funzione GetAbbigliamento, quando chiamata, da in modo casuale un
	 * elemento della lista in output
	 * 
	 * @return
	 */
	public final static String GetAbbigliamento() {
		List<String> Abbigliamento = new ArrayList<String>();

		Abbigliamento.add(Utility.Armani);
		Abbigliamento.add(Utility.Adidas);
		Abbigliamento.add(Utility.AntonyMorato);
		Abbigliamento.add("American Eagle");
		Abbigliamento.add(Utility.Burberry);
		Abbigliamento.add(Utility.Diesel);
		Abbigliamento.add(Utility.CalvinKlein);
		Abbigliamento.add(Utility.Champion);
		Abbigliamento.add(Utility.Chanel);
		Abbigliamento.add(Utility.Dondup);
		Abbigliamento.add(Utility.NewBalance);
		Abbigliamento.add(Utility.FredPerry);
		Abbigliamento.add(Utility.GStar);
		Abbigliamento.add(Utility.Guess);
		Abbigliamento.add(Utility.Lacoste);
		Abbigliamento.add(Utility.Levis);
		Abbigliamento.add("LouisVuitton");
		Abbigliamento.add(Utility.Timberland);
		Abbigliamento.add(Utility.Zara);
		Abbigliamento.add(Utility.Nike);
		Abbigliamento.add(Utility.Reebok);
		Abbigliamento.add(Utility.Puma);
		Abbigliamento.add("Pinterest");
		Abbigliamento.add("Fila");
		Abbigliamento.add("Rolex");
		Abbigliamento.add("Umbro");
		Abbigliamento.add("Kappa");
		Abbigliamento.add("Errea");
		Abbigliamento.add("Dandelion");
		Abbigliamento.add("Omega");
		Abbigliamento.add("Converse");
		Abbigliamento.add("Hello Kitty");
		
		Random random = new Random();
		String randomElement;
		int listSize = Abbigliamento.size();
		randomElement = Abbigliamento.get(random.nextInt(listSize));
		return randomElement;

	}




	/**
	 * l'oracolo che decide i loghi e le risposte giuste
	 * asegna la risposta appropriata ad ogni bottone, tre delle quatro risposte sarano errate,
	 * soltanto una sara giusta
	 * 
	 * @return
	 */
	static int carnumber = 38;
	//static int startSocialNumber = 24;
	static int endSocialNumber = 59;
	//static int startDress = 35;
	static int endDress = 77;
	public final static String LogoOracle() {
		String element;
		
		if (Ncar <= carnumber) {
			element = GetCar();
			while (element.equalsIgnoreCase(rightanswer)) {
				Log.v(TAG, "dentro oracolo " + element + " risposta giusta "
						+ rightanswer);
				element = GetCar();
			}
		} else if (Ncar > carnumber && Ncar <= endSocialNumber) {
			element = GetSocial();
			while (element.equalsIgnoreCase(rightanswer)) {
				Log.v(TAG, "dentro oracolo " + element + " risposta giusta "
						+ rightanswer);
				element = GetSocial();
			}
		} else if (Ncar > endSocialNumber && Ncar <= endDress) {
			element = GetAbbigliamento();
			while (element.equalsIgnoreCase(rightanswer)) {
				Log.v(TAG, "dentro oracolo " + element + " risposta giusta "
						+ rightanswer);
				element = GetAbbigliamento();
			}
		} else {
			element = GetRest();
			while (element.equalsIgnoreCase(rightanswer)) {
				Log.v(TAG, "dentro oracolo " + element + " risposta giusta "
						+ rightanswer );
				element = GetRest();
			}
		}
		return element;
	}

	/*
	 * Array con le risposte giuste
	 * la funzione RightAnsware restituisce la risposta corretta,
	 * e viene assegnata a un solo bottone, poiche' la risposta corretta
	 * può essere una sola
	 */
	public final static String RightAnswer() {
		String[] caranswer = {
		/* car */
				"Bentley", "Buick", "Infiniti", "Koenigsegg", "Dodge ram", "Vauchall",
				"Volkswagen", "Pontiac", "Jaguar", "Holden", "Great Wall Moto",
				"Smart", "FAW","Chevrolet","Acura","Lexus","Corvette","Mercury",
				"Bugatti", "Audi","Impala", "Mustang","Toyota","Peugeot","Subaru","Chery",
				"Volvo","Seat","Opel","Maserati","Mini","Mercedes","Lancia",
				"Renault","Mitsubishi","Citroen","Suzuki","Chrysler","Alfa Romeo",
				/* Social */
				"Wikipedia", "Wordpress", "Squido", "Reddit", "Myspace",
				"Digg", "Flickr", "Technorati", "Stumbleupon","Vimeo","Linkedin",
				"Bebo","Orkut","Xing","Skype","vKontakte","Badoo","Nasza Klasa",
				"Tuenti","Hyves","Instagram",

				/* Abbiligamento */

				"Adidas", "American Eagle", "LouisVuitton", "Reebok",
				"Chanel", "Puma","Pinterest","Lacoste","Fredperry",
				"Fila","Rolex","Umbro","Kappa","Errea","Dandelion",
				"Omega","Converse","Hello Kitty",

				/* resto */
				"Adobe", "Apple", "AT&T", "Firefox", "Gameloft", "Kfc",
				"Kodak", "Last.fm", "Blender", "McDonalds", "Motorola", "Nike",
				"Pepsi", "Shell", "Skol", "Starbucks", "Tux","Playboy","Xbox",
				"PlayStation","Blackberry","Amazon","Opera","RedBull","Pringles",
				"Michelin","Nvidia","Dove","Twitter","Android","Bic","Bluetooth",
				"Baidu","Explorer","Gmail"
				

		};

		rightanswer = caranswer[Ncar];
		return rightanswer;
	}
	
	/* Array con tutti i png dei loghi
	 * che si trovano in drawable
	 */
	public final static int GetNewCar() {
		int[] getcar = {
		/**
		 * solo le auto, e sono 39
		 * 13 x 3
		 */
				R.drawable.bentley, R.drawable.buick, R.drawable.infiniti,
				R.drawable.koenigsegg, R.drawable.ram, R.drawable.vauxhall,
				R.drawable.volkswagen, R.drawable.pontiac, R.drawable.jaguar,
				R.drawable.holden, R.drawable.great, R.drawable.smart,
				R.drawable.faw,R.drawable.chevrolet,R.drawable.acura,
				R.drawable.lexus, R.drawable.corvette, R.drawable.mercury,
				R.drawable.bugatti, R.drawable.audi,R.drawable.impala,
				R.drawable.mustang,R.drawable.toyota,R.drawable.peugeot,
				R.drawable.subaru,R.drawable.chery,R.drawable.volvo,
				R.drawable.seat,R.drawable.opel,R.drawable.maserati,
				R.drawable.mini,R.drawable.mercedenz,R.drawable.lancia,
				R.drawable.renault,R.drawable.mitsubishi,R.drawable.citroen,
				R.drawable.suzuki,R.drawable.chrysler,R.drawable.alfaromeo,

				/* social 21*/
				R.drawable.wikipedia, R.drawable.wordpress, R.drawable.squidoo,
				R.drawable.reddit, R.drawable.myspace, R.drawable.digg,
				R.drawable.flickr, R.drawable.technorati, R.drawable.stumbleupon,
				R.drawable.vimeo,R.drawable.linkedin, R.drawable.bebo,
				R.drawable.orkut,R.drawable.xing,R.drawable.skype,
				R.drawable.vkontakte,R.drawable.badoo,R.drawable.naszaklasa,
				R.drawable.tuenti,R.drawable.hyves,R.drawable.instagram,

				/* abbigliamento 18*/
				R.drawable.adidas, R.drawable.americaneagle,R.drawable.louisvuitton, 
				R.drawable.reebok, R.drawable.chanel,R.drawable.puma,
				R.drawable.pinterest,R.drawable.lacoste,R.drawable.fredperry,
				R.drawable.fila,R.drawable.rolex,R.drawable.umbro,
				R.drawable.kappa,R.drawable.errea,R.drawable.dandelion,
				R.drawable.omega,R.drawable.converse,R.drawable.hellokitty,

				/**
				 * the rest 35
				 */
				R.drawable.adobe, R.drawable.apple, R.drawable.att,
				R.drawable.firefox, R.drawable.gameloft, R.drawable.kfc,
				R.drawable.kodak, R.drawable.lastfm, R.drawable.blender,
				R.drawable.mcdonalds, R.drawable.motorola, R.drawable.nike,
				R.drawable.pepsi,R.drawable.shell, R.drawable.skol,
				R.drawable.starbucks,R.drawable.tux,R.drawable.playboy,
				R.drawable.xbox,R.drawable.playstation,R.drawable.blackberry,
				R.drawable.amazon,R.drawable.opera, R.drawable.redbull,
				R.drawable.pringles,R.drawable.michelin, R.drawable.nvidia,
				R.drawable.dove, R.drawable.twitter,R.drawable.android,
				R.drawable.bic,R.drawable.bluetooth,R.drawable.baidu,
				R.drawable.explorer,R.drawable.gmail

		};

		Random random = new Random();

		int randomElement;
		int size = getcar.length;
		Ncar = random.nextInt(size);
		randomElement = getcar[Ncar];
		return randomElement;
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
	 * originale dopo che sono stati colorati di rosso
	 * 
	 */
	public final void reset() {
		zero.setBackgroundResource(R.drawable.emulk);
		uno.setBackgroundResource(R.drawable.emulk);
		due.setBackgroundResource(R.drawable.emulk);
		tre.setBackgroundResource(R.drawable.emulk);
	}
	
	
	/*
	public final static String WrongAnswer() {
		List<String> Answer = new ArrayList<String>();
		Answer.add("Yellow Dwarf");
		Answer.add("John Dalton");
		Answer.add("True");
		Answer.add("False");
		Answer.add("Sound Waves");
		Answer.add("Hot");
		Answer.add("Cold");
		Answer.add("Large");
		Answer.add("Dark Matter");
		Answer.add("Oxygen");
		Answer.add("Argon");
		Answer.add("Carbon");

		Random random = new Random();
		String randomElement;
		int listSize = Answer.size();

		randomElement = Answer.get(random.nextInt(listSize));
		return randomElement;
	}
	
	public final static String GetTechnolgy() {
		String[] getScience = {
				"When was the first laptop made?",
				"When the Apple iPhone first become available?",
				"When Nintendo was founded?",
				"When was the first iPod sold?",
				"When was invented YouTube?",
				"when did Pack-Man arrive?",
				"When was the satellite Sputniklaunched?",
				"When was the creator of Donkey Kong and Mario born?",
				"How many computer languages are in use?",
				"When was founded Apple computer by Steve Jobs, Steve Wozniak and Ronald Wayne?",
				"When Jobs became the chairman and CEO of Apple?",
				"When Tim Berners-Lee established the convention of www?",

				"What metal is present in hemaglobin?",
				"What is a barometer used for measuring?",
				"What country was the physicist james maxwell born in?",
				"What is the speed of light? ",
				"Adolf Hitler was the dictator of what country",
				"In which country was born Alan Turing?",
				"Who discovered phosphorus?", "All radioactivity is man-made?",
				"Are electrons smaller then atoms?",
				"Lasers work by focusing?",
				"Nanotechnolgy deal with things that are extremely...",
				"Which gas makes up most of the Earth's atmosphere?",
				"What is the main function of red blood Cells?",

		};

		Random random = new Random();

		String randomElement;
		int size = getScience.length;
		Nscience = random.nextInt(size);
		randomElement = getScience[Nscience];
		return randomElement;
	}
	
	
	public final static String GetAnswer() {
		String[] getAnswer = { "1981", "2007", "1889", "2001", "2005", "1980",
				"1957", "1952", "2000", "1976", "1996", "1989",

				"Iron", "Atmospheric pressure", "Scotland", "3 × 10^8  m/s",
				"Germany", "England", "Hennig Brand", "No", "yes",
				"e.m radiation", "small", "Nitrogen", "Carry Oxigen"

		};

		String randomElement;
		randomElement = getAnswer[Nscience];
		return randomElement;
	}
*/

}
