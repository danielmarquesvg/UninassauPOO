package aulaRevisao;

import java.util.Scanner;

public class EntradaSaida_Questao14 {
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Por favor, digite a altura:");
		double altura = scanner.nextDouble();
		
		System.out.println("Por favor, digite a largura:");
		double largura = scanner.nextDouble();
		
		//processamento
		double valor = altura * largura * 20;
		
		//Saída
		System.out.println("O valor do trabalho é de R$ "+valor);
		
	}

}
