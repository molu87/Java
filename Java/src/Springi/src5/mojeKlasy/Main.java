package mojeKlasy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Licznik Kaw wynosi: " + Kawa.licznikKawy);

		ApplicationContext mojKontener = new ClassPathXmlApplicationContext(
				"DeskryptorXML2.xml");

		System.out.println("Licznik Kaw wynosi: " + Kawa.licznikKawy);

		// wybranie typu uzywanego kontenera
		// Object o = mojKontener.getBean("imie1");
		// Object o2 = mojKontener.getBean("imie2");

		// String[] o3 = mojKontener.getBeanNamesForType(Czlowiek.class);

		// System.out.println(o.toString());
		// System.out.println(o2.toString());
		/*
		 * for (int i = 0; i < o3.length; i++) { Object o4 =
		 * mojKontener.getBean(o3[i]); System.out.println(o4);
		 */

		// }

		// Object o5 = mojKontener.getBean("czlowiek1");

		// Object o6 = mojKontener.getBean("Tomasz");
		// System.out.println(o6.toString());

	}

}
