package farmacia;

public class Farmacia {
	
	//atributos
	String nome;
	String endereco;
	int celular;
	String email;
	int cnpj;
	
	public Farmacia(String nome, String endereco, int celular, String email, int cnpj) {
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		this.email = email;
		this.cnpj = cnpj;
	}
	
	public void alterarNome(String novoNome) {
		this.nome = novoNome;
		System.out.println("Nome alterado com sucesso.\n");
	}
	
	public void exibirNome() {
		System.out.println("Nome da farmácia = "+this.nome);
	}

}
