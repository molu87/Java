import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import mojeklasy.Czlowiek;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) throws BeansException, ClassNotFoundException {
	
		ApplicationContext mojKontener = new ClassPathXmlApplicationContext("beans.xml");
		
		Map<String, ?> list = mojKontener.getBeansOfType(Czlowiek.class);
		
		for(Entry<String, ?> item: list.entrySet()) {
			String objName = item.getKey();
			Czlowiek c = (Czlowiek)item.getValue();
			System.out.println("Obiekt o nazwie "+objName+", wartoœæ: "+ c.toString());
		}
		
	}

}
