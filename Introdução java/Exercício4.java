package Lista1;

import java.util.*;

public class Exerc�cio4 {

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
		
		System.out.printf("\nO valor de R �: %2.2f", r);
		System.out.printf("\nO valor de S �: %2.2f", s);
		
		d= (r + s) /2;
		
		System.out.printf("\nO valor de D �: %2.2f", d);
		
		
		
		
		
		
	}
}
