package orientaçãoaobjetos;

public class Preguiça extends animal{
	
	public Preguiça()
	{
		super();
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da preguiça: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nA idade da preguiça é: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nA preguiça faz: "+somAnimal);
	}
	
	public void subirArvores()
	{
		System.out.println("\nA preguiça gosta de subir em arvores.");
	}

}
