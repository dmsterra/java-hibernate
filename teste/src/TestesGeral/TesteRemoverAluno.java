package TestesGeral;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;

public class TesteRemoverAluno {
	
	public static void remover (Aluno aluno) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		Aluno aluno1 = manager.find(Aluno.class, aluno.getId());
		
		manager.getTransaction().begin();
		manager.remove(aluno1);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		
	}

}
