package imdb.controle.form;

import imdb.modelo.Usuario;

/**
 *  Formulário de usuário.
 *
 */
public class UsuarioForm {
	private String nome;
	private String email;
	private String senha;
	private Boolean admin;
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
	
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	/**
	 * Converte um UsuarioForm em um Usuario.
	 *
	 */
	public Usuario converter() {
		
		return new Usuario(nome, email, senha, admin);
	}
}
