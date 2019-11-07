package com.musicas.apirest.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.musicas.apirest.repository.ArtistaRepository;
import com.musicas.apirest.models.Artista;
import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class ArtistaResource {
	
	@Autowired
	ArtistaRepository artistaRepository;

	
	@GetMapping("/artista")
	public List<Artista> listaArtista(){
		return artistaRepository.findAll();
	}

	// VERIFICAR ESTE Método. Não está buscando
	@GetMapping("/artista/{nome}")
	public List<Artista> listaArtistaNome(@PathVariable(value="nome") String nome){
		return artistaRepository.procuraPeloNome(nome);
	}

	@PostMapping("/artista")
	public Artista salvaArtista(@RequestBody Artista artista) {
		return artistaRepository.save(artista);
	}

	@DeleteMapping("/artista")
	public void deletaArtista(@RequestBody Artista artista) {
		artistaRepository.delete(artista);
	}
	
	@PutMapping("/artista")
	public Artista atualizaArtista(@RequestBody Artista artista) {
		return artistaRepository.save(artista);
	}
}
