package aulaRevisao;

import java.util.Scanner;

public class IF_ELSE_Q01 {
	
	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que receba a idade de
		 * uma pessoa e categorize ela pela idade,
		 * sendo valor inválido, menor que zero
		 * sendo criança entre 0 e 17 anos,
		 * adulto entre 18 e 64 anos
		 * e idoso a partir de 65 anos
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		//Entrada e saída
		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		//processamento e saída
		if(idade < 0) {
			System.out.println("Idade inválidade");
		} else if(idade >= 0 && idade <= 17) {
			System.out.println("Você é uma criança");
		} else if (idade >= 18 && idade <= 64) {
			System.out.println("Você é um adulto");
		} else {
			System.out.println("Você é um idoso");
		}
		
	}

}




