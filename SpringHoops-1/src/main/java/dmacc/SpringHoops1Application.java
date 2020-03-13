package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Hulahoop;
import dmacc.controller.BeanConfiguration;

@SpringBootApplication
public class SpringHoops1Application {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHoops1Application.class, args);
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Hulahoop h = appContext.getBean("hulahoop", Hulahoop.class);
		System.out.println(h.toString());
		((AbstractApplicationContext) appContext).close();
	
	}

}
