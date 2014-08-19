package Zaleznosci.src.jse;

public class Main {

	public static void main(String[] args) {
		
		Czlowiek ja = new Czlowiek();
		ja.imie = "Asia";

		System.out.println(" ver. 1 - obiekt tworzony lokalnie w metodzie");
		ja.pijKaweUtworzonaLokalnie();

		System.out.println(" ver. 2 - podanie obiektu przez argument metody");
	//	Kawa jakasNowaKawa = new Kawa();
	//	ja.pijPrzezArgument(jakasNowaKawa);		
		ja.pijPrzezArgument(new Kawa());
		
		System.out.println(" ver. 3 - podanie obiektu w konstruktorze i zapamietanie jako atrybut");
		Czlowiek ktos = new Czlowiek(new Kawa());
		ktos.pijKaweZapamietana();

		System.out.println(" ver. 4 - podanie obiektu w metodzie 'set' i zapamietanie jako atrybut");
		ktos.setKawa(new Kawa());
		ktos.pijKaweZapamietana();
		
	}

}
