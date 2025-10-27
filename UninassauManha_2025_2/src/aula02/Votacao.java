package aula02;

import java.util.Scanner;

public class Votacao {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Por favor, digite a sua idade: ");
		int idade = leitor.nextInt();
		
		if(idade < 0) {
			System.out.println("Idade inválida");
		} else {
			if(idade >= 0 && idade < 16) {
				System.out.println("Não pode votar");
			} else {
				if(idade >= 17 && idade < 18) {
					System.out.println("Voto facultativo");
				} else {
					if(idade >= 18 && idade < 70) {
						System.out.println("Voto obrigatório");
					} else {
						System.out.println("Voto facultativo");
					}
				}
			}
		}
		leitor.close();
	}
}
