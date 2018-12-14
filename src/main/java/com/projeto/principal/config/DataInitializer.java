package com.projeto.principal.config;

import org.springframework.stereotype.Component;

import com.projeto.principal.entity.Usuario;
import com.projeto.principal.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Usuario usuario = new Usuario();
		
		usuario.setName("Ramona Morgana Mota Gonçalves");
		usuario.setEmail("ramona@gmail.com");
		
		userRepository.save(usuario);
		
		System.out.println("Salvo com sucesso!");
 		
	}
	

}
