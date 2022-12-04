package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;

public class AdicionarAluno {
	
	public static void inserir (Aluno aluno) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		//como é uma transação, begin e commit
		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit();
		
		//encerrar tipo pilha
		manager.close();
		factory.close();
	
	}

}
