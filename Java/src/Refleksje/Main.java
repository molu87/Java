package Refleksje;

public class Main {

	public static void main(String[] args) {
		Akwarium a = new Akwarium();

		a.addAnimal(FabrykaZwierzatek.tworzeZwierzatko("Refleksje.Krewetka"));
		a.addAnimal(FabrykaZwierzatek.tworzeZwierzatko("Refleksje.Rybka"));
		a.addAnimal(FabrykaZwierzatek.tworzeZwierzatko("Refleksje.Kot"));
		a.uruchom();
		System.out.println(a.getClass().getName());
	}
}
