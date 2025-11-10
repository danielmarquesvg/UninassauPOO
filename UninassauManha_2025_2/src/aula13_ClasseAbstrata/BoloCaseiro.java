package aula13_ClasseAbstrata;

public class BoloCaseiro extends FormaDeBolo {

	double valor;
	String validade;
	
	public BoloCaseiro(int tamanho, String tipo, double valor, String validade) {
		super(tamanho, tipo);
		this.valor = valor;
		this.validade = validade;
	}
	
	public void modoDePreparo() {
		System.out.println("Faça em casa ou compre na mercearia");
	}
}
