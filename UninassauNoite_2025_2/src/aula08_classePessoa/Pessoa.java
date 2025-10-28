package aula08_classePessoa;

public class Pessoa {
	
	//atributos
	String nome;
	String cpf;
	String celular;
	
	//Construtor
	public Pessoa(String nome, String cpf, String celular) {
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
	}
	
	public Pessoa(String novoNome) {
		this.nome = novoNome;
	}
	
	//metodos
	public void falarNome() {
		System.out.println("Nome = "+this.nome);
	}
	
	public void alterarNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void exibirCelular() {
		System.out.println("Celular = "+celular);
	}

}
