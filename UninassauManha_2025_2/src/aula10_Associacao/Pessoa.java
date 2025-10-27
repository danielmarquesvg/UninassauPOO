package aula10_Associacao;

public class Pessoa {
	
	//atributos
	public String nome;
	public Endereco endereco;
	
	//Construtor
	public Pessoa(String nome, String rua, int numero, String complemento, String bairro) {
		Endereco endereco1 = new Endereco(rua, numero, complemento, bairro);
		this.nome = nome;
		this.endereco = endereco1;
	}
	
	//metodos
	public void verNome() {
		System.out.println("Nome = "+this.nome);
	}
	
	public void alterarNome(String novoNome) {
		this.nome = novoNome;
	}

}
