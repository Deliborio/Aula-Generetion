package orienta��oaobjetos;

public class Pregui�a extends animal{
	
	public Pregui�a()
	{
		super();
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da pregui�a: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nA idade da pregui�a �: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nA pregui�a faz: "+somAnimal);
	}
	
	public void subirArvores()
	{
		System.out.println("\nA pregui�a gosta de subir em arvores.");
	}

}
