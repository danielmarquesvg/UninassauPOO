package aula13_ClasseAbstrata;

public abstract class FormaDeBolo {
	
	//atributos
	int tamanho;
	String tipo;
	
	public FormaDeBolo(int tamanho, String tipo) {
		this.tamanho = tamanho;
		this.tipo = tipo;
	}

	//metodos
	public abstract void modoDePreparo();

}
