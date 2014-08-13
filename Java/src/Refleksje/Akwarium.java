package Refleksje;

import java.util.ArrayList;
//klasa akwarium jest silnie powiazana z klas� Rybka - uzywa jej nazwy, powoduje to,ze jezeli bedziemy chciec np nazwe klasy Rybka to ma to wplyw na Akwarium!
//a tego warto nie chciec. Warto jest zatem zmienic to zeby akwarium przechowywalo cokolwiek, a nie Rybke, wiec trzeba stworzyc INTERFEJS!
// dlatego warto uzyc wzorca fabryka

public class Akwarium {
	// teraz interface ArrayList<Rybka> zawartosc = new ArrayList<>();
	ArrayList<ZwierzeAkwariowe> zawartosc = new ArrayList<>();

	public void uruchom() {
		for (ZwierzeAkwariowe r : zawartosc) {
			r.plyn();
		}
	}

	public void addAnimal(ZwierzeAkwariowe nazwa) {
		if (nazwa == null)
			return;								//aby wiedzia� co zrobi� gdy null pointer exeption

		zawartosc.add(nazwa);
	}

	public Akwarium() {
		/*
		 * this.addAnimal(new Rybka()); this.addAnimal(new Rybka()); To jest
		 * z�e, bo odwo�uje sie this.addAnimal(new Krewetka());
		 */

	}
}
