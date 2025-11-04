package aula10_Carrinho;

public class Pessoa {
	
	String nome;
	Carrinho carrinho;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.carrinho = new Carrinho();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
}
