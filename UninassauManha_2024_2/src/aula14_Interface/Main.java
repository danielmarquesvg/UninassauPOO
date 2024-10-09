package aula14_Interface;

public class Main {
	
	public static void main(String[] args) {
		
		DataHorario dataHorario1 = new DataHorario(31,12,2024,23,59);
		System.out.println("Data no formato Americano: "+dataHorario1.dataUSA());
		System.out.println("Data no formato Brasileiro: "+dataHorario1.dataBR());
		System.out.println("Horário no formato Brasileiro: "+dataHorario1.horarioBr());
	}

}
