package orienta��oaobjetos;

public class TesteAvi�o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avi�o avi�o1 = new Avi�o("Boeing", "737-MAX", "Gol", 2018, 178);
		
		avi�o1.imprimirInfo();
		System.out.println("\n\n");
		Avi�o avi�o2 = new Avi�o("AirBus","A-350Neo", "KLM", 2020, 326);
		
		avi�o2.imprimirInfo();
		System.out.println("\n\n");
        Avi�o avi�o3 = new Avi�o("Embraer","ERJ-145", "Latam", 2010, 85);
		
		avi�o3.imprimirInfo();
		System.out.println("\n*****VENDA DE AERONAVE!!!*****");
		avi�o3.setCompanhiaAerea("Avianca");
		avi�o3.imprimirInfo();
    }

}
