package imdb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imdb.modelo.Diretor;

@Repository
public interface RepositorioDiretor extends JpaRepository<Diretor, Integer> {

	
	
}