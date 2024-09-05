package aula05_Array;

public class MaiorNumero {
	
	public static void main(String[] args) {
		int [] lista = {10, -3, 15, 80, 70};
		
		int maior = lista[0];
		int menor = lista[0];
		for(int i = 1; i < lista.length; i++) {
			if(lista[i] > maior) {
				maior = lista[i];
			}
			if(lista[i] < menor) {
				menor = lista[i];
			}
		}
		
		System.out.println("O maior número é: "+maior);
		System.out.println("O menor número é: "+menor);
		
		
	}

}
