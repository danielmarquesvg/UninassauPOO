package aula02_EntradaSaida;

import java.util.Scanner;

public class LerDados {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite a sua idade: ");
		int idade = leitor.nextInt();
		
		//processamento
		int dias = idade * 365;
		
		//saida
		System.out.println("Você viveu "+dias+" dias\n\n\tParabéns");
		
	}

}
