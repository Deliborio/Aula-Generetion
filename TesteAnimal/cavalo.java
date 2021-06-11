package orientaçãoaobjetos;

public class cavalo extends animal{
	
	public cavalo()
	{
		super();
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que o seu cavalo emite: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nO cavalo gosta de correr!");
	}
	

}
