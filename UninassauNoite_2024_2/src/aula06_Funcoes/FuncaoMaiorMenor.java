package aula06_Funcoes;

public class FuncaoMaiorMenor {
	
	public static void main(String[] args) {
		
		int [] lista = {3, 0, 12, 5, -7, 8, 3, 5};
		int meuMaior = maior(lista);
		System.out.println("O maior número da lista é: "+meuMaior);
		
	}
	
	public static int maior(int [] minhaLista) {
		int maiorNumero = minhaLista[0];
		for(int i = 1; i < minhaLista.length; i++) {
			if(minhaLista[i] > maiorNumero) {
				maiorNumero = minhaLista[i];
			}
		}
		return maiorNumero;
	}
}
