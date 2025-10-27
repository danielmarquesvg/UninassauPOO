package aulaFOR;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 1;
		while(opcao != 5) {
			System.out.println("===== Calculadora ======");
			System.out.println();
			System.out.println("Digite uma opção");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair do programa\n");
			opcao = scanner.nextInt();
			if(opcao == 1) {
				System.out.println("Digite o primeiro valor: ");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int n2 = scanner.nextInt();
				int soma = n1 + n2;
				System.out.println("O resultado da soma é: "+soma);
			}
			
			if(opcao == 2) {
				System.out.println("Digite o primeiro valor: ");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int n2 = scanner.nextInt();
				int subtracao = n1 - n2;
				System.out.println("O resultado da subtração é: "+subtracao);
			}
			
			if(opcao == 3) {
				System.out.println("Digite o primeiro valor: ");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int n2 = scanner.nextInt();
				int multiplicacao = n1 * n2;
				System.out.println("O resultado da subtração é: "+multiplicacao);
			}
			
			if(opcao == 4) {
				System.out.println("Digite o primeiro valor: ");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int n2 = scanner.nextInt();
				int divisao = 0;
				if(n2 != 0) {
					divisao = n1 / n2;
				} else {
					System.out.println("Impossível dividir por zero");
				}
				System.out.println("O resultado da divisão é: "+divisao);
			}
			
			if(opcao <= 0 || opcao >= 5) {
				System.out.println("Saindo do programa!");
			}
		}
	}

}
