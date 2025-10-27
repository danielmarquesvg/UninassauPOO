package aula10_Associacao;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		scanner.reset();
	
		System.out.println("Digite sua rua: ");
		String rua = scanner.nextLine();
		scanner.reset();
		
		System.out.println("Digite o número da residência: ");
		Integer numero = scanner.nextInt();
		scanner.reset();
		
		System.out.println("Digite o complemento: ");
		String complemento = scanner.nextLine();
		
		System.out.println("Digite seu bairro: ");
		String bairro = scanner.nextLine();

		
		Pessoa pessoinha = new Pessoa(nome, rua, numero, complemento, bairro);
		pessoinha.verNome();
		pessoinha.alterarNome("Toinho do gás");
		pessoinha.verNome();
		pessoinha.endereco.verEndereco();
		
	}

}
