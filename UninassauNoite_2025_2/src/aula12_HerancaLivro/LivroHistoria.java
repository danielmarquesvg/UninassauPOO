package aula12_HerancaLivro;

public class LivroHistoria extends Livro {
	
	String genero;
	int volume;
	
	public LivroHistoria(String genero, int volume, String titulo, String editora) {
		super(titulo, editora);
		this.genero = genero;
		this.volume = volume;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	

}
