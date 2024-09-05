package aula05_Arrays;

import java.util.Scanner;

public class Listas {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho do array: ");
		int tamanho = scanner.nextInt();
		
		String [] listaDeDaniel = new String[tamanho];
		
		//adicionar elementos no array
		listaDeDaniel[0] = "Olá";
		listaDeDaniel[1] = "Oi";
		
		for(int i = 0; i < listaDeDaniel.length; i++) {
			if(listaDeDaniel[i] != null) {
				System.out.println("O elemento da posição "+i+" é "+listaDeDaniel[i]);
			}
			
		}
		
		System.out.println("Elemento da posição 1: "+listaDeDaniel[1]);
		
	}

}
