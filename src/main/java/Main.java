import clinica.UsuarioAdm;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class Main {

	private static EntityManagerFactory entity = Persistence.createEntityManagerFactory("BancoPU");
	private static EntityManager entityManager = entity.createEntityManager();
	
	public static void main(String[] args){
				
		UsuarioAdm medico = entityManager.find(UsuarioAdm.class, 1);
		System.out.println(medico);
		
	}
}

