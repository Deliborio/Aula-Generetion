package orienta��oaobjetos;

public class Cachorro extends animal {
	
	public Cachorro()
	{
		super();
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nO Nome do cachorro �: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nA idade do cachorro �: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nO cachorro faz: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nO cachorro corre!!!");
	}
}
