package test;

import org.junit.Assert;
import org.junit.Test;
import model.Item;

public class TestItem {
	
	@Test
	public void testGetSetNome() {
		//fixture
		Item item1 = new Item("Shampoo", 15);
		
		//Assercao ou Assert
		Assert.assertEquals(item1.getNome(), "Shampoo");
		
		//alterando o valor do objeto
		item1.setNome("Maionese");
		
		//Assercao ou Assert
		Assert.assertNotEquals(item1.getNome(), "Shampoo");
	}
	
	@Test
	public void testGetSetValor() {
		//fixture
		Item item1 = new Item("Shampoo", 15);
				
		//Assercao ou Assert
		Assert.assertEquals(item1.getValor(), 15, 1);
				
		//alterando o valor do objeto
		item1.setValor(20);
				
		//Assercao ou Assert
		Assert.assertNotEquals(item1.getValor(), 15, 1);
	}

}
