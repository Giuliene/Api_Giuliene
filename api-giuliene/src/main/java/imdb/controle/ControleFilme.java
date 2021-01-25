package imdb.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imdb.controle.form.FilmeForm;
import imdb.modelo.Filme;
import imdb.modelo.Usuario;
import imdb.repositorio.RepositorioFilme;

/**
 * 
 * @author Giuliene
 *
 *
 * Controle de transacoes efetuadas para a classe Filme.
 *
 */
@RestController
@RequestMapping(value = "/Filme")
public class ControleFilme {
	
	@Autowired
	private RepositorioFilme repositorioFilme;
		
	/**
	 * Lista filmes de acordo com o filtro.
	 *
	 */
	@GetMapping
	public List<Filme> listagemFilmes(String filtro, String tipoFiltro) {
		
		
		
		switch (tipoFiltro) {
								
		case "nome":
			return repositorioFilme.findByNome(tipoFiltro);
			
		case "genero":
			return repositorioFilme.findByGenero(tipoFiltro);
		
			
		case "diretor":
			//return repositorioFilme.findByDiretores(tipoFiltro);
			
		case "ator":
			//return repositorioFilme.findByAtores(tipoFiltro);
			
		}
		
		return repositorioFilme.findAll();
	}
	
	/**
	 * Cadastro de filme
	 * @throws Exception 
	 */
	
	@PostMapping
	public void cadastrarFilme(@RequestBody FilmeForm formFilme, Usuario autorCadastro) throws Exception {
		
		if (autorCadastro.ehAdministrador()) {
			Filme filme = formFilme.converter();
			repositorioFilme.save(filme);
		} else {
			throw new Exception("Somente o administrador tem permissão de fazer um cadastro!");
		}
		
	}
	

}
