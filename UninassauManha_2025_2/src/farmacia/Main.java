package farmacia;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome da farmácia: ");
		String nome = scanner.next();
		
		System.out.println("Endereço da farmácia: ");
		String endereco = scanner.next();
		
		System.out.println("Celular da farmácia: ");
		int celular = scanner.nextInt();
		
		System.out.println("E-mail da farmácia: ");
		String email = scanner.next();
		
		System.out.println("CNPJ da farmácia: ");
		int cnpj = scanner.nextInt();
		
		//criando um objeto da farmacia
		Farmacia f1 = new Farmacia(nome, endereco, celular, email, cnpj);
		f1.exibirNome();
		
		System.out.println("Digite um novo Nome da farmácia: ");
		nome = scanner.next();
		f1.alterarNome(nome);
		f1.exibirNome();
		
	}

}
