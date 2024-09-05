package aula02_EntradaSaida;

import java.util.Scanner;

public class EntradaSaida {
	
	public static void main(String[] args) {
		
		//Scanner eh o objeto para ler dados
		Scanner leitor = new Scanner(System.in);
		
		//mensagem para digitar algo
		//Entrada de dados
		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();
		
		//processamento
		int dias = idade * 365;
		
		//saida
		System.out.println("Voce ja viveu "+dias+" dias\n\tParabens meu caro");
		
	}

}










