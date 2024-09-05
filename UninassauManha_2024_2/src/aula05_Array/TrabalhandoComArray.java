package aula05_Array;

import java.util.Scanner;

public class TrabalhandoComArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o tamanho do array: ");
		int tamanho = scanner.nextInt();
		System.out.println(); //pular linha
		
		String [] listaNomes = new String [tamanho];
		
		//adicionando elementos
		for(int i = 0; i < tamanho; i++) {
			System.out.print("Digite o nome da posição "+i+": ");
			listaNomes[i] = scanner.next();
		}
		
		listaNomes[1] = "Vivo";
		
		//mostrando os elementos do array
		for(int i = 0; i < listaNomes.length; i++) {
			System.out.println("O nome da posição "+i+" = "+listaNomes[i]);
		}
	}

}






