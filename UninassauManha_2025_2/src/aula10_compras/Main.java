package aula10_compras;

public class Main {
	
	public static void main(String[] args) {
		String nome1 = "Sardinha";
		double valor1 = 38.00;
		
		String nome2 = "Filé de frango";
		double valor2 = 19.00;
		
		String nome3 = "Whey Protein";
		double valor3 = 1.00;
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarProduto(nome1, valor1);
		carrinho.adicionarProduto(nome2, valor2);
		carrinho.adicionarProduto(nome3, valor3);
		
		carrinho.verProdutos();
		
	}

}
