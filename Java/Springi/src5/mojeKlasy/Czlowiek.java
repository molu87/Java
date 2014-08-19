package mojeKlasy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("Tomasz")
public class Czlowiek {

	private Adres mojAdres;
	private String imie;
	INapoj mojNapoj;

	public Adres getMojAdres() {
		return mojAdres;
	}

	public void setMojAdres(Adres mojAdres) {
		this.mojAdres = mojAdres;
	}

	public INapoj getMojNapoj() {
		return mojNapoj;
	}

	// @Autowired
	public void setMojNapoj(INapoj mojNapoj) {
		this.mojNapoj = mojNapoj;
		mojNapoj.zaparzNapoj();
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public void przedstawSie() {
		System.out.println("Czesc, jestem " + this.imie);
	}

	public Czlowiek() {
	}

	public Czlowiek(String imie) {
		this.imie = imie;
	}

	@Override
	public String toString() {
		String ret = this.imie;
		if (this.mojNapoj != null)
			ret += " pije napój:" + mojNapoj.toString();
		else
			ret += "nic nie pije";

		if (this.mojAdres != null) {
			ret += " Adres: " + mojAdres.toString();
		} else
			ret += "Bezdomny";

		return ret;
	}
}