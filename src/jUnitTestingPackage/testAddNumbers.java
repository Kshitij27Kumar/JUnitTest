package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	public void test() {
		JUnitTesting junit=new JUnitTesting();
		int res=junit.addNumbers(130,220);
		assertEquals(350,res);
	}

}
