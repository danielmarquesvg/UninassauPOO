package aula10_RelacionamentoDeClasses;

public class Cliente {
	
	//Atributos
	String nome;
	Conta contaBancaria;
	
	//Construtor
	public Cliente(String nome, Conta conta) {
		this.nome = nome;
		this.contaBancaria = conta;
	}
	public Cliente() {}
	
	//metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conta getContaBancaria() {
		return contaBancaria;
	}
	public void setContaBancaria(Conta contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

}
