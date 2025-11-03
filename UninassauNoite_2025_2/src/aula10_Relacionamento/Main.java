package aula10_Relacionamento;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome = ");
		String nome = scanner.nextLine();
		
		System.out.print("Rua = ");
		String rua = scanner.nextLine();
		
		System.out.print("Numero = ");
		String numero = scanner.nextLine();
		
		System.out.print("Complemento = ");
		String complemento = scanner.nextLine();
		
		System.out.print("Bairro = ");
		String bairro = scanner.nextLine();
		
		Pessoa pessoa = new Pessoa(nome, rua, numero, complemento, bairro);
		
		System.out.println("Verificando o objeto: ");
		pessoa.verInformacoes();
		
	}

}
