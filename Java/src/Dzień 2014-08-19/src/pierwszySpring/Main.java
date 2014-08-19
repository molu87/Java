package pierwszySpring;

import mojeKlasy.Czlowiek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext mojKontener = new ClassPathXmlApplicationContext("Deskryptor.xml");
		//ApplicationContext mojKontener = new ClassPathXmlApplicationContext("Deskryptor2.xml");
		//Object o = mojKontener.getBean("ja");
		//System.out.println(o.toString());
		
		//Object o1 = mojKontener.getBean("imiona");
		//System.out.println(o1.toString());
		
		//Object o2 = mojKontener.getBean("imiona1");
		//System.out.println(o2.toString());
		
		String[] o3 = mojKontener.getBeanNamesForType(Czlowiek.class);
		for (int i=0; i<o3.length; i++){
			//Object o4 = mojKontener.getBean(o3[i]);					//wersja 1
			//System.out.println(o4);									//wersja 1
			System.out.println(mojKontener.getBean((String) o3[i]));//wersja 2
		}//zakomentowane aby deskryptor2 dzia³a³
		
		//Object o4 = mojKontener.getBean("czlekZAdresem");
		//System.out.println(o4);			//wydrukowanie x2
		//Object o5 = mojKontener.getBean("Dariusz");
		//System.out.println(o5.toString());//do deskryptor2
		
	}

}
