package aula13_ClasseAbstrata;

public class BoloCasamento extends FormaDeBolo {
	
	double preco;
	
	public BoloCasamento(int tamanho, String tipo, double preco) {
		super(tamanho, tipo);
		this.preco = preco;
	}

	public void modoDePreparo() {
		System.out.println("Pague para alguém fazer");		
	}

}
