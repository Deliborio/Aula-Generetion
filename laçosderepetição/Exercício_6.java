package Repeticao_04_06;

import java.util.Scanner;

public class Exercício_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escrever um programa que receba vários números inteiros no teclado.
		 *  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
		
		int num, soma = 0, cont = 0;
		float media = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um Número: \nSe deseja sair, entre com o Número ZERO[0]: ");
		num = ler.nextInt();
		
		do 
		{
			num++;
			
			if (num % 3 == 0)
			{
				soma = (num + soma);
				cont++;				
			}
			
			media = (soma / cont);
			
			System.out.println("\nEntre com um Número: \nEntre com o Número 0 se deseja sair.");
			num = ler.nextInt();
		
		}
		while(num != 0);	
		
		System.out.println("\nOperação Finalizada.");
		
		System.out.printf("\nA Média dos Números Múltiplos de três foi de: %.2f", media);
		
		
		
	}

}
