package mojeklasy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import mojeklasy.*;

public class Main {

	public static void main(String[] args) {
		ApplicationContext mojKontener = new ClassPathXmlApplicationContext(
				"beans2.xml");

		Object o = mojKontener.getBean("ja");
		Object o2 = mojKontener.getBean("ja1");
		System.out.println(o.toString());
		((Czlowiek) o).przedstawSie();

		// Object o1 = mojKontener.getBean("ja1");
		// System.out.println(o1.toString());
		// ((Czlowiek)o1).przedstawSie();

		String[] lista = mojKontener.getBeanNamesForType(Czlowiek.class);
		for (String m : lista) {
			System.out.println(mojKontener.getBean((String) m));

		}

		System.out.println(mojKontener.getBean("kawa"));
		System.out.println(mojKontener.getBean("kakao"));
		System.out.println(o2.toString());
	}

}
