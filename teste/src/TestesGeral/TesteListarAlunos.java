package TestesGeral;

import java.util.List;

import actions.ListarAlunos;
import model.Aluno;

public class TesteListarAlunos {
	
	public static void main(String[] args) {
		
		ListarAlunos lA = new ListarAlunos();
		List<Aluno> alunos = lA.listar();
		
		for(Aluno aluno: alunos) {
			System.out.println(aluno.getId());
			System.out.println(aluno.getNome());
		}
	}
}
