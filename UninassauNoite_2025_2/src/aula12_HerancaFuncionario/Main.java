package aula12_HerancaFuncionario;

public class Main {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Daniel");
		System.out.println("Nome do funcionario = "+funcionario.getNome());
		System.out.println("Salário do funcionario = "+funcionario.getSalario());
		
		System.out.println();
		
		FuncionarioCLT clt = new FuncionarioCLT(40, 20, "Jovescláudio");
		System.out.println("Nome do funcionario = "+clt.getNome());
		System.out.println("Carga horária do funcionario = "+clt.getCargaHoraria());
		System.out.println("Valor da hora = "+clt.getValorHora());
		System.out.println("Salário = "+clt.getSalario());
		
	}

}
