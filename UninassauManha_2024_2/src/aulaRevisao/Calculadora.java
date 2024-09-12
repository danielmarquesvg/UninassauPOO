package aulaRevisao;

import java.util.Scanner;

public class Calculadora {
	
	/*
	 * Escreva um programa que peça para o usuário
	 * digitar um valor entre 1 e 5, onde
	 * 1 - somar dois números
	 * 2 - subtrair dois números
	 * 3 - multiplicar dois números
	 * 4 - dividir dois números
	 * qualquer outro valor - encerrar o programa
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1, n2, resultado;
		
		System.out.println("==== Calculadora ====");
		int opcao = 1;
		
		while(opcao >= 1 && opcao <= 4) {
			System.out.println("Escolha uma opção e digite o número da operação");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("Qualquer outro valor - sair do programa");
			
			opcao = scanner.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o valor do primeiro número: ");
				n1 = scanner.nextDouble();
				System.out.println("Digite o valor do segundo número: ");
				n2 = scanner.nextDouble();
				resultado = n1 + n2;
				System.out.println("Resultado da soma = "+resultado);
			} else if(opcao == 2) {
				System.out.println("Digite o valor do primeiro número: ");
				n1 = scanner.nextDouble();
				System.out.println("Digite o valor do segundo número: ");
				n2 = scanner.nextDouble();
				resultado = n1 - n2;
				System.out.println("Resultado da subtração = "+resultado);
			} else if(opcao == 3) {
				System.out.println("Digite o valor do primeiro número: ");
				n1 = scanner.nextDouble();
				System.out.println("Digite o valor do segundo número: ");
				n2 = scanner.nextDouble();
				resultado = n1 * n2;
				System.out.println("Resultado da multiplicação = "+resultado);
			} else if(opcao == 4) {
				System.out.println("Digite o valor do primeiro número: ");
				n1 = scanner.nextDouble();
				System.out.println("Digite o valor do segundo número: ");
				n2 = scanner.nextDouble();
				
				if(n2 == 0) {
					System.out.println("Impossível dividir por zero");
				} else {
					resultado = n1 / n2;
					System.out.println("Resultado da divisão = "+resultado);
				}	
				
			} else {
				System.out.println("Opção Inválida, saindo do programa");
			}
		}
	}
}
