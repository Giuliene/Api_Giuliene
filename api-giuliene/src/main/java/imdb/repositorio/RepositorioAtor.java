package imdb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imdb.modelo.Ator;

/**
 * Repositorio de Ator
 *
 */
@Repository
public interface RepositorioAtor extends JpaRepository <Ator, Integer> {

	
}
