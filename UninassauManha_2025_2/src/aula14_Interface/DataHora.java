package aula14_Interface;

public class DataHora implements IData, IHora{
	
	int dia;
	int mes;
	int ano;
	int hora;
	int minuto;
	
	public DataHora(int dia, int mes, int ano, int hora, int minuto) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
	}

	public void dataBrasil(int dia, int mes, int ano) {
		System.out.println("Brasil: "+dia+"/"+mes+"/"+ano);
	}

	public void dataEUA(int dia, int mes, int ano) {
		System.out.println("EUA: "+mes+"/"+dia+"/"+ano);
	}

	public void horaBrasil(int hora, int minuto) {
		System.out.println(hora+":"+minuto);
	}
	
	public void horaEUA(int hora, int minuto) {
		System.out.println(hora-4+":"+minuto);
	}

}
