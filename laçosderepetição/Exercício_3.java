package Repeticao_04_06;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE) */

		int idade = 0, x21 = 0, x50 = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while (idade != - 99)
		{
			System.out.println("\nEntre com a idade do Participante: ");
			idade = ler.nextInt();
		
			if (idade >= 0 && idade <= 21)
			{
				x21++;
			}	
			else if (idade >= 50)
			{
				x50++;
			}
			else
			{
				System.out.println("\nPrograma Finalizado. ");
			}
			}
		
			System.out.println("\nTotal de participantes com menos de 21 anos: "+ x21);
			System.out.println("\nTotal de participantes com mais de 50 anos: "+ x50);		
	}	
}
