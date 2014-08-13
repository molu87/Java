package Refleksje;

import java.lang.reflect.Field;

public class FabrykaZwierzatek {
	@SuppressWarnings("unchecked")
	public static ZwierzeAkwariowe tworzeZwierzatko(String rodzaj) { // bedzie
																		// tworzylo
																		// w
																		// zaleznosci
																		// od
																		// rodzaju
																		// zwierzatka

		Class<? extends ZwierzeAkwariowe> cl = null;

		try {
			cl = (Class<? extends ZwierzeAkwariowe>) Class.forName(rodzaj);
			
			Field[] mojePola = cl.getDeclaredFields();
			System.out.println("Zwierz¹tko typu "+ cl + " posiada nastêpuj¹ce atrybuty:");
			for(Field f:mojePola){
				System.out.println(f.getName().toString());
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Takie zwierze: "+ rodzaj +", nie nalezy do akwarium");
			return null;
		}

		try {
			return cl.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;

	}
}
