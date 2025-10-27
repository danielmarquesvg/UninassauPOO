package aula05Array;

import java.util.ArrayList;

public class MeuArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> minhaLista = new ArrayList<String>();
		
		//adicionando um elemento
		minhaLista.add("Maria");
		minhaLista.add("José");
		minhaLista.add("Tayná");
		minhaLista.add(1, "Daniel");
		
		//exibindo
		for(int i = 0; i < minhaLista.size(); i++) {
			System.out.println(minhaLista.get(i));
		}
		
		minhaLista.remove(0);
		minhaLista.remove("Daniel");
		minhaLista.remove("Seu Zé");
		System.out.println();
		for(int i = 0; i < minhaLista.size(); i++) {
			System.out.println(minhaLista.get(i));
		}
		
		
	}

}
