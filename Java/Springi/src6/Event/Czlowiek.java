package Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Czlowiek implements ApplicationEventPublisherAware {
	ApplicationEventPublisher context;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		context = arg0;
		go();
	}

	public void go() {
		for (int i = 0; i < 10; i++) {
			context.publishEvent(new ApplicationEvent(this) {

			});
		}
	}

	private String imie;
	INapoj mojNapoj;

	public INapoj getMojNapoj() {
		return mojNapoj;
	}

	// @Autowired
	public void setMojNapoj(INapoj mojNapoj) {
		this.mojNapoj = mojNapoj;
		mojNapoj.zaparzNapoj();
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public void przedstawSie() {
		System.out.println("Czesc, jestem " + this.imie);
	}

	public Czlowiek() {
	}

	public Czlowiek(String imie) {
		this.imie = imie;
	}

	@Override
	public String toString() {
		String ret = this.imie;
		if (this.mojNapoj != null)
			ret += " pije napój:" + mojNapoj.toString();
		else
			ret += "nic nie pije";

		return ret;
	}

}