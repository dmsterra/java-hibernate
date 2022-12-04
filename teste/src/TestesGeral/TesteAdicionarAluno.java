package TestesGeral;

import java.util.Calendar;

import actions.AdicionarAluno;
import model.Aluno;

public class TesteAdicionarAluno {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Vanda");
		aluno1.setEmail("vanda@senac.com");
		aluno1.setCpf("12345678922");
		aluno1.setEndereco("Rua 1");
		//aluno1.setDataNasc(Calendar.getInstance()); //não consegui colocar um padrão de data, deu erro em tudo professor
		AdicionarAluno addAluno = new AdicionarAluno();
		addAluno.inserir(aluno1);
		
		
	}
	
	

}
