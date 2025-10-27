package aulaFOR;

import java.util.Scanner;

public class SomaNumerosWhile {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		int numero = 1;
		while(numero != 0) {
			System.out.println("Digite um valor: ");
			numero = scanner.nextInt();
			soma = soma + numero;
			System.out.println("Soma parcial = "+soma);
			System.out.println();
		}
		System.out.println("A soma final é: "+soma);
	}

}
