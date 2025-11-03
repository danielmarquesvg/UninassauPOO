package aula12_Heranca;

public class PessoaJuridica extends Pessoa {
	
	String cnpj;

	public PessoaJuridica(String nome, int dia, int mes, int ano, String cnpj) {
		super(nome, dia, mes, ano);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome = "+this.nome);
		System.out.println("Data de nascimento = "+
		this.dataNascimento.getDia()+
		"/"+this.dataNascimento.getMes()+
		"/"+this.dataNascimento.getAno());
		System.out.println("CNPJ = "+this.cnpj);
	}
	
	

}
