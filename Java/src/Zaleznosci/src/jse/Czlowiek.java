package Zaleznosci.src.jse;

public class Czlowiek {

	public String imie;
	private Kawa mojaZapamietanaKawa;
	
	public Czlowiek(Kawa kawa) {
		if(kawa != null)
			this.mojaZapamietanaKawa = kawa;
		else this.mojaZapamietanaKawa = new Kawa();
	}
	
	public Czlowiek() { }

	public void pijKaweUtworzonaLokalnie() {
		Kawa mojakawa = new Kawa();
		mojakawa.zaparz();
		mojakawa.wypij();
	}

	public void pijPrzezArgument(Kawa mojakawa) {
		if(mojakawa!=null) {
			mojakawa.zaparz();
			mojakawa.wypij();
		}		
	}
	
	public void pijKaweZapamietana() {
		this.mojaZapamietanaKawa.zaparz();
		this.mojaZapamietanaKawa.wypij();
	}
	
	public void setKawa(Kawa jakasKawa) {
		if(jakasKawa != null) this.mojaZapamietanaKawa = jakasKawa;
	}
}
