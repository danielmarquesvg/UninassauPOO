package aula03_IfElse;

import java.util.Scanner;

/*Escreva um programa que leia da entrada
 * inicialmente, o número de gols marcados pelo Campinense e,
 * em seguida, o número de gols marcados pelo Treze
 * num "Clássico dos Maiorais" e que imprima o nome do time vencedor
 * ou a palavra “Empate”, caso o clássico termine empatado
 */

public class Questao23 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de gols do Treze");
		int golsTreze = scanner.nextInt();
		
		System.out.println("Digite a quantidade de gols do Campinense");
		int golsCampinense = scanner.nextInt();
		
		if(golsTreze > golsCampinense) {
			System.out.print("Treze venceu");
		} else if(golsCampinense > golsTreze) {
			System.out.print("Campinense venceu");
		} else {
			System.out.print("Deu empate");
		}
		
		
	}

}
