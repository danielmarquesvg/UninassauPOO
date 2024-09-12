package aulaRevisao;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		/*
		 * Crie um array que receba 12 valores,
		 * se o valor for positivo, quer dizer
		 * que houve lucro no final do mês,
		 * se o valor for negativo, quer dizer
		 * que houve prejuízo no final do mês,
		 * se o valor for zero, não houve prejuízo
		 * ou lucro.
		 * Mostre ao final do ano, se houve lucro,
		 * prejuízo, ou nenhum dos dois
		 */
		Scanner scanner = new Scanner(System.in);
		double [] lista = new double[12];
		
		double soma = 0;
		for(int i = 0; i < 12; i++) {
			System.out.println("Digite o valor do mês "+(i+1)+" = ");
			lista[i] = scanner.nextDouble();
			soma = soma + lista[i];
		}
		
		if(soma > 0) {
			System.out.println("Lucro de R$ "+soma);
		} else if(soma == 0) {
			System.out.println("Não houve lucro, nem prejuízo");

		} else {
			System.out.println("Houve um prejuízo de R$ "+soma);
		}
	}

}
