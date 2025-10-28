package aula08_classePessoa;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoinha = new Pessoa("Júlia", "0987.765", "(83)9876544");
		pessoinha.falarNome();
		pessoinha.exibirCelular();
		
		Pessoa p2 = new Pessoa("Lucas");
		p2.falarNome();
		p2.exibirCelular();

	}

}
