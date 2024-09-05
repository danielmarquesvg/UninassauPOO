package aula06_Funcoes;

public class FuncoesMaiorMenor {
	
	public static void main(String[] args) {
		
		//entrada de dados
		int [] listaInteiros = {9, -4, 2, 3, 0, 10, 15, -7, -6, 8};
		
		int maiorNumero = maiorNumero(listaInteiros);
		System.out.println("O maior número do array é: "+maiorNumero);
		
		int menorNumero = menorNumero(listaInteiros);
		System.out.println("O menor número do array é: "+menorNumero);
		
	}
	
	public static int maiorNumero(int [] lista) {
		int maior = lista[0];
		//percorrendo o array da posição 1 até o final
		for(int i = 1; i < lista.length; i++) {	
			//comparar o elemento atual do array com a variavel MAIOR
			if(lista[i] > maior) {
				maior = lista[i];
			}
		}
		return maior;
	}
	
	public static int menorNumero(int [] lista) {
		int menor = lista[0];
		//percorrendo o array da posição 1 até o final
		for(int i = 1; i < lista.length; i++) {	
			//comparar o elemento atual do array com a variavel MENOR
			if(lista[i] < menor) {
				menor = lista[i];
			}
		}
		return menor;
	}

}
