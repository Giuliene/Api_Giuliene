package imdb.controle.form;

import imdb.modelo.Filme;

/**
 * 
 * @author Giuliene
 *
 *
 * Formulario da entidade Filme
 *
 */
public class FilmeForm {
	
	private String nome;
	private int episodios;
	private String genero;
	private String pais;
	private String idioma;
	private Boolean cor;
	private String Resumo;
	private String Curiosidades;

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
	 * @return the episodios
	 */
	public int getEpisodios() {
		return episodios;
	}

	/**
	 * @param episodios the episodios to set
	 */
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}

	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	/**
	 * @return the cor
	 */
	public Boolean getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(Boolean cor) {
		this.cor = cor;
	}

	/**
	 * @return the resumo
	 */
	public String getResumo() {
		return Resumo;
	}

	/**
	 * @param resumo the resumo to set
	 */
	public void setResumo(String resumo) {
		Resumo = resumo;
	}

	/**
	 * @return the curiosidades
	 */
	public String getCuriosidades() {
		return Curiosidades;
	}

	/**
	 * @param curiosidades the curiosidades to set
	 */
	public void setCuriosidades(String curiosidades) {
		Curiosidades = curiosidades;
	}

	/**
	 * Converte FilmeForm em Filme
	 *
	 */
	public Filme converter() {
		
		return new Filme(nome, episodios, genero, pais, idioma, cor, Resumo, Curiosidades);
		//adicionar atores e diretores
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
