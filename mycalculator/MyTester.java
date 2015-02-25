package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	//0 factorial test
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(0);
		
		assertEquals("0!=1", 1, actual, 0.0);
	}	// 0 factorial test
	
	@Test
	//1 factorial test
	public void testNfactorial1() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(1);
		
		assertEquals("1!=1", 1, actual, 0.0);
	}	// 1 factorial test
	
	@Test
	//2 factorial test
	public void testNfactorial2() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(2);
		
		assertEquals("2!=2", 2, actual, 0.0);
	}	// 2 factorial test
	
	@Test
	//3 factorial test
	public void testNfactorial3() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(3);
		
		assertEquals("3!=6", 6, actual, 0.0);
	}

	@Test
	// empty array test
	public void testBinarySearch() {
		MyCalculator mc = new MyCalculator();
		int array[] = {};
		int actual = mc.binarySearch(array,9);
		
		assertEquals("The array is empty.", -1, actual, 0.0);
	}
	
	@Test
	// one element test
	public void testBinarySearch1() {
		MyCalculator mc = new MyCalculator();
		int array[] = {8};
		int actual = mc.binarySearch(array,8);
		
		assertEquals("8 is at index 0", 0, actual, 0.0);
	}
	
	@Test
	// search an element in an array
	public void testBinarySearch2() {
		MyCalculator mc = new MyCalculator();
		int array[] = {1,4,7};
		int actual = mc.binarySearch(array,7);
		
		assertEquals("7 is at index 1", 2, actual, 0.0);
	}
		
	@Test
	// search an element in an array
	public void testBinarySearch3() {
		MyCalculator mc = new MyCalculator();
		int array[] = {1,2,3,4,5,6};
		int actual = mc.binarySearch(array,6);
		
		assertEquals("6 is at index 5", 5, actual, 0.0);
	}
	
	@Test
	// search an element in an array (not found)
	public void testBinarySearch4() {
		MyCalculator mc = new MyCalculator();
		int array[] = {1,4,6,8,9};
		int actual = mc.binarySearch(array,5);
		
		assertEquals("Not found.", -1, actual, 0.0);
	}

}
