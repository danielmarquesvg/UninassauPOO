package aula14_Interface;

public class Main {
	
	public static void main(String[] args) {
		
		Carro meuCarro = new Carro("Chevrolet", "Chevette 87", 20000);
		System.out.println("Valor do emplacamento = R$ "+meuCarro.emplacamento(meuCarro.valor));
		System.out.println("Taxa de bombeiro R$ = "+meuCarro.taxaBombeiro());
		System.out.println("IPVA = R$ "+meuCarro.calcularIPVA(meuCarro.getValor()));
		
	}

}
