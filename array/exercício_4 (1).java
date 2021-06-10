package Arrays_07_06;

import java.util.Scanner;

public class exercício_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
	(1) somar as duas matrizes 
	(2) subtrair a primeira matriz da segunda 
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes 
	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante 
	deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/

		
		float [][] matriz1 = new float [2][2]; 
		float [][] matriz2 = new float [2][2];
		float [][] matrizc = new float [2][2];
		float soma = 0, subtrair = 0;
		int l = 0, c = 0, op = 0, constante = 0;
		
		Scanner ler = new Scanner (System.in);
		
		for (l = 0; l < 2; l++)
		{
			for (c = 0; c < 2; c++)
			{
				System.out.println("\nEntre com um Número para a Matriz 1: ");
				matriz1[l][c] = ler.nextInt();
				System.out.println("\nEntre com um Número para a Matriz 2: ");
				matriz2[l][c] = ler.nextInt();
			}
		}
					
				for (op = 1; op < 5; op++) 
				{
					System.out.println("\nDigite a opção que Deseja seguir: "
							+ "\n1- Soma das Duas Matrizes. "
							+ "\n2- Subtrair a Primeira Matriz da Segunda. "
							+ "\n3-  Adicionar uma Constante as Duas Matrizes.  "
							+ "\n4- Imprimir as Matrizes.");
						op = ler.nextInt();
						
						if (op == 1)
						{
							soma = (matriz1[l][c] + matriz2[l][c]);
							
							System.out.printf("A soma das Duas Matrizes é: %2.2f" + soma);		
						}
					
						if (op == 2)
						{
							subtrair = (matriz1[l][c] - matriz2[l][c]);
							
							System.out.printf("A Subtração da Primeira Matriz pela Segunda é: %2.2f" + subtrair);
						}
			
						if (op == 3)
						{
							System.out.printf("Entre com o valor da Constante: ");
							
							constante = ler.nextInt();
							matrizc [l][c] = constante * matriz1[l][c];
							matrizc [l][c] = constante * matriz2[l][c];
							
							System.out.printf("A Constante entre as Duas Matrizes é: %2.2f" + matrizc);
						}
					
						if (op == 4)
						{
							System.out.println("Primeira Matriz: " + matriz1[l][c]);
							System.out.println("Segunda Matriz: " + matriz2[l][c]);
						}
						else
							
						System.out.println("opção inválida"); 
				}
	}

}
