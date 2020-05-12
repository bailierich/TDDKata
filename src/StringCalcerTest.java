import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalcerTest {

	@Test
	void test0Numbers() {
		int expected = 0;
		int actual = StringCalculator.add("");
		assertEquals(expected, actual);
	}
	
	@Test
	void test1Number() {
		int expected = 1;
		int actual = StringCalculator.add("1");
		assertEquals(expected, actual);
	}
	
	@Test
	void test2Numbers() {
		int expected = 4;
		int actual = StringCalculator.add("2, 2");
		assertEquals(expected, actual);
	}
	
	@Test
	void testUnknownAmountNumbers() {
		int expected = 10;
		int actual = StringCalculator.add("2, 2, 2, 2, 2");
		assertEquals(expected, actual);
	}
	
	@Test
	void testNewDelim() {
		int expected = 10;
		int actual = StringCalculator.add("2\n 2, 2, 2, 2");
		assertEquals(expected, actual);
	}
	
	@Test
	void testDifferentDelim() {
		int expected = 8;
		int actual = StringCalculator.add("//;\n2;2;2;2");
		assertEquals(expected, actual);
	}
	
	@Test
	void testNoGreaterThan1000() {
		int expected = 8;
		int actual = StringCalculator.add("//;\n2;2;2;2;1001");
		assertEquals(expected, actual);
	}
	@Test
	void testNoGreaterThan1000x2() {
		int expected = 10;
		int actual = StringCalculator.add("2\n 2, 2, 2, 2, 1001");
		assertEquals(expected, actual);
	}
	
	@Test
	void testNoGreaterThan1000x3() {
		int expected = 4;
		int actual = StringCalculator.add("2, 2, 2001");
		assertEquals(expected, actual);
	}
	
	@Test
	void testOneNegativeNum() {
		int expected = 15;
		int actual = StringCalculator.add("20, -5");
		assertEquals(expected, actual);
	}
	
	@Test
	void testAnotherDelimeter() {
		int expected = 8;
		int actual = StringCalculator.add("//#\n2#2#2#2#");
		assertEquals(expected, actual);
	}
	
	@Test
	void testJustZero() {
		int expected = 0;
		int actual = StringCalculator.add("0");
		assertEquals(expected, actual);
	}
	
	
	
}