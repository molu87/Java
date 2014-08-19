package mojeKlasy;

import org.springframework.stereotype.Component;


public class Herbata implements INapoj {

	
public Herbata(){
	System.out.println("Tworze herbatê");
}
	

	@Override
	public void zaparzNapoj() {
		System.out.println("Zaparzam Herbatkê");
	}

	@Override
	public void wypij() {
		System.out.println("Pijê ciep³¹ Herbatkê");
	}

	public String toString() {
		return "Herbatê";
	}
}