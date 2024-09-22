package aula09_ClasseObjetoLivro;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nomeDoLivro = scanner.nextLine();
		
		System.out.println("Digite o autor: ");
		String nomeDoAutor = scanner.nextLine();
		
		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();
		
		System.out.println("Digite a editora: ");
		String editora = scanner.next();
		
		//programacao orientada a objetos
		// tipo nomeVariavel = valor
		Livro livro1 = new Livro(nomeDoLivro, nomeDoAutor, ano, editora);
		//livro1.informacoesDoLivro();
		
		System.out.println("Nome: "+livro1.getNome());
		livro1.setNome("Python");
		System.out.println("Nome: "+livro1.getNome());
		
	}

}









