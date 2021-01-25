package imdb.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imdb.modelo.Avaliacao;
import imdb.modelo.Filme;
import imdb.modelo.Usuario;
import imdb.repositorio.RepositorioAvaliacao;

@RestController
@RequestMapping(value = "/Avaliacao")
public class ControleAvaliacao {
	
	@Autowired
	private RepositorioAvaliacao repositorioAvaliacao;
	
	@PostMapping
	public void votar(Filme filme, Usuario usuario, Double nota) {
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setFilme(filme);
		avaliacao.setUsuario(usuario);
		avaliacao.setNota(nota);
		repositorioAvaliacao.save(avaliacao);
	}
}
