/* 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
package ArreyListe;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {

	public static void main(String[] args) {
		

		int op;
		try (Scanner ler = new Scanner(System.in)) {
			ArrayList<String> estoque = new ArrayList<String>();
			
			do
			{
				System.out.println("\n\t\tDigite uma op��o: ");
				System.out.println("---------------------------------------------------------------");
				System.out.println("\n (1) Deseja add produtos ao estoque? \n (2) Deseja remover? "+
				"\n (3) Atualizar estoque?\n (4) Mostrar produto?\n (0) Encerrar programa!");
				op = ler.nextInt();
				
				switch(op)
				{
				case 1:
					ler.nextLine();
					System.out.println("\nDigite o produto para add ao estoque: ");
					String produto = ler.nextLine();
					estoque.add(produto);
					break;
					
				case 2:
					ler.nextLine();
					System.out.println("\nDigite o produto a remover do estoque: ");
					String produto1 = ler.nextLine();
					if(estoque.contains(produto1))
					{
						estoque.remove(produto1);
					}
					else
					{
						System.out.println("\nProduto n�o encontrado! ");
					}
					break;
				case 3:
					ler.nextLine();
					System.out.println("\nDigite o produdo a atualizar: ");
					String verifica = ler.nextLine();
					System.out.println("\nDigite o nome do produto que substituir�: ");
					String novo = ler.nextLine();
					if(estoque.contains(verifica))
					{
			         	estoque.remove(verifica);
						estoque.add(novo);
				    }
					else
					{
						System.out.println("\nProduto n�o existe no estoque! ");
					}
					System.out.println(estoque);
				case 4:
					System.out.println("\nOs produtos do estoque s�o: ");
					System.out.println(estoque);
					break;
					default:
						System.out.println("\nPrograma finalizado!");
			}
		}
			while(op!=0);
	}
 }
	
}