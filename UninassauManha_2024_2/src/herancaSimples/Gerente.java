package herancaSimples;

public class Gerente extends Usuario {

	//atributos
	String email;
	
	//Construtor
	public Gerente(String nome, int cpf, String email) {
		super(nome, cpf);
		this.email = email;
	}

	//metodos
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//POLIMORFISMO
	public void verInformacao() {
		System.out.println("====== GERENTE =======");
		System.out.println("Nome = "+getNome());
		System.out.println("CPF = "+getCpf());
		System.out.println("Email = "+this.email+"\n");
	}
	
}
