package aulaIF;

import java.util.Scanner;

public class ParNumero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0 && numero < 100) {
			System.out.println("O número "+numero+" é par e menor que 100");
		} else if(numero % 2 == 0 && numero >= 100) {
			System.out.println("O número "+numero+" é par e maior ou igual a 100");
		} else if(numero % 2 == 1 && numero < 100) {
			System.out.println("O número "+numero+" é ímpar e menor que 100");
		} else {
			System.out.println("O número "+numero+" é ímpar e maior ou igual a 100");
		}
		
	}

}
