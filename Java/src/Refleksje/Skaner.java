package Refleksje;

import java.util.Scanner;

public class Skaner {

	public String skanerStart() {
		System.out.println("Wpisz nazwê klasy, jakiej obiekt chcesz utworzyæ.");

		Scanner skaner = new Scanner(System.in);
		String polecenie = skaner.nextLine();
		skaner.close();
		return polecenie.trim();
	}
}
