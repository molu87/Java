package Refleksje;

import java.util.Scanner;

public class Skaner {

	public String skanerStart() {
		System.out.println("Wpisz nazw� klasy, jakiej obiekt chcesz utworzy�.");

		Scanner skaner = new Scanner(System.in);
		String polecenie = skaner.nextLine();
		skaner.close();
		return polecenie.trim();
	}
}
