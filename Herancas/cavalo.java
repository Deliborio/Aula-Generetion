package orienta��oaobjetos;

public class cavalo extends animal
{
	       private int peso;
             
			public cavalo(String nome, int idade, int peso)
              {
            	  super(nome, idade);
            	  this.setNome(nome);
            	  this.setIdade(idade);
            	  this.peso = peso;
              }
              public void imprimirInfo()
              {
            	  System.out.println("\nO nome do cavalo � "+getNome()+", e a idade � "+getIdade()+" anos e pesa "+peso+" kilos");  
              }
             
}
