package aula02_EntradaSaida;

import java.util.Scanner;

public class Equacao2Grau {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da a = ");
		int a = scanner.nextInt();
		
		System.out.print("Digite o valor da b = ");
		int b = scanner.nextInt();
		
		System.out.print("Digite o valor da c = ");
		int c = scanner.nextInt();
		
		//calculo de delta
		double delta = Math.pow(b, 2) - 4*a*c;
		System.out.println("O valor de delta = "+delta);
		
	}

}
