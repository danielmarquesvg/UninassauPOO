package aula01;

import java.util.Scanner;

public class Exemplo01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String texto = scanner.nextLine();
		System.out.println("Seu nome é: "+texto);
		
	}

}
