package com.ciandt.handson.mymusic.service.model;

public class Artista {
	
	private Integer id;
	private String nome;
	
	public Artista() {
		
	}
	
	public Artista(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
