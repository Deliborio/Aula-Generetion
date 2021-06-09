package laçosdedecisão;

import java.util.Scanner;

public class exercicio1ld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

		
		int num1, num2, num3, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEntre com um Número: ");
		num1 = leia.nextInt();
		
		System.out.println("\nEntre com um Número: ");
		num2 = leia.nextInt();
		
		System.out.println("\nEntre com um Número: ");
		num3 = leia.nextInt();	
		
		maior = num1;
		
		if(maior < num2){
				
			maior = num2;
		}
		
		if (maior < num3){
			
			maior = num3;
			}
			
		System.out.println("\nO maior número foi: " +maior);	

	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

}


	