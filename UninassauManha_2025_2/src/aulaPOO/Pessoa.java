package aulaPOO;

public class Pessoa {
	
	//atributos
	String nome;
	int idade;
	
	//MÉTODO CONSTRUTOR
	public Pessoa(String novoNome, int novaIdade) {
		this.nome = novoNome;
		this.idade = novaIdade;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public Pessoa(){}
	
	
	//metodos
	public void exibirNome() {
		System.out.println(this.nome);
	}
	
	public void alterarNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void exibirIdade() {
		System.out.println(this.idade);
	}

}
