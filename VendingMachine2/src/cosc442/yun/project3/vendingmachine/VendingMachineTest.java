package cosc442.yun.project3.vendingmachine;

import org.junit.*;

import cosc442.yun.project3.vendingmachine.VendingMachineException;

import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 3/4/18 8:25 AM
 * @author Paul Yun
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test on existing slot.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test(expected = VendingMachineException.class)
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
		// Try to add item to existing slot
		fixture.addItem(item, code);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test(expected = cosc442.yun.project3.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}

	@Test
	public void testAddItem_4()
		throws Exception {
		VendingMachine vendingMachine = new VendingMachine();
		VendingMachineItem item = new VendingMachineItem("Soda", 1.0);
		String code = "B";
		vendingMachine.addItem(item, code);
	}

	@Test
	public void testAddItem_5()
		throws Exception {
		VendingMachine vendingMachine = new VendingMachine();
		VendingMachineItem item = new VendingMachineItem("Chips", 1.0);
		String code = "C";
		vendingMachine.addItem(item, code);
	}

	@Test
	public void testAddItem_6()
		throws Exception {
		VendingMachine vendingMachine = new VendingMachine();
		VendingMachineItem item = new VendingMachineItem("Cookie", 1.0);
		String code = "D";
		vendingMachine.addItem(item, code);
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test(expected = cosc442.yun.project3.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test(expected = cosc442.yun.project3.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";
		VendingMachineItem item = new VendingMachineItem("Soda",1.00);
		fixture.addItem(item, code);
		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 2.00;
		String code = "A";
		VendingMachineItem item = new VendingMachineItem("Soda",500.00);
		fixture.addItem(item, code);
		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test(expected = cosc442.yun.project3.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test(expected = cosc442.yun.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test(expected = cosc442.yun.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test and test case for successful removal of item.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem item = new VendingMachineItem("Cookie", 1.0);
		fixture.addItem(item, code);
		fixture.removeItem(code);

		// add additional test code here
		assertEquals(null,fixture.getItem("A"));
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/4/18 8:25 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}