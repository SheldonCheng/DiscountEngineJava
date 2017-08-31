import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import POS.Product;

public class TestDiscountEngine {

	private Catalog c = null;
	Product newItem = null;
	
	@Before
	public void setUp() {
		c = new Catalog();
		newItem = new Product(6,6);
	}
	 
	@Test
	public void testCatalogCreated() {
		assertTrue(c.getQuantity() > 0);
    }

	@Test
	public void testAddProductToCatalog() {
		int count = c.getQuantity();
		c.Add(newItem);
		assertTrue(c.getQuantity() == count +1 );	
	}
	
	@Test
	public void testRemoveProductFromCatalog() {
		int count = c.getQuantity();
		c.Remove(1);
		assertTrue(c.getQuantity() == count -1 );	
	}
	

}
