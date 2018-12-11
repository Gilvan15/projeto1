package com.projeto.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.principal.entity.Usuario;


public interface UserRepository extends JpaRepository<Usuario, Long> {
	
	
	
}
