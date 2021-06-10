package Arrays_07_06;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/
		
		int [] A = new int[6];
 				
 		int somapar = 0, contimpar = 0;
	
		Scanner ler = new Scanner (System.in);
		
		for (int x = 0; x < 6; x++)
		{
			System.out.println("\nEntre com um Número:  ");
			A [x]= ler.nextInt();
			 
			if (A[x] % 2 == 0)
			{
				somapar += A[x];
			}
			
			else 
			{
				contimpar++;
			}
		}
			System.out.println("\nA Soma dos números Pares foi:  " + somapar);
			System.out.println("\nA Quantidade de Números Ímpares foi: " + contimpar);
			
			System.out.println("\nOs números Ímpares foram:  ");
			
			for (int x = 0; x < 6; x++)
			{
				if (A[x] % 2 == 0)
				{
					System.out.println("\n\t"+ A[x]);
				}
			}
			
			System.out.println("\nOs números Ímpares foram:  ");
				
			for (int x = 0; x < 6; x++)
			{	
				if (A[x] % 2 == 1)
				{
					System.out.println("\n\t"+ A[x]);
				}
			}
	}

}
