import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {

ApplicationContext mojKontener = new ClassPathXmlApplicationContext ("beans.xml");
Object o = mojKontener.getBean("ja");
System.out.println(o.toString());

	}

}
