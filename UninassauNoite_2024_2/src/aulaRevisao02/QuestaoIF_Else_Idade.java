package aulaRevisao02;

public class QuestaoIF_Else_Idade {
	
	/*
	 * Escreva um programa que receba a idade
	 * de uma pessoa e classifique como
	 * criança, adulto e idoso
	 * Tome nota: cuidado com idades negativas
	 */
	
	
	public static void main(String[] args) {
		
		int idade = -2;
		
		if(idade < 0) {
			System.out.println("Idade inválida");
		} else if(idade >= 0 && idade < 18){
			System.out.println("Criança");
		} else if(idade >= 18 && idade < 65) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		
	}

}
