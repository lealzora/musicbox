package com.musicas.apirest.models;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="artista")
public class Artista implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
//	private Set<Album> albums = new HashSet<Album>(0);
	
	
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
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "artista", cascade = CascadeType.REMOVE)
//	public Set<Album> getAlbums() {
//		return this.albums;
//	}
//	public void setAlbums(Set<Album> albums) {
//		this.albums = albums;
//	}
	
}
