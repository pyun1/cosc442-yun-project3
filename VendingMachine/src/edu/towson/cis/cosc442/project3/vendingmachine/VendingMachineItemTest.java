/**
 * 
 */
package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Paul Yun
 *
 */
public class VendingMachineItemTest {

	VendingMachineItem vItem1; // price < 0
	VendingMachineItem vItem2;
	VendingMachineItem vItem3;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		vItem2 = new VendingMachineItem("Chips", 1.75); // price > 0
		vItem3 = new VendingMachineItem("Soda", 0.0); // price == 0
	}

	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 */
	
	@Test(expected = VendingMachineException.class)
	public void testVendingMachineItem_lessThanZero() {
		vItem1 = new VendingMachineItem("Juice", -1.0); // if price < 0 Throw exception
		vItem1.getPrice();
	}
	
	@Test
	public void testVendingMachineItem_greaterThanZero() {
		vItem2 = new VendingMachineItem("Chips", 1.75); // Testing if price > 0
		assertEquals(1.75, vItem2.getPrice(), 0.0001);
	}
	
	@Test
	public void testVendingMachineItem_equalToZero() {
		vItem3 = new VendingMachineItem("Soda", 0.0); // Testing if price == 0
		assertEquals(0, vItem3.getPrice(), 0.0001);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem#getName()}.
	 */
	@Test(expected = NullPointerException.class)
	public void testGetName_lessThanZero() {
		vItem1.getName(); // Expecting exception for item that threw exception
	}
	
	@Test
	public void testGetName_allOtherCases() {		// Retrieving name of items
		assertEquals("Chips",vItem2.getName());
		assertEquals("Soda",vItem3.getName());
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem#getPrice()}.
	 */
	@Test
	public void testGetPrice() {		// Retrieving price of items
		vItem2.getPrice();
		vItem3.getPrice();
	}
	
	@Test(expected = NullPointerException.class)
	public void testGetPrice_lessThanZero() {
		vItem1.getPrice(); // Expecting exception for item that threw exception
	}

	@After
	public void tearDown(){
		vItem1 = null;
		vItem2 = null;
		vItem3 = null;
	}
}
