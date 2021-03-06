package com.prova.arqSoftware.MicroserviceDisciplina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MicroserviceDisciplina {
	
	@GeneratedValue
	@Id
	private int id;
	
	@Column(name = "name")
    private String nome;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
    

}
