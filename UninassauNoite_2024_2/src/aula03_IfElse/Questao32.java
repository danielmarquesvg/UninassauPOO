package aula03_IfElse;

import java.util.Scanner;

public class Questao32 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o sexo da pessoa: ");
		String sexo = scanner.next();
		System.out.println("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		
		double resultado;
		if(sexo == "m" || sexo == "M" || sexo == "masculino" || sexo == "Masculino" || sexo == "MASCULINO") {
			resultado = 72.7 * altura - 58;
		} else {
			resultado = 62.1 * altura - 44.7;
		}
		
		System.out.println("Seu peso ideal é: "+resultado);
	}

}
