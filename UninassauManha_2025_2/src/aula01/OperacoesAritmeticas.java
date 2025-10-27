package aula01;

import java.util.Scanner;

public class OperacoesAritmeticas {
	
	public static void main(String[] args) {
		//entrada de dados
		Scanner scanner = new Scanner(System.in);
		double valor01, valor02;
		
		System.out.println("Digite o primeiro valor: ");
		valor01 = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		valor02 = scanner.nextDouble();
		
		//processamento dos dados
		double soma = valor01 + valor02;
		double subtracao = valor01 - valor02;
		double multiplicacao = valor01 * valor02;
		double divisao = valor01 / valor02;
		double exponenciacao = Math.pow(valor01, valor02);
		double radiciacao = Math.sqrt(valor01);
		
		//saida de dados
		System.out.println("A soma é: "+soma);
		System.out.println("A subtração é: "+subtracao);
		System.out.println("A multiplicação é: "+multiplicacao);
		System.out.println("A divisão é: "+divisao);
		System.out.println("A exponenciação é : "+exponenciacao);
		System.out.println("A radiciação é : "+radiciacao);
		
	}

}
