package Lista1;

import java.util.*;

public class Exercício1 {
	
	public static void main(String[] args) {
		
		double anos, meses, dias, diastotais;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade expressa em Anos: ");
		anos = leia.nextFloat();
		
		System.out.println("\nMeses: ");
		meses = leia.nextFloat();
		
		System.out.println("\nE dias: ");
		dias = leia.nextFloat();
		
		diastotais = (anos * 365) + (meses * 30) + (dias);
		
		System.out.println("\nSua idade expressa em dias é de: "+diastotais);
		
		
	}

}
