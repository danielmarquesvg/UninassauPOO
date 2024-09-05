package aula04_ForWhile;

import java.util.Scanner;

public class SomaDosImpares {
	
	/*
	 * Escreva um programa que some os números ímpares e pares
	 * mas separadamente de um intervalo determinado
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Digite o início do intervalo: ");
		int inicio = scanner.nextInt();
		
		System.out.print("Digite o final do intervalo: ");
		int fim = scanner.nextInt();
		
		int somaDosPares = 0, somaDosImpares = 0;
		for(int i = inicio; i <= fim; i++) {
			if(i % 2 == 1) {
				somaDosImpares = somaDosImpares + 1;
			} else {
				somaDosPares = somaDosPares + 1;
			}
		}
		
		System.out.println("Soma dos pares = "+somaDosPares);
		System.out.println("Soma dos ímpares = "+somaDosImpares);
		
	}
	
}







