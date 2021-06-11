package orientaçãoaobjetos;
/* 1 - Crie uma hierarquia de classes conforme abaixo com os seguintes 
atributos e comportamentos (observe a tabela), 
utilize os seus conhecimentos e distribua as características de
 forma que tudo o que for comum a todos os animais fique na classe Animal: 
*/

public abstract class animal
{
	private String tipoAnimal;

            abstract public void Nome(String nomeAnimal);
            abstract public void Idade(int idadeAnimal);
            abstract public void Som(String somAnimal);
     
             public void Animal (String tipoAnimal) 
             { 
            	 this.tipoAnimal = tipoAnimal;
             }

			public String getTipoAnimal() {
				return tipoAnimal;
			}

			public void setTipoAnimal(String tipoAnimal) {
				this.tipoAnimal = tipoAnimal;
			}
}            