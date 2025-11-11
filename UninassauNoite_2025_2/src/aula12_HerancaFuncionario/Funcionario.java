package aula12_HerancaFuncionario;

public class Funcionario {
	
	String nome;
	public double salario;
	
	public Funcionario(String nome) {
		this.nome = nome;
		this.salario = 1518;
	}
	
	public void calcularSalario() {
		this.salario = 1518;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
