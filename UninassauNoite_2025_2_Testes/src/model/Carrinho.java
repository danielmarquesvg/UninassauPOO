package model;

import java.util.ArrayList;

public class Carrinho {
	
	//atributos
	ArrayList <Item> listaDeCompras;
	int quantidadeItens;
	
	
	//Construtor
	public Carrinho() {
		this.listaDeCompras = new ArrayList<Item>();
		this.quantidadeItens = 0;
	}
	
	public void adicionarItem(String nome, double valor) {
		Item item = new Item(nome, valor);
		listaDeCompras.add(item);
		this.quantidadeItens = this.quantidadeItens + 1;
	}

}
