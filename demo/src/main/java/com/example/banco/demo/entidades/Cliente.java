package com.example.banco.demo.entidades;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Chamados")
@Data
public class Cliente {
	@Id
	private String id;
	
	private String nome;

	public Cliente(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
}