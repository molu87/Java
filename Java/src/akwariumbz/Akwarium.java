package akwariumbz;

import java.util.ArrayList;
import java.util.Iterator;





public class Akwarium {
	
	ArrayList<ZwierzeAkwariowe> zwierzeta = new ArrayList<>();

	
	
	void dodaj_Zwierze( ZwierzeAkwariowe z){
		zwierzeta.add(z); 
	}
	


void uruchom_akwarium() throws NullPointerException{
	try{
	for(int i=0;i < zwierzeta.size(); i++)
		zwierzeta.get(i).plyn();
	}
	catch (NullPointerException e){
		System.out.println("");
	}
}
}
