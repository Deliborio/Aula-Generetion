package Repeticao_04_06;

import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE) */

		int num, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um Número: ");
		num = ler.nextInt();
		
		do 
		{
			soma = (num + soma);
			
			System.out.println("\nEntre com um Número: ");
			num = ler.nextInt();	
		}
		
		while(num != 0);	
		
		System.out.println("\nOperação Finalizada.");
		
		System.out.println("\nA Soma dos Números digitados foi de: "+ soma);
		

	}

}
