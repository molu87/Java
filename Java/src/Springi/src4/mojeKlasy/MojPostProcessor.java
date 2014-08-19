package mojeKlasy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MojPostProcessor implements BeanPostProcessor{

	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {


		System.out.println(beanName + " " + bean.getClass().getName());
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
	{
		return bean;
	}

	
	
	
	
	
	
}
