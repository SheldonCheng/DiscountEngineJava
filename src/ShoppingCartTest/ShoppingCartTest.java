package ShoppingCartTest;

import static org.junit.Assert.*;

import org.junit.Test;

//import org.junit.Test;

import POS.Item;
import POS.Product;
import POS.ShoppingCart;

public class ShoppingCartTest {

	// test emptycart 
	@Test
	public void testEmptyCart() {
		
		ShoppingCart cart = new ShoppingCart();
		int calculated = cart.getItemCount();
		
		int expected = 0;
	
		assertTrue(calculated == expected);
	
	}
	
	//test cart with one item 
	@Test
	public void testCartWithOneItem() {
		ShoppingCart cart = new ShoppingCart();
		Product newItem = new Product(6,6);
		
		cart.addItem(newItem);
		
		int calculated = cart.getItemCount();
		int expected = 1; 
		assertTrue(calculated == expected);
	}
	
	//test cart with two item 
	@Test
	public void testCartWithTwoItems() {
		ShoppingCart cart = new ShoppingCart();
		Product newItem = new Product(6,6);
		Product newItem2 = new Product(7,7);
		cart.addItem(newItem);
		cart.addItem(newItem2);
		
		int calculated = cart.getItemCount();
		int expected = 2; 
		assertTrue(calculated == expected);
	}
	
	//test cart with ten items
	
	@Test
	public void testCartWithTenItems() {
		ShoppingCart cart = new ShoppingCart();
		Product newItem = new Product(6,6);
		cart.addItem(newItem);
		cart.addItem(newItem);
		cart.addItem(newItem);
		cart.addItem(newItem);
		cart.addItem(newItem);
		cart.addItem(newItem);
		cart.addItem(newItem);
		cart.addItem(newItem);
		cart.addItem(newItem);
		cart.addItem(newItem);

		int calculated = cart.getItemCount();
		int expected = 10; 
		assertTrue(calculated == expected);
	}
	
	
	//test cart to remove zero item
	
	
	//test cart to remove all item

}
