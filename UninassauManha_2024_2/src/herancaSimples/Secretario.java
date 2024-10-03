package herancaSimples;

public class Secretario extends Usuario {

	String horarios;
	
	public Secretario(String nome, int cpf, String horarios) {
		super(nome, cpf);
		this.horarios = horarios;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	

}
