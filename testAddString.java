package JUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertion.*;


import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunction justring = new JUnitFunction();
		String result = justring.AddStrings("Capastone", "project");
		assertEquals("Capastoneproject", result);
	}

}
