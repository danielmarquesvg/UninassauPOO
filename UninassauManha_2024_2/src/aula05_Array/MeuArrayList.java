package aula05_Array;

import java.util.ArrayList;

public class MeuArrayList {
	
	public static void main(String[] args) {
		
		//Criando arrayList
		ArrayList <String> minhaLista = new ArrayList<String>();
		
		//adicionar elementos
		minhaLista.add("Daniel");
		minhaLista.add("Mateus");
		minhaLista.add(0, "Julia");
		for(int i = 0; i < minhaLista.size(); i++) {
			System.out.println("Nome na posição "+i+" = "+minhaLista.get(i));
		}
		
		//remover
		minhaLista.remove(1);
		System.out.println();
		for(int i = 0; i < minhaLista.size(); i++) {
			System.out.println("Nome na posição "+i+" = "+minhaLista.get(i));
		}
		
		
	}

}




