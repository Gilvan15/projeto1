package com.projeto.principal;

import org.springframework.boot.SpringApplication;
import com.projeto.principal.entity.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Projeto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto1Application.class, args);
		
		Usuario user = new Usuario();
		
		user.setName("GILVAN JUNIOR");
		System.out.println("RESULTADO: " + user.getName());
		
	}
}