package aula03_IfElse;

import java.util.Scanner;

public class Questao22 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do coeficente a: ");
		int a = scanner.nextInt();
		
		System.out.print("Digite o valor do coeficente b: ");
		int b = scanner.nextInt();
		
		System.out.print("Digite o valor do coeficente c: ");
		int c = scanner.nextInt();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		if(delta < 0) {
			System.out.println("Não existem raízes reais");
		} else if (delta == 0) {
			double x1 = (-b) / (2*a);
			System.out.println("Raíz da equação é: "+x1);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2*a);
			double x2 = (-b - Math.sqrt(delta)) / (2*a);
			System.out.println("Raízes da equação: x1 é: "+x1+" e x2 = "+x2);
			
		}
		
	}

}
