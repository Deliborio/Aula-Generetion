package orienta??oaobjetos;

import java.util.Scanner;

public class TesteAnimal1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		cavalo cavalo = new cavalo();
		Pregui?a preguica = new Pregui?a();
		
		animal animal = null;
		
		int x;
		do
		{
			System.out.println("\nQual o tipo do seu animal???\n\n1-Cachorro\n2-Cavalo\n3-Pregui?a\n");
			x = leia.nextInt();
			if(x==1)
			{
				animal=cachorro;
				System.out.println("\nQual o nome do seu cachorro?");
				String nome = leia.next();
				System.out.println("\nQuantos anos seu cachorro tem?");
				int idade = leia.nextInt();
				System.out.println("\nEssa ? legal!!!Qual o som que seu cachorro emite?");
				String som = leia.next();
				System.out.println("------------------------------------------------------");
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				cachorro.Corre();
			}
			else if(x==2)
			{
				animal=cavalo;
				System.out.println("\nQual o nome do seu cavalo?");
				String nome = leia.next();
				System.out.println("\nQuantos anos seu cavalo tem?");
				int idade = leia.nextInt();
				System.out.println("\nEssa ? legal!!!Qual o som que seu cavalo emite?");
				String som = leia.next();
				System.out.println("------------------------------------------------------");
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Corre();
			}
			else if(x==3)
			{
				animal=preguica;
				System.out.println("\nQual o nome da sua pregui?a?");
				String nome = leia.next();
				System.out.println("\nQuantos anos sua pregui?a tem?");
				int idade = leia.nextInt();
				System.out.println("\nEssa ? legal!!!Qual o som que sua pregui?a emite?");
				String som = leia.next();
				System.out.println("------------------------------------------------------");
				preguica.Nome(nome);
				preguica.Idade(idade);
				preguica.Som(som);
				preguica.subirArvores();
			}
			else
			{
				System.out.println("\nInforma??o Inv?lida!!!");
			}
		}
		while(x<=0 || x>=4);
	}

}
