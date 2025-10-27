package aula10_compras;

public class Produto {
	
	String nome;
	double valor;
	int id;
	
	public Produto(String nome, double valor, int id) {
		this.nome = nome;
		this.valor = valor;
		this.id = id;
	}

	//ver o nome
	public String getNome() {
		return nome;
	}
	
	//alterar nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
