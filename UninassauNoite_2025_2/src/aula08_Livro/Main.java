package aula08_Livro;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Livro l1 = new Livro();
		
		System.out.println("Digite o título do livro: ");
		String titulo = scanner.nextLine();
		
		System.out.println("Digite o autor do livro: ");
		String autor = scanner.nextLine();
		
		System.out.println("Digite a quantidade de páginas do livro: ");
		int paginas = scanner.nextInt();
		
		System.out.println("Digite o ano de publicação do livro: ");
		int ano = scanner.nextInt();
		
		l1.setTitulo(titulo);
		l1.setAutor(autor);
		l1.setAnoPublicacao(ano);
		l1.setPaginas(paginas);
		System.out.println();
		l1.exibirInformacoesLivro();
	}

}
