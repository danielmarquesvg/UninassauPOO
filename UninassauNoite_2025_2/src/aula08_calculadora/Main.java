package aula08_calculadora;

public class Main {
	
	public static void main(String[] args) {
		Calculadora casio = new Calculadora();
		casio.exibirStatus();
		
		casio.somar(20, 30);
		casio.exibirStatus();

		casio.exponenciacao(2, 4);
		casio.exibirStatus();
	}

}
