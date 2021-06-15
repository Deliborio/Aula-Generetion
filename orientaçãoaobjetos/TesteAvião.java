package orientaçãoaobjetos;

public class TesteAvião {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avião avião1 = new Avião("Boeing", "737-MAX", "Gol", 2018, 178);
		
		avião1.imprimirInfo();
		System.out.println("\n\n");
		Avião avião2 = new Avião("AirBus","A-350Neo", "KLM", 2020, 326);
		
		avião2.imprimirInfo();
		System.out.println("\n\n");
        Avião avião3 = new Avião("Embraer","ERJ-145", "Latam", 2010, 85);
		
		avião3.imprimirInfo();
		System.out.println("\n*****VENDA DE AERONAVE!!!*****");
		avião3.setCompanhiaAerea("Avianca");
		avião3.imprimirInfo();
    }

}
