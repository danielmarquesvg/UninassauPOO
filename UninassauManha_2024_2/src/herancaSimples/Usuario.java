package herancaSimples;

public class Usuario {
	
	//Atributos
	private String nome;
	private int cpf;
	
	//Construtor
	public Usuario(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Getters e Setters
	public void verInformacao() {
		System.out.println("Nome = "+this.nome);
		System.out.println("CPF = "+this.cpf);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
