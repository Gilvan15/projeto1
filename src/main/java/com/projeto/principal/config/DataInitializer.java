package com.projeto.principal.config;

import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		

		System.out.println("Passou por aqui!!");
 
		
	}
	

}
