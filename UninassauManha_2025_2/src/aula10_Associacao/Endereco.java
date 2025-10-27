package aula10_Associacao;

public class Endereco {
	
	//atributos
	String rua;
	int numero;
	String complemento;
	String bairro;
	
	//Construtor
	public Endereco(String rua, int numero, String complemento, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}
	
	//metodos
	public void verEndereco() {
		System.out.println("Endereço = "+this.rua+", "+this.numero+", "+this.complemento+", "+this.bairro);
	}

}
