package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import model.Carrinho;

public class TestCarrinho {
	
	@Test
	public void testAdicionarItens() {
		Carrinho meuCarrinho = new Carrinho();
		assertEquals(0, meuCarrinho.getQuantidadeItens());
		
		meuCarrinho.adicionarItem("Tenis", 150);
		meuCarrinho.adicionarItem("Feijão", 10);
		assertEquals(2, meuCarrinho.getQuantidadeItens());
	}
	
	@Test
	public void testRemoverItens() {
		Carrinho meuCarrinho = new Carrinho();
		meuCarrinho.adicionarItem("Tenis", 150);
		meuCarrinho.adicionarItem("Café", 20);
		meuCarrinho.removerItem("Café");
		assertEquals(1, meuCarrinho.getQuantidadeItens());
	}

}
