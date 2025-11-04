package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import model.Item;

public class TestItem {
	
	@Test
	public void testGetNome() {
		//Fixture
		Item item1 = new Item("Sapato", 70);
		
		//Asserção ou afirmação
		assertEquals("Sapato", item1.getNome());
		assertNotEquals("sapato", item1.getNome());
		
		item1.setNome("Mouse");
		assertEquals("Mouse", item1.getNome());
		assertNotEquals("mouse", item1.getNome());
	}
	
	@Test
	public void testGetValor() {
		//Fixture
		Item item1 = new Item("Gabinete", 400);
		assertEquals(400, item1.getValor(),2);
		
		item1.setValor(3000.993);
		assertEquals(3000.929, item1.getValor(),1);
	}

}
