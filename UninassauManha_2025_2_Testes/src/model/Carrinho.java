package model;

import java.util.ArrayList;

public class Carrinho {
	
	//atributos
	ArrayList<Item> listaDeCompras;
	int quantidadeDeItens;
	
	//Construtor
	public Carrinho() {
		this.listaDeCompras = new ArrayList<Item>();
		this.quantidadeDeItens = 0;
	}
	
	public void adicionarItem(String nome, double valor) {
		Item meuItem = new Item(nome, valor);
		listaDeCompras.add(meuItem);
		this.quantidadeDeItens = this.quantidadeDeItens + 1;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	

}
