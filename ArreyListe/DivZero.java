package ArreyListe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivZero 
{

	public static int quociente(int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador;
	}
	public static void main(String[] args) 
	{  // TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do
		{
			try
			{
				System.out.println("\nEntre com o numerador: ");
				int numerador = scanner.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = scanner.nextInt();
				int resultado = quociente(numerador,denominador);
				
				System.out.printf("\nresultado: %d / %d = %d \n",numerador,denominador,resultado);
				continueLoop = false;
			}
		
			catch(InputMismatchException inputMismatchException )
			{
				System.out.printf("\nException: %s \n",inputMismatchException);
				scanner.nextLine();
				System.out.println("\nVoce deve entrar com um valor tipo inteiro.");
			}
			catch(ArithmeticException arithmeticException)
			{
				System.err.printf("\nException: %s \n",arithmeticException);
				System.out.println("\nZero é um denominador invalido, por favor tente novamente...");
			}
		}while(continueLoop);
		
	}

}
