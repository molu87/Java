package mojeKlasy;

import org.springframework.stereotype.Component;


public class Herbata implements INapoj {

	
public Herbata(){
	System.out.println("Tworze herbat�");
}
	

	@Override
	public void zaparzNapoj() {
		System.out.println("Zaparzam Herbatk�");
	}

	@Override
	public void wypij() {
		System.out.println("Pij� ciep�� Herbatk�");
	}

	public String toString() {
		return "Herbat�";
	}
}