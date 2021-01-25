package testesUnitarios;

import org.junit.Test;
import org.springframework.boot.SpringApplication;

import imdb.SpringDataApplication;
import imdb.migracao.Migracao;

public class TestePrincipal {
	//private final String url = "jdbc:mysql://localhost:3300/bancoimdb?createDatabaseIfNotExist=true";
	//private final String usuario = "root";
	//private final String senha = "2102";
	
	
	/**
	 * Cadastra um novo usuário
	 *
	 */
	@Test
	public void test(String url, String usuario, String senha) {
		Migracao m = new Migracao();
		m.executar(url, usuario, senha);
		//SpringApplication.run(SpringDataApplication.class);
	}
	
	

}
