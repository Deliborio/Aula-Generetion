package Lista1;

import java.util.*;

public class Exercício2 {
	
	public static void main(String[] args) {
		
		double anos, meses, dias, diastotais;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade expressa em Dias: ");
		diastotais = leia.nextFloat();
		
		anos= (diastotais / 365);
		
		meses = (diastotais / 365) % 12;
		
		dias = (diastotais % 365) % 30;
		
		System.out.printf("\nSua idade Expressa em anos: %2.2f",anos);
		System.out.printf("\nMeses: %2.2f",meses);
		System.out.printf("\nE dias %2.2f: ",dias);
		
				
	}
	
	
	

}
