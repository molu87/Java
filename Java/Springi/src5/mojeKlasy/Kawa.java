package mojeKlasy;

import org.springframework.stereotype.Component;

@Component("inapoj")
public class Kawa implements INapoj{
	public static int licznikKawy = 2;
	
	public Kawa(){
	System.out.println("Tworze kaw�");
		licznikKawy--;
	}
	
	@Override
	public void zaparzNapoj() {
		System.out.println("Zaparzam Kaw�");
	}

	@Override
	public void wypij() {
		System.out.println("Pij� pyszn� Kaw�");
	}
public String toString(){
	return "kaw�";
}
}
