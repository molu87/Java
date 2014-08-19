package mojeKlasy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext mojKontener = new ClassPathXmlApplicationContext("beans4.xml");
		
		
	}

}
