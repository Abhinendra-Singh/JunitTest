package JUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertion.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		JUnitFunction Junit = new JUnitFunction();
		int result = Junit.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}
