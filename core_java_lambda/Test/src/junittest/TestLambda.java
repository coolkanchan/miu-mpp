package junittest;

import org.junit.Test;

import junit.framework.TestCase;

public class TestLambda extends TestCase {
	@Test
	public void testGt() {
	//	assert(Problem1.specialAccounts(null));
		//your test 
		
		Customer cus = new Customer("1","first","last");
		cus.getCheckingAccount().updateBalance(100);
		boolean results = Problem1.balanceGreaterThan50.test(cus.getCheckingAccount());
		assertEquals(true, results);
		
	}
		@Test
		public void testComp() {
		//	assert(Problem1.specialAccounts(null));
			//your test 
			
			Customer cus1 = new Customer("1","first","last");
			Customer cus2 = new Customer("2","Hello","World");
			int result = Problem1.lastNameComperator.compare(cus1,cus2);
			assertEquals(true, result > 0);
		
	}
}
