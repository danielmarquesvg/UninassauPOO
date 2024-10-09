package aula14_Interface;

public class DataHorario implements IHorario, IData {

	//Atributos
	int dia;
	int mes;
	int ano;
	int hora;
	int minuto;
	
	//Construtor
	public DataHorario(int dia, int mes, int ano, int hora, int minuto) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public String horarioBr() {
		String horario = this.hora+" : "+this.minuto;
		return horario;
	}


	public String horarioUSA() {
		String horario = this.hora+" : "+this.minuto;
		return horario;
	}

	public String horarioVeraoBr() {
		String horario = (this.hora-1)+" : "+this.minuto;
		return horario;
	}

	public String horarioVeraoUSA() {
		String horario = (this.hora-1)+" : "+this.minuto;
		return horario;
	}


	@Override
	public String dataBR() {
		String dataBrasileira = this.dia+"/"+this.mes+"/"+this.ano;
		return dataBrasileira;
	}


	@Override
	public String dataUSA() {
		String dataAmericana = this.mes+"/"+this.dia+"/"+this.ano;
		return dataAmericana;
	}

}
