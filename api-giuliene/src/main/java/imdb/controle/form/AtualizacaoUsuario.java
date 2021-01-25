package imdb.controle.form;

import imdb.modelo.Usuario;
import imdb.repositorio.RepositorioUsuario;

/**
 * Classe utilizada para atualizar usuários.
 *
 */
public class AtualizacaoUsuario {

	private String nome;
	private String email;
	private String senha;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * Busca o usuário desatualizado e faz a atualização.
	 *
	 */
	public Usuario atualizar(Integer id, RepositorioUsuario repositorioUsuario) {
		Usuario usuario = repositorioUsuario.getOne(id);
		usuario.setNome(this.nome);
		usuario.setEmail(this.email);
		usuario.setSenha(this.senha);
		return usuario;
	}
	
}
