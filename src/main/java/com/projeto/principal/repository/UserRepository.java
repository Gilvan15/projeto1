package com.projeto.principal.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.projeto.principal.entity.Usuario;


public interface UserRepository extends MongoRepository<Usuario, Long> {
	
	Usuario findByName(String name);
	
	Usuario findByNameIgnoreCaseLike(String name);
	
	@Query("{'email' : ?0 } ")
	Usuario findByEmail(String email);
	
	
}
