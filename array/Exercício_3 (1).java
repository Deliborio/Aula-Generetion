package Arrays_07_06;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

		int [][] matriz = new int  [3][3];
		int l = 3, c = 3, valores = 0;
		
		Scanner ler = new Scanner (System.in);
		
		for (l = 0; l < 3; l++)
		{
			for (c = 0; c < 3; c++)
			{
				System.out.println("\nEntre com um Número: ");
				matriz[l][c] = ler.nextInt();
				
				if (matriz[l][c] > 10)
				{
					matriz[l][c]= valores; valores++;	
						
				}
			}
		}
		
		System.out.println("\nA Matriz possui " + valores + " valores maiores que 10.");
	}

}
