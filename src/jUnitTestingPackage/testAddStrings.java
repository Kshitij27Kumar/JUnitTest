package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		JUnitTesting junitstring=new JUnitTesting();
		String res=junitstring.addStrings("kshitij", " kumar");
		assertEquals("kshitij kumar",res);
	}

}
