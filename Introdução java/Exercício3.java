package Lista1;

import java.util.*;

public class Exercício3 {
	
	public static void main(String[] args) {
		
		double horas, minutos, segundos, segundostotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o tempo de duração do evento em Segundos: ");
		segundostotal = leia.nextFloat();
		
		horas = (segundostotal / 3600);
		System.out.printf("\nDuração em Horas: %2.2f",horas);
		
		minutos = ((segundostotal % 3600) / 60);
		System.out.printf("\nMinutos: %2.2f",minutos);
		
		segundos = ((segundostotal % 3600) %60);
		System.out.printf("\nSegundos: %2.2f",segundos);
		
		
	}

}
