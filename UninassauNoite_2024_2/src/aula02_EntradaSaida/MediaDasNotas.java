package aula02_EntradaSaida;

public class MediaDasNotas {
	
	public static void main(String[] args) {
		double nota1 = 4.9;
		double nota2 = 9.0;
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Nota 1 = "+nota1);
		System.out.println("Nota 2 = "+nota2);
		System.out.println("Média = "+media);
		
		if(media < 4) {
			System.out.println("Você está reprovado");
		} else if(media >= 4 && media < 7) {
			System.out.println("Você é um finalista");
			
			double provaFinal = 0.5;
			double mediaFinal = media*0.6 + provaFinal*0.4;
			if(mediaFinal < 5) {
				System.out.println("Mesmo indo pra final, você está reprovado");
			} else {
				System.out.println("Se safou, até o próximo período");
			}
		} else {
			System.out.println("Parabéns, aprovado!");
		}
		
		
	}

}
