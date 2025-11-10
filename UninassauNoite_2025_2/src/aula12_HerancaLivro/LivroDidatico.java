package aula12_HerancaLivro;

public class LivroDidatico extends Livro {
	
	//CLASSE FILHA - SUBCLASS
	//Atributos
	String disciplina;
	String serie;
	
	
	//Construtor
	public LivroDidatico(String disciplina, String serie, String titulo, String editora) {
		super(titulo, editora);
		this.disciplina = disciplina;
		this.serie = serie;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
}
