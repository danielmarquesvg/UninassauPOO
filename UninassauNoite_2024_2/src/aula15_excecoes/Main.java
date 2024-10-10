package aula15_excecoes;

public class Main {
	
	public static void main(String[] args) {
		Conta minhaConta = new Conta(100);
		minhaConta.exibirSaldo();
		try {
			minhaConta.sacar(80);
		} catch (IllegalArgumentException e) {
			System.out.println("Exceção capturada: "+e.getMessage());
		}
		
		minhaConta.exibirSaldo();
		
		try {
			minhaConta.sacar(80);
		} catch (IllegalArgumentException e) {
			System.out.println("Exceção capturada: "+e.getMessage());
		}
		
		minhaConta.exibirSaldo();
	}

}
