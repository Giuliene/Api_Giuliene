package imdb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import imdb.modelo.Filme;
import imdb.repositorio.RepositorioFilme;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{
	
	private final RepositorioFilme repositorioFilme;
	
	public SpringDataApplication(RepositorioFilme repositorio ) {
		this.repositorioFilme = repositorio;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Filme filme = new Filme();
		
	}
	
	
}
