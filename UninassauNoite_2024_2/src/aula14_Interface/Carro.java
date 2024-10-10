package aula14_Interface;

public class Carro implements ITributavel, IImposto {

	//atributos
	String marca;
	String modelo;
	double valor;
	
	//Construtor
	public Carro(String marca, String modelo, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	public double emplacamento(double fipDoCarro) {
		double valor = 0.05 * fipDoCarro;
		return valor;
	}

	public double taxaBombeiro() {
		return taxaBombeiro;
	}

	public double calcularIPVA(double valorDoCarro) {
		double valorDoIPVA = (0.05 * valorDoCarro) + (0.02 * valorDoCarro) + taxaBombeiro;
		return valorDoIPVA;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
