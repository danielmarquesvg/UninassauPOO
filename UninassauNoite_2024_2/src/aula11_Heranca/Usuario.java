package aula11_Heranca;

public class Usuario {
	
	//atributos
	public String nome;
	private int matricula;
	
	//Construtor
	public Usuario(String novoNome, int novaMatricula) {
		this.nome = novoNome;
		this.matricula = novaMatricula;
	}
	
	public void verInformacoes() {
		System.out.println("===== USUARIO ======");
		System.out.println("Nome do usuário: "+this.nome);
		System.out.println("Matricula do usuário: "+this.matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
