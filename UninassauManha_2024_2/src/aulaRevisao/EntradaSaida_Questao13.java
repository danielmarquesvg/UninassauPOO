package aulaRevisao;

import java.util.Scanner;

public class EntradaSaida_Questao13 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Por favor, digite a distancia inicial (s0):");
		double s0 = scanner.nextDouble();
		
		System.out.println("Por favor, digite a velocidade (v):");
		double velocidade = scanner.nextDouble();
		
		System.out.println("Por favor, digite o tempo (t):");
		double tempo = scanner.nextDouble();
		
		//processamento
		double distanciaFinal = s0 + (velocidade * tempo);
		
		//saída
		System.out.println("A distância final = "+distanciaFinal);
		
		
		
	}

}
