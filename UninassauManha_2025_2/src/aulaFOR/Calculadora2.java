package aulaFOR;

import java.util.Scanner;

public class Calculadora2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;
		
		while(opcao >= 1 && opcao <= 4) {
			System.out.println("====== Calculadora =======");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("Outros valores - Sair do programa");
			System.out.println("Digite uma opção: ");
			opcao = scanner.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o primeiro valor: ");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int n2 = scanner.nextInt();
				int resultado = n1 + n2;
				System.out.println("O resultado da soma é: "+resultado);
				
			} else if(opcao == 2) {
				System.out.println("Digite o primeiro valor: ");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int n2 = scanner.nextInt();
				int resultado = n1 - n2;
				System.out.println("O resultado da subtração é: "+resultado);
				
			} else if(opcao == 3) {
				System.out.println("Digite o primeiro valor: ");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int n2 = scanner.nextInt();
				int resultado = n1 * n2;
				System.out.println("O resultado da multiplicação é: "+resultado);
				
			}  else if(opcao == 4) {
				System.out.println("Digite o primeiro valor: ");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int n2 = scanner.nextInt();
				
				if(n2 != 0) {
					int resultado = n1 / n2;
					System.out.println("O resultado da divisão é: "+resultado);
				} else {
					System.out.println("Impossível dividir por zero");
				}
			} else {
				System.out.println("Saindo do programa, estão abençoados!");
			}
				
		}
	}

}
