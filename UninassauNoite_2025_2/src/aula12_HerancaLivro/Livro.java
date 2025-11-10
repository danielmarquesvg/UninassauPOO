package aula12_HerancaLivro;

public class Livro {
	
	//CLASSE MAE - SUPERCLASS
	//atributos
	String titulo;
	String editora;
	
	//Construtor
	public Livro(String titulo, String editora) {
		this.titulo = titulo;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
