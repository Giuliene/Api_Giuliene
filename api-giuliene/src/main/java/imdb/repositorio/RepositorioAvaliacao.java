package imdb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imdb.modelo.Avaliacao;

@Repository
public interface RepositorioAvaliacao extends JpaRepository <Avaliacao, Integer> {

	
}