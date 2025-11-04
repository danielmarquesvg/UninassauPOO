package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Carrinho;
import model.Item;

public class TestCarrinho {
	
	@Test
	public void testQuantidade() {
		Carrinho meuCarrinho = new Carrinho();
		assertEquals(meuCarrinho.getQuantidadeDeItens(), 0);
		
		meuCarrinho.adicionarItem("Feijão", 10);
		assertEquals(meuCarrinho.getQuantidadeDeItens(), 1);
	}

}
