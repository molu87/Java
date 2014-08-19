package akwariumbz;

import java.io.IOException;

public class Main {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Akwarium a= new Akwarium();
		
	a.dodaj_Zwierze(FabrykaZwierzatek.tworzZwierzatko());
	
	a.uruchom_akwarium();
	
	
	}
}
