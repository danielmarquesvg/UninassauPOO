package aula09_ClasseObjetoLivro;

public class Livro {
	
	//atributos
	private String nome;
	public String autor;
	public int anoDePublicacao;
	public String editora;
	
	//Construtor
	public Livro(String novoNome, String novoAutor, int ano, String novaEditora) {
		this.nome = novoNome;
		this.autor = novoAutor;
		this.anoDePublicacao = ano;
		this.editora = novaEditora;
	}
	
	//metodos
	public void informacoesDoLivro() {
		System.out.println("Nome do livro: "+this.nome);
		System.out.println("Autor do livro: "+this.autor);
		System.out.println("Ano de publicação: "+this.anoDePublicacao);
		System.out.println("Editora do livro: "+this.editora);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
}



