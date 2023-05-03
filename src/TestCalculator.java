import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * A class for testing the methods of the Calculator class behave
 * as expected.
 * See: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * For more JUnit Assertion Statements
 */
class TestCalculator {

	@Test
	void testRemainder() {
		assertEquals(5, Calculator.remainder(45, 10), "45%10 should be 5");
		assertEquals(0, Calculator.remainder(6, 6), "6%6 should be 0");
		assertEquals(7, Calculator.remainder(7, 11), "7%11 should be 7");
		assertEquals(0, Calculator.remainder(0, 6), "0%6 should be 0");
		assertEquals(-1, Calculator.remainder(-5, 2), "-5%2 should be -1");
		assertEquals(0, Calculator.remainder(0, -1), "0%-1 should be 0");
		try {
			Calculator.remainder(12, 0);
			fail("Expected an ArithmeticException");
			} catch (ArithmeticException e) {
			  assertEquals("/ by zero", e.getMessage());
			}
	}

	@Test
	void testAdd() {
		assertEquals(15, Calculator.add(10, 5), "10+5 should be 15");
		assertEquals(16, Calculator.add(37,-21), "37+-21 should be 16");
		assertEquals(-6, Calculator.add(-4,-2), "-4+-2 should be -6");
		assertEquals(3.9, Calculator.add(6.1,-2.2), 0.00001, "6.1+-2.2 should be 3.9");
	}

	@Test
	void testMultiply() {
		assertEquals(0, Calculator.multiply(0, 6.1), "0*6.1 should be 0");
		assertEquals(0, Calculator.multiply(0, -1), "0*-1 should be 0");
		assertEquals(-5, Calculator.multiply(5, -1), "5*-1 should be -5");
		assertEquals(5, Calculator.multiply(-5, -1), "-5*-1 should be 5");
		assertEquals(-5, Calculator.multiply(-5, 1), "-5*1 should be -5");
	}

	@Test
	void testSubtract() {
		assertEquals(5, Calculator.subtract(2, -3), "2--3 should be 5");
		assertEquals(0, Calculator.subtract(0.0, 0.0), 0.000001, "0.0-0.0 should be 0");
		assertEquals(0, Calculator.subtract(-1, -1), "-1--1 should be 0");
		assertEquals(-2, Calculator.subtract(-1, 1), "-1-1 should be -2");
		assertEquals(2, Calculator.subtract(1, -1), "1--1 should be 2");
		assertEquals(-5.5, Calculator.subtract(-2.3, 3.2), "-2.3-3.2 should be -5.5");
	}

	@Test
	void testDivide() {
		assertEquals(2, Calculator.divide(12, 6),"12/6 should be 2");
		assertEquals(0, Calculator.divide(0, -5),"0/-5 should be 0");
		assertEquals(-2, Calculator.divide(10, -5),"10/-5 should be -2");
		assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(22,0));
	}

	@Test
	void testAverage() {
		assertEquals(5, Calculator.average(5), "average of {5} is 5");
		assertEquals(0, Calculator.average(0), "average of {0} is 0");
		assertEquals(4, Calculator.average(-2.5,-2.5,5.5,6.5,13), 0.000001, "average of {-2.5,-2.5,5.5,6.5,13} is 4");
		assertEquals(0, Calculator.average(0,0,0,0), "average of {0,0,0,0} is 0");
		assertEquals(-1, Calculator.average(-1,-1,-1), "average of {-1,-1,-1} is -1");
		try {
			Calculator.average();
			fail("Expected an ArithmeticException");
		} catch(ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}
	}

	@Test
	void testStandardDeviation() {
		assertEquals(2, Calculator.standardDeviation(2,4,4,4,5,5,7,9), "standard deviation of {2,4,4,4,5,5,7,9} is 2");
		assertEquals(1, Calculator.standardDeviation(-1,1), "standard deviation of {-1,1} is 1");
		assertEquals(0, Calculator.standardDeviation(0), "standard deviation of {0} is 0");
		assertEquals(0, Calculator.standardDeviation(23), "standard deviation of {23} is 0");
		assertEquals(0, Calculator.standardDeviation(-23), "standard deviation of {-23} is 0");
		try {
			Calculator.standardDeviation();
			fail("Expected an ArithmeticException");
		} catch(ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}
	}

	@Test
	void testMedian() {
		assertEquals(3, Calculator.median(2,3,4), "median of {2,3,4} is 3");
		assertEquals(3, Calculator.median(3,4,2), "median of {3,4,2} is 3");
		assertEquals(3, Calculator.median(2,4,3), "median of {2,4,3} is 3");
		assertEquals(-3, Calculator.median(-2,-3,-4), "median of {-2,-3,-4} is -3");
		assertEquals(2.5, Calculator.median(1,2,3,4), "median of {1,2,3,4} is 2.5");
		assertEquals(0, Calculator.median(0), "median of {0} is 0");
		assertEquals(0, Calculator.median(), "median of {} is 0");
	}

	@Test
	void testMax() {
		assertEquals(9, Calculator.max(8,2,6,4,9,7), "max of {8,2,6,4,9,7} is 9");
		assertEquals(-3, Calculator.max(-11,-3), "max of {-11,-3} is -3");
		assertEquals(2.5, Calculator.max(2.4,2.5), "max of {2.4,2.5} is 2.5");
		assertEquals(0, Calculator.max(0), "max of {0} is 0");
		assertEquals(7, Calculator.max(7), "max of {7} is 7");
		assertEquals(0, Calculator.max(), "max of {} is 0");
	}
	
	@Test
	void testMin() {
		assertEquals(2, Calculator.min(8,2,6,4,9,7), "min of {8,2,6,4,9,7} is 2");
		assertEquals(-11, Calculator.min(-11,-3), "min of {-11,-3} is -11");
		assertEquals(2.4, Calculator.min(2.4,2.5), "min of {2.4,2.5} is 2.4");
		assertEquals(0, Calculator.min(0), "min of {0} is 0");
		assertEquals(7, Calculator.min(7), "min of {7} is 7");
		assertEquals(0, Calculator.min(), "min of {} is 0");
	}
}
