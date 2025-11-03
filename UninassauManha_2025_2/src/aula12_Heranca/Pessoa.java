package aula12_Heranca;

public class Pessoa {
	
	//atributos
	String nome;
	DataNascimento dataNascimento;
	
	//Construtor
	public Pessoa(String nome, int dia, int mes, int ano) {
		DataNascimento data = new DataNascimento(dia, mes, ano);
		this.nome = nome;
		this.dataNascimento = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataNascimento getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(DataNascimento dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome = "+this.nome);
		System.out.println("Data de nascimento = "+
		this.dataNascimento.getDia()+
		"/"+this.dataNascimento.getMes()+
		"/"+this.dataNascimento.getAno());
	}
	

}
