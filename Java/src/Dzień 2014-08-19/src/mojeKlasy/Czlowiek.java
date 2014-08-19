package mojeKlasy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Czlowiek {
	private String imie;
	private INapoj mojNapoj;
	private Adres mojAdres;
	
	public Adres getMojAdres() {
		return mojAdres;
	}
	public void setMojAdres(Adres mojAdres) {
		this.mojAdres = mojAdres;
	}
	public INapoj getMojNapoj() {
		return mojNapoj;
	}
	public void setMojNapoj(INapoj mojNapoj) {
		this.mojNapoj = mojNapoj;
		mojNapoj.przygotuj();
	}
	public void przedstawSie(){
		System.out.println("Czesc, jestem "+ this.imie);
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public Czlowiek(){	
	}
	public Czlowiek(String imie){
		this.imie = imie;
	}
	@Override
	public String toString(){
		String ret = this.imie;
		if (this.mojNapoj != null)
			ret += " pije napoj: "+mojNapoj.toString();
		else ret += " nic nie pije";
		
		if (this.mojAdres != null) {
			ret += " Adres: "+ mojAdres.toString();
		} else ret += " bezadresowiec";
		return ret;
	}
	/*@Override
		public String toString(){
			return "Moje imie to: "+imie;
		}*/
	/*@Override
	public String toString(){
		return "CZLOWIEK";
	}*/
}
