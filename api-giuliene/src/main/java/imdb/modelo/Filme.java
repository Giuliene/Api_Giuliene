package imdb.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
//import javax.persistence.Table;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

/**
 * 
 * @author Giuliene
 *
 *
 * Entidade Filme
 *
 */
@Entity
@Table(name = "filme")
public class Filme implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "numero_episodios")
	private int numeroEpisodios;

	@Column(name = "genero")
	private String genero;

	@Column(name = "pais")
	private String pais;

	@Column(name = "idioma")
	private String idioma;

	@Column(name = "cor")
	private Boolean cor;

	@Column(name = "resumo")
	private String resumo;

	@Column(name = "curiosidades")
	private String curiosidades;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Ator_Filme", joinColumns = @JoinColumn(name = "Filme_id"), inverseJoinColumns = @JoinColumn(name = "ator_id"))
	private List<Ator> atores;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Diretor_Filme", joinColumns = @JoinColumn(name = "Filme_id"), inverseJoinColumns = @JoinColumn(name = "diretor_id"))
	private List<Diretor> diretores;
	
	@OneToMany(mappedBy = "filme", cascade = CascadeType.ALL)
	List<Avaliacao> avaliacao;
	
	public Filme() {
		
	}
	
	
	
	public Filme(String nome, int numeroEpisodios, String genero, String pais, String idioma, Boolean cor,
			String resumo, String curiosidades) {
		super();
		this.nome = nome;
		this.numeroEpisodios = numeroEpisodios;
		this.genero = genero;
		this.pais = pais;
		this.idioma = idioma;
		this.cor = cor;
		this.resumo = resumo;
		this.curiosidades = curiosidades;
	}



	public double getNota() {
		
		double soma = 0;
		int i;
		for (i = 0; i < avaliacao.size(); i++) { 
		    soma = soma + avaliacao.get(i).getNota();    
		 }
		return soma/i;
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

	public int getNumeroEpisodios() {
		return numeroEpisodios;
	}

	public void setNumeroEpisodios(int numeroEpisodios) {
		this.numeroEpisodios = numeroEpisodios;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Boolean getCor() {
		return cor;
	}

	public void setCor(Boolean cor) {
		this.cor = cor;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getCuriosidades() {
		return curiosidades;
	}

	public void setCuriosidades(String curiosidades) {
		this.curiosidades = curiosidades;
	}

}
