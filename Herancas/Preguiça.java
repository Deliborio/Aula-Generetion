package orienta��oaobjetos;

public class Pregui�a extends animal
{
	private int peso;
	  public Pregui�a (String nome, int idade, int peso)
      {
      	super(nome,idade);
      	this.setNome(nome);
      	this.setIdade(idade);
      	this.peso = peso;
      }
      
      public void imprimirInfo()
      {
    	  System.out.println("\nO nome da Pregui�a � "+getNome()+", e a idade �: "+getIdade()+" anos e pesa "+peso+" kilos.");  
      }
     
}
