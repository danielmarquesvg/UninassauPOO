package aula10_Carrinho;

import java.util.ArrayList;

public class Carrinho {
	
	ArrayList <Item> listaCompras;
	
	public Carrinho() {
		listaCompras = new ArrayList<Item>();
	}
	
	public void adicionarItem(String nome, double preco) {
		Item item = new Item(nome, preco);
		listaCompras.add(item);
	}
	
	public void removerItem(String nome) {
		listaCompras.remove(nome);
	}
	
	public void mostrarItens() {
		for(int i = 0; i < listaCompras.size(); i++) {
			System.out.print("Nome do item = "+listaCompras.get(i).nome);
			System.out.print("\nPreço do item = "+listaCompras.get(i).preco+"\n");
		}
	}

}
