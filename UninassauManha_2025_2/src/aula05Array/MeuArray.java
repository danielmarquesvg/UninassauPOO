package aula05Array;

public class MeuArray {
	
	public static void main(String[] args) {
		//criando um array
		String [] listaNomes = new String[100];
		
		//verificando se está vazio
		for(int i = 0; i < 100; i++) {
			System.out.println("ListaNomes["+i+"] = "+listaNomes[i]);
		}
		
		//adicionando elementos
		listaNomes[0] = "Maria";
		listaNomes[2] = "José";
		
		for(int i = 0; i < 100; i++) {
			System.out.println("ListaNomes["+i+"] = "+listaNomes[i]);
		}
		
		//modificando
		listaNomes[2] = "Josefa";
		
		for(int i = 0; i < 100; i++) {
			System.out.println("ListaNomes["+i+"] = "+listaNomes[i]);
		}
		
		//deletando
		listaNomes[0] = null;
	}

}
