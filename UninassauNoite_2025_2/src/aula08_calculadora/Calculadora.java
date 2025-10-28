package aula08_calculadora;

public class Calculadora {
	
	//atributos
	double memoria1;
	double memoria2;
	double resultado;
	
	public Calculadora() {
		this.memoria1 = 0;
		this.memoria2 = 0;
		this.resultado = 0;
	}
	
	public void exibirStatus() {
		System.out.println("\nMemória 1 = "+this.memoria1);
		System.out.println("Memória 2 = "+this.memoria2);
		System.out.println("Resultado = "+this.resultado);
	}
	
	public void exibirResultado() {
		System.out.println("\nResultado = "+this.resultado);
	}
	
	public void somar(double n1, double n2) {
		this.memoria1 = n1;
		this.memoria2 = n2;
		this.resultado = this.memoria1 + this.memoria2;
	}
	
	public void exponenciacao(double base, double expoente) {
		this.memoria1 = base;
		this.memoria2 = expoente;
		this.resultado = Math.pow(base, expoente);
	}

}
