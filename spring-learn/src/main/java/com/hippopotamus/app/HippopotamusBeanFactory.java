package com.hippopotamus.app;

import com.hippopotamus.service.DemoCode2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class HippopotamusBeanFactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {;


		System.out.println(beanFactory.getBeanDefinitionNames());
		

		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("demoCode1");

		genericBeanDefinition.setBeanClass(DemoCode2.class);
	}
}
