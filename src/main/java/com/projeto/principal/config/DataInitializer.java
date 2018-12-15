package com.projeto.principal.config;

import org.springframework.stereotype.Component;

import com.projeto.principal.entity.Usuario;
import com.projeto.principal.repository.UserRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		criarUsuario("Cludionor Sila Medeiros", "claudiosm@gmail.com");
		criarUsuario("Adriana REIS Mota", "adriana@gmail.com");
		criarUsuario("Ikaro Dias Reis", "ikaro@teste.com.br");
		System.out.println("itens salvos com sucesso!");
			
		//Usuario user = userRepository.findByEmail("adriana@gmail.com");
		//String nome =  user.getName();
		//System.out.println(nome);
				

	}
	
	public void criarUsuario(String name, String email) {
		Usuario usuario = new Usuario(name, email);
		userRepository.save(usuario);
	}
}

/*
List<Usuario> usuarios = userRepository.findAll();
if (usuarios.isEmpty()) {
	Usuario usuario = new Usuario();
	usuario.setName("Gilvan Junior Nascimento Gonçalves");
	usuario.setEmail("gilvan.nascimento@gmail.com");
	userRepository.save(usuario);
	System.out.println("Salvo com sucesso!");
} else {
	System.out.println("Reginstro já existentes!!");
}
*/
