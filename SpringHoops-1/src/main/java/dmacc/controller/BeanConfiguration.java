package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Hulahoop;


//tells spring to manage our beans
@Configuration
public class BeanConfiguration {
	
	//specifies that a bean is being returned
	@Bean
	public Hulahoop hulahoop()
	{
		Hulahoop bean = new Hulahoop();
		return bean;
	}

}
