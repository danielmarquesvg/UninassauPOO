package aula10_Relacionamento;

public class Endereco {
	
	//atributos
	String rua;
	String numero;
	String complemento;
	String bairro;
	
	//Construtor
	public Endereco(String rua, String numero, String complemento, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}
	
	//GET - Exibir algum valor
	public String getRua() {
		return this.rua;
	}
	
	//SET - Alterar o valor
	public void setRua(String novaRua) {
		this.rua = novaRua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
