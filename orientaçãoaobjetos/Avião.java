package orientaçãoaobjetos;

public class Avião {

	private String fabricante;
	private String modelo;
	private String companhiaAerea;
	private int ano;
	private int numeroPassageiros;
	
	public Avião(String fabricante, String modelo, String companhiaAerea, int ano, int numeroPassageiros)
	{
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.companhiaAerea = companhiaAerea;
		this.ano = ano;
		this.numeroPassageiros = numeroPassageiros;
	}
	
	public void imprimirInfo()
	{
		System.out.println("O jato comercial da "+fabricante+" modelo: "
	+modelo+", fabricado em "+ano+", que pertencene a "
				+companhiaAerea+" tem capacidade para "+numeroPassageiros+" passageiros.");
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	
	
}

