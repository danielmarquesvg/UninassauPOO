package aula15_Excecoes;

public class Conta {
	
	//atributos
	double saldo;
	
	//construtor
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	//metodos
	public void sacar(double valorDoSaque) {
		if(valorDoSaque > this.saldo) {
			throw new IllegalArgumentException("Saldo insuficiente");
		} else {
			this.saldo = this.saldo - valorDoSaque;
		}
	}
	
	public void exibirSaldo() {
		System.out.println("Seu saldo é: "+this.saldo);
	}
	

}
