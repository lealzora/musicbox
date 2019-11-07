package com.musicas.apirest.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.musicas.apirest.models.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long>{

	@Query("SELECT a.nome FROM Artista a WHERE a.nome like '% + :nome + %' ")
	List<Artista> procuraPeloNome(@Param("nome") String nome);	
	
//	@Query("SELECT a.nome FROM Artista a WHERE a.nome LIKE CONCAT('%',:nome,'%')")
//	List<Artista> procuraPeloNome(@Param("nome") String nome);
}
