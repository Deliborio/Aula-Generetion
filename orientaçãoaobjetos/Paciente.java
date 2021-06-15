package orientaçãoaobjetos;


public class Paciente {

	private String hospital;
	private String nome;
	private String genero;
	private int idade;
	private String tratamento;
	
	
	public Paciente(String hospital, String nome, String genero, int idade, String tratamento)
	{
		this.hospital = hospital;
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.tratamento = tratamento;
		
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nO(A) paciente "+nome+", de "
	        +idade+" anos, genero "
		    +genero+", faz tratamento de uma"
	     	+tratamento+" no hospital "
		    +hospital+".");
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	
}
