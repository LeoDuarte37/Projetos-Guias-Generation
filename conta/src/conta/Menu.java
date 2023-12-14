package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opcao = 0;
		
		while(opcao != 9) {	
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("--------------------------------------------------");			
			System.out.println("\n\tBANCO DO BRAZIL COM Z\n");			
			System.out.println("--------------------------------------------------");
			System.out.println("\n\t1 - Criar conta");
			System.out.println("\t2 - Listar todas as contas");
			System.out.println("\t3 - Buscar conta por número");
			System.out.println("\t4 - Atualizar dados da conta");
			System.out.println("\t5 - Apagar conta");
			System.out.println("\t6 - Sacar");
			System.out.println("\t7 - Depositar");
			System.out.println("\t8 - Transferir valores entre contas");
			System.out.println("\t9 - Sair\n");			
			System.out.println("--------------------------------------------------");
			System.out.println("\nDigite a opção desejada: " + Cores.TEXT_RESET);
			
			opcao = ler.nextInt();			
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui");
				sobre();
				ler.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nCriar conta");
				break;
			
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nListar todas as contas");			
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nConsultar dados da conta - por número");
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nAtualizar dados da conta");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nApagar a conta");
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSaque");
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nDepósito");
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nTranferência entre contas");
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!");
				break;
			}
		}
		
		
	}

	public static void sobre() {
		System.out.println("\n---------------------------------------------------\n");
		System.out.println("Projeto desenvolvido por: Leonardo Duarte");
		System.out.println("Generation Brasil - leonardo.r.s.duarte@gmail.com");
		System.out.println("github.com/LeoDuarte37/Projetos-Guias-Generation");
		System.out.println("\n---------------------------------------------------");
	}
}





	