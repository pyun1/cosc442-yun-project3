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
public class VendingMachineTest {
	
	VendingMachine vMachine;
	VendingMachineItem vItem2;
	VendingMachineItem vItem3;
	VendingMachineItem vItem4;
	VendingMachineItem vItem5;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		vMachine = new VendingMachine();
		vItem2 = new VendingMachineItem("Chips", 1.75); // Testing if price > 0
		vItem3 = new VendingMachineItem("Soda", 0.0); // Testing if price == 0
		vItem4 = new VendingMachineItem("Cookie", 2.00); // Testing case when vending machine code is C for coverage
		vItem5 = new VendingMachineItem("FruitSnack",1.75); // Testing case when vending machine code is D for coverage
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		vMachine = null;
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem, java.lang.String)}.
	 * Test method for adding item with good input
	 */
	@Test
	public void testAddItem_validItemGreaterThanZero() { // Test adding item to slot with good input
		vMachine.addItem(vItem2, "A");
		vMachine.addItem(vItem4, "C");
		vMachine.addItem(vItem5, "D");
		assertEquals(vItem2, vMachine.getItem("A"));
		assertEquals(vItem4, vMachine.getItem("C"));		// These are additional cases with good input and valid slot, testing the same procedure.
		assertEquals(vItem5, vMachine.getItem("D"));
	}
	/**
	 * Test method for adding item with good input but invalid slot
	 */
	@Test(expected = VendingMachineException.class) // Test if method throws error when adding item to invalid slot
	public void testAddItem_InvalidSlot() {
		vMachine.addItem(vItem2, "H");
	}
	/**
	 * Test method for adding item with good input to full slot
	 */
	@Test(expected = VendingMachineException.class) // Test if method throws error when adding to full slot
	public void testAddItem_validCodeSlotFull() {
		vMachine.addItem(vItem2, "A");
		vMachine.addItem(vItem2, "A");
	}
	/**
	 * Test method for adding item with price == 0
	 */
	@Test // Test adding item with price == 0
	public void testAddItem_validItemEqualToZero() {
		vMachine.addItem(vItem3, "B");
		assertEquals(vItem3, vMachine.getItem("B"));
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 * Test method to remove existing item
	 */
	@Test
	public void testRemoveItem_notEmpty() {		//Remove item that exists within the vending machine
		vMachine.addItem(vItem2, "A");
		vMachine.removeItem("A");
		assertEquals(null,vMachine.getItem("A"));
	}
	/**
	 * Test method to remove non-existent item
	 */
	@Test(expected = VendingMachineException.class) // Throw exception when removing item that doesn't exist in vending machine
	public void testRemoveItem_empty() {
		vMachine.removeItem("A");
	}
	/**
	 * Test method to remove item with invalid code
	 */
	@Test(expected = VendingMachineException.class) // Throw exception when removing item with invalid code
	public void testRemoveItem_invalidCode() {
		vMachine.removeItem("J");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#insertMoney(double)}.
	 * Test method for inserting valid amount of money > 0
	 */
	@Test
	public void testInsertMoney_greaterThanZero() {		//Inserting valid amount > 0
		vMachine.insertMoney(5.00);
		assertEquals(5.00,vMachine.getBalance(),0.0001);
	}
	/**
	 * Test method for inserting money < 0
	 */
	@Test(expected = VendingMachineException.class)		// Inserting < 0 dollars
	public void testInsertMoney_lessThanZero() {
		vMachine.insertMoney(-5);
	}
	/**
	 * Test method for inserting no money == 0
	 */
	@Test
	public void testInsertMoney_equalToZero() {		// Inserting 0 dollars
		vMachine.insertMoney(0.00);
		assertEquals(0.00,vMachine.getBalance(),0.0001);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#getBalance()}.
	 * Test for initialization of balance to 0
	 */
	@Test
	public void testGetBalance_initialBalance() {
		assertEquals(0, vMachine.getBalance(), 0.0001);
	}
	/**
	 * Test method for updating balance to proper amount after inserting
	 */
	@Test
	public void testGetBalance_updateBalance() {
		vMachine.insertMoney(15.00);
		assertEquals(15.00, vMachine.getBalance(), 0.0001);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 * Test method with more money than required
	 */
	@Test
	public void testMakePurchase_moreMoney() {		// Test making purchase with more than enough money
		vMachine.addItem(vItem2, "A");
		vMachine.insertMoney(2.00);
		assertTrue(vMachine.makePurchase("A"));
	}
	/**
	 * Test method with just enough money
	 */
	@Test
	public void testMakePurchase_enoughMoney() {		// Test making purchase with just enough money
		vMachine.addItem(vItem2, "A");
		vMachine.insertMoney(1.75);
		assertTrue(vMachine.makePurchase("A"));
	}
	/**
	 * Test method with not enough money
	 */
	@Test
	public void testMakePurchase_insufficientMoney() {		// Test making purchase with insufficient money
		vMachine.addItem(vItem2, "A");
		vMachine.insertMoney(1.00);
		assertFalse(vMachine.makePurchase("A"));
	}
	/**
	 * Test method on invalid Slot
	 */
	@Test(expected = VendingMachineException.class)		// Test making purchase on invalid code
	public void testMakePurchase_invalidCode() {
		vMachine.insertMoney(5.00);
		vMachine.makePurchase("J");
	}
	/**
	 * Test method on empty Slot
	 */
	@Test
	public void testMakePurchase_emptySlot() {		// Test making purchase on empty slot
		vMachine.insertMoney(1.00);
		assertFalse(vMachine.makePurchase("B"));
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#returnChange()}.
	 * Test if method returns valid change.
	 */
	@Test
	public void testReturnChange() {		// Test if method returns valid change.
		vMachine.insertMoney(5.00);
		assertEquals(5.00, vMachine.returnChange(), 0.0001);
	}

}
