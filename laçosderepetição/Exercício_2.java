package Repeticao_04_06;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		float num;
		int nump = 0, numi = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 1; x < 11; x++)
		{
			System.out.println("\nDigite um Número: ");
			num = leia.nextFloat();
			
			if(num % 2 == 0)
			{
				nump++;
			}
			else
			{
				numi++;
			}
		}
		
		System.out.println("\nNúmeros Pares: "+ nump);
			
		System.out.println("\nNúmeros Ímpares: "+ numi);
	}

}
