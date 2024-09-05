package aula04_ForWhile;

import java.util.Scanner;

public class CondicaoWhile {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 1, soma = 0;
		
		while(numero != 0) {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			soma = soma + numero;
			System.out.println("Soma parcial = "+soma);
		}
		
		System.out.println("Soma final = "+soma);
		
	}

}
