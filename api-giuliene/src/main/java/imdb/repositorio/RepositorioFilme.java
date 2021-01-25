package imdb.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imdb.modelo.Filme;

/**
 * Respositorio de Filme.
 *
 */
@Repository
public interface RepositorioFilme extends JpaRepository<Filme, Integer> {
	
	List<Filme> findByNome(String tipoFiltro);
	
	List<Filme> findByGenero(String tipoFiltro);

	//List<Filme> findByNota(String tipoFiltro);

	//List<Filme> findByDiretores(String tipoFiltro);

	//List<Filme> findByAtores(String tipoFiltro);
	
	
}
