package actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Aluno;

public class BuscarAlunoPorLetra {
	
	public static List<Aluno> buscarPelaPrimeiraLetra(String letra) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select a from Aluno as a where a.nome like :letra");
		query.setParameter("letra", letra + "%");
		List<Aluno> aluno1 = (List<Aluno>)query.getResultList();
		
		return aluno1;
	}

}
