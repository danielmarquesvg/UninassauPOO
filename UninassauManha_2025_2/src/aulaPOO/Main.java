package aulaPOO;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Daniel", 15);
		System.out.println("Nome da pessoa 1 = ");
		pessoa1.exibirNome();
		
		Pessoa pessoa2 = new Pessoa("Zélia");
		System.out.println("Idade da pessoa 2 = ");
		pessoa2.exibirIdade();
		
		Pessoa pessoa3 = new Pessoa();
		System.out.println("Idade da pessoa 3 = ");
		pessoa3.exibirIdade();
		System.out.println("Nome da pessoa 3 = ");
		pessoa3.exibirNome();
	}

}
