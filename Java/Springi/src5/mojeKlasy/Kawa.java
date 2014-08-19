package mojeKlasy;

import org.springframework.stereotype.Component;

@Component("inapoj")
public class Kawa implements INapoj{
	public static int licznikKawy = 2;
	
	public Kawa(){
	System.out.println("Tworze kawê");
		licznikKawy--;
	}
	
	@Override
	public void zaparzNapoj() {
		System.out.println("Zaparzam Kawê");
	}

	@Override
	public void wypij() {
		System.out.println("Pijê pyszn¹ Kawê");
	}
public String toString(){
	return "kawê";
}
}
