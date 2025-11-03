package aula10_Relacionamento;

public class Pessoa {
	
	//atributos
	String nome;
	Endereco endereco;
	
	public Pessoa(String nome, String rua, String numero, String complemento, String bairro) {
		Endereco novoEndereco = new Endereco(rua, numero, complemento, bairro);
		this.nome = nome;
		this.endereco = novoEndereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void verInformacoes() {
		System.out.println("Nome = "+this.nome);
		System.out.println("Rua = "+this.endereco.rua);
		System.out.println("Numero = "+this.endereco.numero);
		System.out.println("Complemento = "+this.endereco.complemento);
		System.out.println("Bairro = "+this.endereco.bairro);
	}
	
}
