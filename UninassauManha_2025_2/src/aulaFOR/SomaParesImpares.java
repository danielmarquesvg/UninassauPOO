package aulaFOR;

public class SomaParesImpares {
	
	public static void main(String[] args) {
		
		int i;
		int somaPares = 0;
		int somaImpares = 0;
		for(i = 0; i <= 1001; i = i + 1) {
			if(i % 2 == 0) {
				somaPares = somaPares + i;
			} else {
				somaImpares = somaImpares + i;
			}
			System.out.println("índice da repetição = "+i);
			System.out.println("Soma parcial dos pares = "+somaPares);
			System.out.println("Soma parcial dos ímpares = "+somaImpares);
			System.out.println();
		}
		
		System.out.println("Soma final dos pares = "+somaPares);
		System.out.println("Soma final dos ímpares = "+somaImpares);
	}

}
