package aula06Funcoes;

import java.util.Scanner;

public class FuncaoReferencia {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scanner.nextLine();
		String referenciaBibliografica = referencia(nomeCompleto);
		
		System.out.println(referenciaBibliografica);
			
	}
	
	public static String referencia(String nome) {
		String [] listaNome = nome.split(" ");
		
		String ultimoNome = listaNome[listaNome.length-1];
		ultimoNome = ultimoNome.toUpperCase();
		
		//formatando os outros nomes
		String outrosNomes = "";
		for(int i = 0; i < listaNome.length - 1; i++) {
			String primeirosNomes = listaNome[i];
			outrosNomes = outrosNomes + primeirosNomes.charAt(0)+". ";
		}
		
		String nomeFormatado = ultimoNome +", " + outrosNomes;
		return nomeFormatado;
	}

}
