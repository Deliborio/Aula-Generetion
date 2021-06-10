package Lista1;

import java.util.*;

public class Exercício4 {

	public static void main(String[] args) {
		
		double a, b, c, d, r, s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um valor para A: ");
		a = leia.nextFloat();
		
		System.out.println("\nEscreva um valor para B: ");
		b = leia.nextFloat();
		
		System.out.println("\nEscreva um valor para C: ");
		c = leia.nextFloat();
		
		r = (Math.pow (a + b, 2));
		
		s = (Math.pow (b + c, 2));
		
		System.out.printf("\nO valor de R é: %2.2f", r);
		System.out.printf("\nO valor de S é: %2.2f", s);
		
		d= (r + s) /2;
		
		System.out.printf("\nO valor de D é: %2.2f", d);
		
		
		
		
		
		
	}
}
