package com.musicas.apirest.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="album")
public class Album implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private Date anoLancamento;
	private long artista;
	
	
	/*
 		Getters e Setters
	*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(Date anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public long getArtista() {
		return artista;
	}
	public void setArtista(long artista) {
		this.artista = artista;
	}
	
	
}
