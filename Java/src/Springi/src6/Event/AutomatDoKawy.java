package Event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class AutomatDoKawy implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event.getSource().getClass().equals(Czlowiek.class)) {
			System.out.println("Ju¿ tworzê kawê, cz³owieniu!");
		}
		else System.out.println("to ktos inny wo³a!");
	}

}
