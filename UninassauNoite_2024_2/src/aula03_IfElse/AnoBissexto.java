package aula03_IfElse;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = scanner.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano "+ ano +" é bissexto");
		} else {
			System.out.println("O ano "+ ano +" não é bissexto");
		}
		
	}

}
