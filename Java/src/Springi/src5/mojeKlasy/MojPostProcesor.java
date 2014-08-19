package mojeKlasy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MojPostProcesor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// System.out.println(beanName +": "+ bean.getClass().getSimpleName());
		if ((bean.getClass().equals(Kawa.class)) && (Kawa.licznikKawy > 0)) {
			return new Kawa();
		} else {
			return new Herbata();
		}

		// return bean;

	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		return arg0;
	}

}
