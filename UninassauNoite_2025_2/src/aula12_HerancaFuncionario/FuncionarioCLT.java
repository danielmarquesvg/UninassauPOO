package aula12_HerancaFuncionario;

public class FuncionarioCLT extends Funcionario {
	
	double cargaHoraria;
	double valorHora;
	
	public FuncionarioCLT(double cargaHoraria, double valorHora, String nome) {
		super(nome);
		this.cargaHoraria = cargaHoraria;
		this.valorHora = valorHora;
		calcularSalario();
	}
	
	public void calcularSalario() {
		this.salario = this.cargaHoraria * this.valorHora;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	

}
