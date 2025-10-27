package aula10_compras;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	ArrayList<Produto> meuCarrinho;
	int id;
	
	public CarrinhoDeCompras() {
		meuCarrinho = new ArrayList<Produto>();
		this.id = 0;
	}
	
	public void adicionarProduto(String nome, double valor) {
		Produto produto = new Produto(nome, valor, this.id);
		this.id = this.id + 1;
		meuCarrinho.add(produto);
	}
	
	public void verProdutos() {
		for(int i = 0; i < meuCarrinho.size(); i++) {
			System.out.println("Nome = "+meuCarrinho.get(i).nome);
			System.out.println("Valor = "+meuCarrinho.get(i).valor);
			System.out.println("Id = "+meuCarrinho.get(i).id);
			System.out.println();
		}
	}

}
