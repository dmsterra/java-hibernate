package actions;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;

public class BuscarAluno {
	public static Aluno buscar(Aluno aluno) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		Aluno aluno1 = manager.find(Aluno.class, aluno.getId());
		
		manager.close();
		factory.close();
		
		return aluno1;
		
	}

}
