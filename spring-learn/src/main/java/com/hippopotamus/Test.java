package com.hippopotamus;


import com.hippopotamus.app.Appconfig;
import com.hippopotamus.dao.QueryDao;
import com.hippopotamus.service.DemoCode1;
import com.hippopotamus.service.DemoCode2;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/***
 * 二、Spring 启动流程的总结
 * 1）、Spring容器在启动的时候，先会保存所有注册进来的Bean的定义信息；
 *    1）、xml注册bean；<bean>
 *    2）、注解注册Bean；@Service、@Component、@Bean、xxx
 * 2）、Spring容器会合适的时机创建这些Bean
 *    1）、用到这个bean的时候；利用getBean创建bean；创建好以后保存在容器中；
 *    2）、统一创建剩下所有的bean的时候；finishBeanFactoryInitialization()；
 * 3）、后置处理器；BeanPostProcessor
 *    1）、每一个bean创建完成，都会使用各种后置处理器进行处理；来增强bean的功能；
 *       AutowiredAnnotationBeanPostProcessor:处理自动注入
 *       AnnotationAwareAspectJAutoProxyCreator:来做AOP功能；
 *       xxx....
 *       增强的功能注解：
 *       AsyncAnnotationBeanPostProcessor
 *       ....
 * 4）、事件驱动模型；
 *    ApplicationListener；事件监听；
 *    ApplicationEventMulticaster；事件派发：
 * ————————————————
 */

public class Test {
	public static void main(String[] args) {


		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");

		//初始化spring context
		//AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);

		//QueryDao demoDao = annotationConfigApplicationContext.getBean(QueryDao.class);

		//System.out.println(annotationConfigApplicationContext.getBean(DemoCode2.class));





		//demoDao.query();


	}
}
