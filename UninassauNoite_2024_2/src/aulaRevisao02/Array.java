package aulaRevisao02;

public class Array {
	
	/*
	 * Escreva um programa que receba
	 * um array de temperaturas do dia
	 * e calcule a temperatura media do dia
	 */
	
	public static void main(String[] args) {
		double [] listaTemperatura = {18.5, 17.1, 19.4, 20.2, 29, 35, 28, 20};
		
		double soma = 0;
		double contador = 0;
		for(int i = 0; i < listaTemperatura.length; i = i + 1) {
			soma = soma + listaTemperatura[i];
			contador = contador + 1;
		}
		
		double temperaturaMedia = soma / contador;
		
		System.out.println("Temperatura média = "+temperaturaMedia);
	}

}
