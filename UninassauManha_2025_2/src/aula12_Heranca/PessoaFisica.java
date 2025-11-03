package aula12_Heranca;

public class PessoaFisica extends Pessoa {
	
	//atributos
	String cpf;

	//Construtor
	public PessoaFisica(String nome, int dia, int mes, int ano, String cpf) {
		super(nome, dia, mes, ano);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome = "+this.nome);
		System.out.println("Data de nascimento = "+
		this.dataNascimento.getDia()+
		"/"+this.dataNascimento.getMes()+
		"/"+this.dataNascimento.getAno());
		System.out.println("CPF = "+this.cpf);
	}

}
