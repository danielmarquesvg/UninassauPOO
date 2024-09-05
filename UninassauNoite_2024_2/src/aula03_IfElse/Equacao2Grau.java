package aula03_IfElse;

import java.util.Scanner;

public class Equacao2Grau {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//entrada
		System.out.print("Digite o valor de a = ");
		int a = scanner.nextInt();
		System.out.print("Digite o valor de b = ");
		int b = scanner.nextInt();
		System.out.print("Digite o valor de c = ");
		int c = scanner.nextInt();
		
		//processamento
		double delta = (Math.pow(b, 2)) - (4*a*c);
		
		if(delta < 0) {
			System.out.println("Não existem raízes reais");
		} else if (delta == 0) {
			double x1 = (-b + Math.sqrt(delta)) / (a * 2);
			System.out.println("O valor de x1 = "+x1);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (a * 2);
			double x2 = (-b - Math.sqrt(delta)) / (a * 2);
			System.out.println("O valor de x1 = "+x1+ " e x2 = "+x2);
		}
		
		
	}

}
