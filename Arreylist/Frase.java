package ArreyListe;

public class Frase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e)//captura da possivel exce��o
		{
			//tratamento da exe��o
			System.out.println("\nA frase inicial est� nula, para solucionar o problema, foi lhe atribuido um default...");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nNova frase: "+novaFrase);

	}

}
