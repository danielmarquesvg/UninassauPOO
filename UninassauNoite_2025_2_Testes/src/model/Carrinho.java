package model;

import java.util.ArrayList;

public class Carrinho {
	
	//atributos
	ArrayList <Item> listaDeItens;
	int quantidadeItens;
	
	
	//Construtor
	public Carrinho() {
		this.listaDeItens = new ArrayList<Item>();
		this.quantidadeItens = 0;
	}
	
	public void adicionarItem(String nome, double valor) {
		Item item = new Item(nome, valor);
		listaDeItens.add(item);
		this.quantidadeItens = this.quantidadeItens + 1;
	}
	
	public void removerItem(String nome) {
		listaDeItens.remove(nome);
		this.quantidadeItens = this.quantidadeItens - 1;
	}
	
	public int getQuantidadeItens() {
		return this.quantidadeItens;
	}

}
