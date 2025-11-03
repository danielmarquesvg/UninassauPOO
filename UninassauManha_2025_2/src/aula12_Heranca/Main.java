package aula12_Heranca;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome = ");
		String nome = scanner.nextLine();
		
		System.out.println("Data Nascimento: ");
		String data = scanner.nextLine();
		String [] dataNascimento = data.split("/");
		int dia = Integer.parseInt(dataNascimento[0]);
		int mes = Integer.parseInt(dataNascimento[1]);
		int ano = Integer.parseInt(dataNascimento[2]);
		
		
		System.out.println("Tipo de pessoa (Fisica / Juridica): ");
		String tipo = scanner.nextLine();
		
		if(tipo.equals("fisica") || tipo.equals("Fisica")) {
			System.out.println("CPF: ");
			String cpf = scanner.nextLine();
			PessoaFisica pf = new PessoaFisica(nome, dia, mes, ano, cpf);
			pf.mostrarInformacoes();
		} else {
			System.out.println("CNPJ: ");
			String cnpj = scanner.nextLine();
			PessoaJuridica pj = new PessoaJuridica(nome, dia, mes, ano, cnpj);
			pj.mostrarInformacoes();
		}
	}

}
