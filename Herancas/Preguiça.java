package orientaçãoaobjetos;

public class Preguiça extends animal
{
	private int peso;
	  public Preguiça (String nome, int idade, int peso)
      {
      	super(nome,idade);
      	this.setNome(nome);
      	this.setIdade(idade);
      	this.peso = peso;
      }
      
      public void imprimirInfo()
      {
    	  System.out.println("\nO nome da Preguiça é "+getNome()+", e a idade é: "+getIdade()+" anos e pesa "+peso+" kilos.");  
      }
     
}
