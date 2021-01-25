package imdb.migracao;

import org.flywaydb.core.Flyway;


/**
 * 
 * @author Giuliene
 *
 *
 * Classe responsável por efetuar a migracao pelo FlyWay, 
 * todos os versionamentos devem ser colocados em: src/main/resources/db/migration
 *
 */
public class Migracao {
	
	public Migracao() {

	}
	
	public void executar(String url, String usuario, String senha)
	{
		Flyway flyway =	Flyway.configure().dataSource(url, usuario, senha).load(); 
		flyway.migrate();
	}	
	    
}