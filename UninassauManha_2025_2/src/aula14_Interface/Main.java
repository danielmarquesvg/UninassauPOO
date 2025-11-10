package aula14_Interface;

public class Main {
	
	public static void main(String[] args) {
		DataHora calendario = new DataHora(10, 11, 2025, 11, 5);
		calendario.dataBrasil(calendario.dia, calendario.mes, calendario.ano);
		calendario.horaBrasil(calendario.hora, calendario.minuto);
	}

}
