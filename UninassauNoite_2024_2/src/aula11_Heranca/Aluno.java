package aula11_Heranca;

public class Aluno extends Usuario {
	
	//atributos - até agora vazio
	public boolean situacaoAcademica;
	
	//Construtor
	public Aluno(String nome, int matricula, boolean situacao) {
		super(nome, matricula);
		this.situacaoAcademica = situacao;
	}
	
	
	
	

}
