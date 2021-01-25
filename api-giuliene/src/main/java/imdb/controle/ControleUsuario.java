package imdb.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imdb.controle.form.AtualizacaoUsuario;
import imdb.controle.form.UsuarioForm;
import imdb.modelo.Usuario;
import imdb.repositorio.RepositorioUsuario;

/**
 * 
 * @author Giuliene
 *
 *
 *  Controle de transacoes efetuadas para a classe Usuario
 *
 */
@RestController
@RequestMapping(value = "/Usuario")
public class ControleUsuario {

	@Autowired
	private RepositorioUsuario repositorioUsuario;

	/**
	 * Cadastra um novo usuário
	 *
	 */
	@PostMapping
	public void cadastrarUsuario(@RequestBody UsuarioForm usuarioForm, @RequestBody Usuario autorCadastro) {
		Usuario usuario = usuarioForm.converter();
		repositorioUsuario.save(usuario);

	}

	/**
	 * Atualiza os dados de um usuário
	 *
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> atualizarUsuario(@PathVariable Integer id,
			@RequestBody AtualizacaoUsuario atualizacaoUsuario) {
		Usuario usuario = atualizacaoUsuario.atualizar(id, repositorioUsuario);
		return ResponseEntity.ok(usuario);
	}

	/**
	 * Exclui um usuário do banco
	 *
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Integer id) {
		repositorioUsuario.deleteById(id);
		return ResponseEntity.ok().build();
	}

	/**
	 *  Lista todos os usuários não administradores.
	 *	Somente o administrador tem permissão de fazer esta consulta.
	 *
	 */
	@GetMapping
	public List<Usuario> listagemUsuario(String filtro, Usuario requisitante) throws Exception {

		if (requisitante.ehAdministrador()) {
			return repositorioUsuario.findByAdmin("false");
		} else {
			throw new Exception("Somente o administrador tem permissão de fazer essa consulta!");
		}
	}

}
