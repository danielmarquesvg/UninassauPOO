package aula12_HerancaLivro;

public class Main {
	
	public static void main(String[] args) {
		LivroDidatico livroEscola = new LivroDidatico("Matemática", "9", "Matemática Básica","Scipione");
		System.out.println("Título: "+livroEscola.getTitulo());
		System.out.println("Editora: "+livroEscola.getEditora());
		
		System.out.println();
		
		LivroHistoria livroDeCabeceira = new LivroHistoria("Romance", 5, "A culpa é das estrelas", "Tainá Edições");
		System.out.println("Título: "+livroDeCabeceira.getTitulo());
		System.out.println("Editora: "+livroDeCabeceira.getEditora());
	}

}
