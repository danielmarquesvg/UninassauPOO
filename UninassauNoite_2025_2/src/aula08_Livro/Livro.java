package aula08_Livro;

public class Livro {
	
	//atributos
	String titulo;
	String autor;
	int paginas;
	int anoPublicacao;
	
	//Construtor
	public Livro() {}
	
	public void exibirInformacoesLivro() {
		System.out.println("Título = "+this.titulo);
		System.out.println("Autor = "+this.autor);
		System.out.println("Páginas = "+this.paginas);
		System.out.println("Ano de publicação = "+this.anoPublicacao);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		if(anoPublicacao < 0) {
			this.anoPublicacao = anoPublicacao * (-1);
		} else {
			this.anoPublicacao = anoPublicacao;
		}
		
	}

	
	
}
