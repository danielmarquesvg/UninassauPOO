package aula05Array;

import java.util.Scanner;

public class MaiorElementoArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho do array: ");
		int tamanho = scanner.nextInt();
		int [] minhaLista = new int [tamanho];
		
		//adicionando elementos digitados pelo usuário
		for(int i = 0; i < minhaLista.length; i++) {
			System.out.print("minhaLista["+i+"] = ");
			minhaLista[i] = scanner.nextInt();
		}
		
		//buscando o maior valor
		int maior = minhaLista[0];
		for(int i = 1; i < minhaLista.length; i++) {
			if(minhaLista[i] > maior) {
				maior = minhaLista[i];
			}
		}
		
		System.out.println("O maior valor do array é: "+maior);
		
	}

}
