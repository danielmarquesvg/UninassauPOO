package aula04_ForWhile;

import java.util.Scanner;

public class RepeticaoWhile {
	
	public static void main(String[] args) {
		
		double numero = 1, soma = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(numero != 0) {
			System.out.println("Digite um número: ");
			numero = scanner.nextDouble();
			soma = soma + numero;
			System.out.println("Soma parcial = "+soma);
		}
		
		System.out.println("A soma final é :"+soma);
	}

}
