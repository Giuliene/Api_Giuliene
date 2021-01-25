package imdb.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imdb.modelo.Usuario;

/**
 * Respositório de usuário.
 *
 */
@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {

	List<Usuario> findByAdmin(String string);

}
