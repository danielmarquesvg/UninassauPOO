package aula11_Heranca;

public class Main {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Daniel", 123456, false);
		Professor professor1 = new Professor("João", 9876, 2000);
		
		aluno1.verInformacoes();
		System.out.println("\n");
		professor1.verInformacoes();
		
	}

}
