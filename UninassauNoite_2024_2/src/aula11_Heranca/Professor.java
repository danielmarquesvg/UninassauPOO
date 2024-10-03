package aula11_Heranca;

public class Professor extends Usuario {
	
	double salario;
	
	public Professor(String novoNome, int novaMatricula, double novoSalario) {
		super(novoNome, novaMatricula);
		this.salario = novoSalario;	
	}
	
	public void verInformacoes() {
		System.out.println("===== PROFESSOR ======");
		System.out.println("Nome do professor: "+nome);
		System.out.println("Matricula do professor: "+getMatricula());
		System.out.println("Salário do professor: "+this.salario);
	}

}
