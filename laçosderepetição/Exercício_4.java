package Repeticao_04_06;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.*/
		
		int idade, sexo, temperamento, lista = 1, calmo = 0, Ocalma = 0, Mnervosa = 0, Hagressivo = 0, Qnervoso = 0, Dcalmo = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while(lista <= 150) 
		{
		
		System.out.println("\nEntre com a sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("\nEntre com o seu sexo: \nFeminino (Digite 1): \nMasculino (Digite 2): \nOutro(a) (Digite 3): ");
		sexo = ler.nextInt();
		
		switch(sexo)
		{
		case 1:
			System.out.println("Feminino");
			
			
		break;
				
		case 2:
			System.out.println("Masculino");
		break;
		
		case 3:
			System.out.println("Outros");
		break;
		
		default:
			System.out.println("opção inválida"); 
		}	
		
		System.out.println("\nEntre com o seu Temperamento: \nCalmo(a) (Digite 1): \nNervoso(a) (Digite 2): \nAgressivo(a) (Digite 3): ");
		temperamento = ler.nextInt();
		
		switch(temperamento)
		{
		case 1:
			System.out.println("Calmo(a)");
			
			if (temperamento == 1)
			{
				calmo++;	
			}
			
			if (temperamento == 1 && sexo == 3)
			{
				Ocalma++;
			}	
			
			if (temperamento == 1 && idade >= 18)
			{
				Dcalmo++;	
			}
		break;
		
		case 2:
			System.out.println("Nervoso(a)");
			
			if (temperamento == 2 && sexo == 1)
			{
				Mnervosa++;
			}
			
			if (idade >= 40 && temperamento == 2)
			{
				Qnervoso++;
				
			}	
		break;
		
		case 3:
			System.out.println("Agressivo(a)");
			
			if (temperamento == 3 && sexo == 2)
			{
				Hagressivo++;	
			}
		break;
		
		default:
			System.out.println("opção inválida"); 
		}	
		
		lista++;
			
		System.out.println("\nO Número de Pessoas Calmas é de: "+calmo);
		
		System.out.println("\nO Número de Mulheres Nervosas é de: "+Mnervosa);
		
		System.out.println("\nO Número de Homens Agressivos é de: "+Hagressivo);
		
		System.out.println("\nO Número de Outros(as) Calmos(as) é de: "+Ocalma);
		
		System.out.println("\nO Número Pessoas com menos de 18 anos e Calmos(as) é de: "+Dcalmo);
		
		System.out.println("\nO Número Pessoas com mais de 40 anos e Nervosos(as) é de: "+Qnervoso);
		
		
		}
	}

}
