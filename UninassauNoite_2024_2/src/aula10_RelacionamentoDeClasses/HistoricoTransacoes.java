package aula10_RelacionamentoDeClasses;

public class HistoricoTransacoes {
	
	//atributos
	double saldoAnterior;
	double saldoPosterior;
	String data;
	double valor;
	
	//Construtor
	public HistoricoTransacoes(double saldoAnterior, double saldoPosterior, String data, double valor) {
		this.saldoAnterior = saldoAnterior;
		this.saldoPosterior = saldoPosterior;
		this.data = data;
		this.valor = valor;
	}

	public double getSaldoAnterior() {
		return saldoAnterior;
	}

	public void setSaldoAnterior(double saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}

	public double getSaldoPosterior() {
		return saldoPosterior;
	}

	public void setSaldoPosterior(double saldoPosterior) {
		this.saldoPosterior = saldoPosterior;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
