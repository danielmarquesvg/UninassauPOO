package aula06Funcoes;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, digite o primeiro valor: ");
		double x1 = scanner.nextDouble();
		System.out.println("Por favor, digite o segundo valor: ");
		double x2 = scanner.nextDouble();
		double x3 = somar(x1, x2);
		System.out.println("O resultado da soma é: "+x3);
		mostrarFIM();	
	}
	
	public static double somar(double a, double b) {
		double resultadoDaSoma = a + b;
		return resultadoDaSoma;
	}
	
	public static void mostrarFIM() {
		System.out.println("FIM DO PROGRAMA");
	}
	
	public static String referencia(String nome) {
		String [] listaNome = nome.split(" ");
		return "";
	}
	

}
