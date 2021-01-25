package imdb.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Giuliene
 *
 *	Entidade Usuario
 *
 */

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "admin")
	private Boolean admin;

	public Usuario() {
		
	}
	
	
	/**
	 * Construtor.
	 *
	 */
	public Usuario(String nome, String email, String senha, Boolean admin) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.admin = admin;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	public Boolean ehAdministrador() {
		return admin;
	}
}
