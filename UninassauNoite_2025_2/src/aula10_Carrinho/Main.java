package aula10_Carrinho;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome = ");
		String nome = scanner.nextLine();
		System.out.println();
		
		Pessoa pessoa = new Pessoa(nome);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Nome do produto = ");
			String nomeDoProduto = scanner.nextLine();
			
			System.out.print("Preço do produto = ");
			double precoDoProduto = scanner.nextDouble();
			scanner.nextLine();
			
			pessoa.carrinho.adicionarItem(nomeDoProduto, precoDoProduto);
		}
		
		pessoa.carrinho.mostrarItens();
	}

}
