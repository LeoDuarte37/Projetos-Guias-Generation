package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opcao = 0;
		
		while(opcao != 9) {	
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
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





	