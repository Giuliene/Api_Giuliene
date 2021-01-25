package imdb.modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 * @author Giuliene
 *
 *
 * Entidade Abstrata Pessoa Filme
 *
 */
@Entity
public abstract class PessoaFilme {
	
	@Id
	Integer id;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "nasc")
	private Date nasc;
	
	@Column(name = "biografia")
	private String biografia;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="atores")  
	private List<Filme> filmes;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

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
	 * @return the nasc
	 */
	public Date getNasc() {
		return nasc;
	}

	/**
	 * @param nasc the nasc to set
	 */
	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}

	/**
	 * @return the biografia
	 */
	public String getBiografia() {
		return biografia;
	}

	/**
	 * @param biografia the biografia to set
	 */
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
}
