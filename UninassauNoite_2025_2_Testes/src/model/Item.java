package model;

public class Item {
	
	//atributos
	String nome;
	double valor;
	
	//Construtor
	public Item(String novoNome, double novoValor) {
		this.nome = novoNome;
		this.valor = novoValor;
	}

	//metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}
