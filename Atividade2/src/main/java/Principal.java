
import java.util.Scanner;

import br.com.harris.Atividade2.testes.CadastroDeProduto;

public class Principal {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		
		try (CadastroDeProduto cadastroDeProduto = new CadastroDeProduto()) {
			System.out.println("\n \n \n Seja muito bem vindo");

		System.out.println(
				"Escolha uma das opções: \n" +
						" 0: Fechar a aplicação\n" +
						" 1: Cadastrar os 3 produtos\n" +
						" 2: Atualizar o PRIMEIRO produto cadastrado\n" +
						" 3: Apagar o SEGUNDO produto cadastrado" 				
				);
		
		while (!sair) {
			String entrada = scan.nextLine();
			// 0: Fechar a aplicação
			if (entrada.equals("0")) {
				sair = true;
				System.out.println("Saindo da aplicação...   :(");
			//	1: Cadastrar os 3 produtos\n
			} else if (entrada.equalsIgnoreCase("1")) {
				cadastroDeProduto.cadastrarProdutos();
			//	
			} else if (entrada.endsWith("2")) {
				cadastroDeProduto.atualizaProduto();
			//	
			} else if (entrada.equals("3")) {
				cadastroDeProduto.apagarProduto();
			//	3: Apagar o segundo produto cadastrado
			} else {
				System.out.println(" ###### Tende uma das opções ###### \n" +
						" 0: Fechar a aplicação\n" +
						" 1: Cadastrar os 3 produtos\n" +
						" 3: Apagar o segundo produto cadastrado" );			
			 } 

        }
        scan.close();
    }

}

}