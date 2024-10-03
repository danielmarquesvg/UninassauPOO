package aula10_RelacionamentoDeClasses;

public class Conta {
	
	//atributos
	private double saldo;
	private String agencia;
	private String numero;
	private String senha;
	private HistoricoTransacoes [] historico;
	
	//Construtor
	public Conta(double saldo, String agencia, String numero, String senha) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.senha = senha;
	}
	public Conta() {}

	//metodos
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
