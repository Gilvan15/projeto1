package com.projeto.principal.entity;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Role {
	
	@Id
	private String Id;
	private String name;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}