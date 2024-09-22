package aula09_ClasseObjeto_Contrato;

public class Contrato {
	
	//atributos
	String contratante;
	private String contratado;
	String data;
	double valor;
	
	//Construtor
	public Contrato(String contratado, String novoContratante, String novaData, double novoValor) {
		this.contratado = contratado;
		this.contratante = novoContratante;
		this.data = novaData;
		this.valor = novoValor;
	}
	
	//Construtor vazio
	public Contrato() {}
	
	public Contrato(String contratado) {
		this.contratado = contratado;
	}
	
	//Metodos da classe
	public void exibirInformacoesContrato() {
		System.out.println("Nome do contratado = "+this.contratado);
		System.out.println("Nome do contratante = "+this.contratante);
		System.out.println("Data do contrato = "+this.data);
		System.out.println("Valor do contrato = "+this.valor);
	}
	
	public String getContratado() {
		return this.contratado;
	}
	
	public void setContratado(String novoContratado) {
		this.contratado = novoContratado;
	}

	public String getContratante() {
		return contratante;
	}

	public void setContratante(String contratante) {
		this.contratante = contratante;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
	
	
}
