package ViewMenu;

import java.util.List;
import java.util.Scanner;

import actions.AdicionarAluno;
import actions.AtualizarAluno;
import actions.BuscarAluno;
import actions.BuscarAlunoPorLetra;
import actions.ListarAlunos;
import actions.RemoverAluno;
import model.Aluno;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		do {
			List<Aluno> al = null;
			Aluno aluno = new Aluno();
			System.out.println("\n*****MENU*****\n");
			System.out.println("1 - Adicionar aluno\n2 - Buscar aluno\n3 - Buscar aluno pela primeira letra\n4 - Atualizar aluno\n5 - Listar alunos\n6 - Remover aluno\n7 - Sair");
			System.out.println("Qual opção você deseja?");
			menu = sc.nextInt();
			clearBuffer(sc);
			switch(menu) {
			case 1:
				System.out.println("Informe o nome do aluno: ");
				aluno.setNome(sc.nextLine());
				System.out.println("Informe o CPF do aluno: ");
				aluno.setCpf(sc.nextLine());
				System.out.println("Informe o email do aluno: ");
				aluno.setEmail(sc.nextLine());
				System.out.println("Informe o endereço do aluno: ");
				aluno.setEndereco(sc.nextLine());
				System.out.println("Informe a naturalidade do aluno: ");
				aluno.setNaturalidade(sc.nextLine());
				AdicionarAluno.inserir(aluno);
				break;
			case 2:
				System.out.println("Informe o ID do aluno que deseja procurar: ");
				aluno.setId(sc.nextLong());
				clearBuffer(sc);
				aluno = BuscarAluno.buscar(aluno);
				System.out.println("Nome: "+ aluno.getNome());
				System.out.println("CPF: " + aluno.getCpf() );
				System.out.println("Email: " + aluno.getEmail());
				System.out.println("Endereço: " + aluno.getEndereco());
				System.out.println("Naturalidade: " + aluno.getNaturalidade());
				break;
			case 3:
				System.out.println("Informe a primeira letra do aluno que deseja procurar: ");
				String letra = sc.nextLine();
				al = BuscarAlunoPorLetra.buscarPelaPrimeiraLetra(letra);
				for(Aluno aluno1 : al) {
					System.out.println("Nome: " + aluno1.getNome());
					System.out.println("CPF: " + aluno1.getCpf());
					System.out.println("Email: " + aluno1.getEmail());
					System.out.println("Endereco: " + aluno1.getEndereco());
					System.out.println("Naturalidade: " + aluno1.getNaturalidade());
					System.out.println("\n");
				}
				break;
				
			case 4:
				int teste = 0;
				System.out.println("Informe o ID do aluno que deseja atualizar: ");
				aluno.setId(sc.nextLong());
				clearBuffer(sc);
				aluno = BuscarAluno.buscar(aluno);
				
				System.out.println("Deseja alterar o nome do aluno? 1 - Sim / 2 - Não: \n");
				teste = Integer.parseInt(sc.nextLine());
				if(teste==1) {
					System.out.println("Informe o nome do aluno: ");
					aluno.setNome(sc.nextLine());
				}
				
				System.out.println("Deseja alterar o CPF do aluno? 1 - Sim / 2 - Não: \n ");
				teste = Integer.parseInt(sc.nextLine());
				if(teste==1) {
					System.out.println("Informe o email do aluno: ");
					aluno.setCpf(sc.nextLine());
				}
				
				System.out.println("Deseja alterar o endereço do aluno ? 1 - Sim / 2 - Não: \n ");
				teste = Integer.parseInt(sc.nextLine());
				if(teste==1) {
					System.out.println("Informe o endereço do aluno: ");
					aluno.setEndereco(sc.nextLine());
				}
				
				System.out.println("Deseja alterar a naturalidade do aluno? 1 - Sim / 2 - Não: \n ");
				teste = Integer.parseInt(sc.nextLine());
				if(teste==1) {
					System.out.println("Informe a naturalidade do aluno: ");
					aluno.setNaturalidade(sc.nextLine());
				}
				
				System.out.println("Deseja alterar o email do aluno? 1 - Sim 2 - Não: \n ");
				teste = Integer.parseInt(sc.nextLine());
				if(teste==1) {
					System.out.println("Informe o email do aluno: ");
					aluno.setEmail(sc.nextLine());
				}
				
				AtualizarAluno.alterar(aluno);
				aluno = null;
				break;
				
			case 5:
				al = ListarAlunos.listar();
				for (Aluno aluno1 : al){
					System.out.println("Nome: " + aluno1.getNome());
					System.out.println("Email: " + aluno1.getEmail());
					System.out.println("Endereco: " + aluno1.getEndereco());
					System.out.println("CPF: " + aluno1.getCpf());
					System.out.println("Naturalidade: " + aluno1.getNaturalidade());
					System.out.println("\n\n");
				}
				al = null;
				break;
			case 6:
				System.out.println("Informe o ID do aluno que deseja remover: ");
				aluno.setId(sc.nextLong());
				clearBuffer(sc);
				RemoverAluno.remover(aluno);
				break;
				
			case 7:
				System.out.println("Obrigado!");
				break;
			}
			
		}
		while(menu!=7);			
	}
	
	private static void clearBuffer(Scanner sc) {
		// TODO Auto-generated method stub
		if(sc.hasNextLine()) {
			sc.nextLine();
		}
	}
}
