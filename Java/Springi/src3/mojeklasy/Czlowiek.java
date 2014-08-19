package mojeklasy;

public class Czlowiek {

	private INapoj mojNapoj;
	private String imie;
    private String adres;
	
	
	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public INapoj getMojNapoj() {
		return mojNapoj;
	}

	public void setMojNapoj(INapoj mojNapoj) {
		this.mojNapoj = mojNapoj;
	}

	public Czlowiek(String imie) {
		super();
		this.imie = imie;
	}

	public Czlowiek() {
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public void przedstawSie() {

		System.out.println("Czesc,jestem " + this.imie);

	}

	@Override
	public String toString(){
		String ret=this.imie;
		if(this.mojNapoj !=null) ret+=" pije napoj:"+ mojNapoj.toString();
		else ret+=" nic nie pije";
		
		return  ret;
	}
}
