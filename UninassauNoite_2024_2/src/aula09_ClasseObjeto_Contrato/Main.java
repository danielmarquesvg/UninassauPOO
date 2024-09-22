package aula09_ClasseObjeto_Contrato;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do contratado: ");
		String contratado = scanner.next();
		
		System.out.println("Digite o nome do contrante: ");
		String contratante = scanner.next();
		
		System.out.println("Digite a data: ");
		String data = scanner.next();
		
		System.out.println("Digite o valor do contrato: ");
		double valor = scanner.nextDouble();
		
		
		//criei um objeto da classe Contrato
		Contrato meuContrato = new Contrato(contratado, contratante, data, valor);
		meuContrato.exibirInformacoesContrato();
		
		//criando objeto vazio
		Contrato novoContrato = new Contrato();
		novoContrato.setContratado("João");
		novoContrato.getContratado();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
