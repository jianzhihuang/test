
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MySorterTest {
	
	// test set with negative number
	
	private double tc1[][] ={{1.0}, {1.0}}; //test single element set
	private double tc2[][] ={{1.0, 1.1, 2.0, 2.1, 10.10, 100}, {1.0, 1.1, 2.0, 2.1, 10.10, 100}};
	private double tc3[][] ={{100, 10.10, 2.1, 2.0, 1.1, 1.0}, {1.0, 1.1, 2.0, 2.1, 10.10, 100}};
	private double tc4[][] ={{2.0, 2.1, 1.1, 10.10, 100, 1.0}, {1.0, 1.1, 2.0, 2.1, 10.10, 100}};
	private double tc5[][] ={{1,2,5,4,3}, {1,2,3,4,5}};
	private double tc6[][] ={{},{}};
	private double tc7[][] = { { 1, 2, -99 }, { 1, 2, -99 } };

	private MySorter sorter;

	@Before
	public void setUp() throws Exception {
		sorter = new MySorter();
	}

	@After
	public void tearDown() throws Exception {
		sorter = null;
	}

	private void assertDoubleArrayEquals(double[] expected, double[] actual) {
		assertEquals(expected.length, actual.length);
		
		for (int i = 0; i < expected.length; i++) {
			
			assertEquals(expected[i], actual[i], 0.0001);
		}
	}
	@Test
	public void testSort1() {
		double expected[] = tc1[1];
		double input[] = tc1[0];
		System.out.println("Test Case 1: test set with negative number");
		double output[] = sorter.sort(input);
		assertDoubleArrayEquals(expected, output);
	}
	@Test
	public void testSort2() {
		double expected[] = tc2[1];
		double input[] = tc2[0];
		System.out.println("Test Case 2: test set with negative number");
		double output[] = sorter.sort(input);
		assertDoubleArrayEquals(expected, output);
	}
	
	@Test
	public void testSort3() {
		double expected[] = tc3[1];
		double input[] = tc3[0];
		System.out.println("Test Case 3: test set with negative number");
		double output[] = sorter.sort(input);
		assertDoubleArrayEquals(expected, output);
	}
	@Test
	public void testSort4() {
		double expected[] = tc4[1];
		double input[] = tc4[0];
		System.out.println("Test Case 4: test set with negative number");
		double output[] = sorter.sort(input);
		assertDoubleArrayEquals(expected, output);
	}
	
	@Test
	public void testSort5() {
		double expected[] = tc5[1];
		double input[] = tc5[0];
		System.out.println("Test Case 5: test set with negative number");
		double output[] = sorter.sort(input);
		assertDoubleArrayEquals(expected, output);
	}
	
	
	
	
	
	@Test
	public void testSort6() {
		double expected[] = tc6[1];
		double input[] = tc6[0];
		System.out.println("Test Case 6: test set with negative number");
		double output[] = sorter.sort(input);
		assertDoubleArrayEquals(expected, output);
	}
	
	@Test
	public void testSort7() {
		double expected[] = tc7[1];
		double input[] = tc7[0];
		System.out.println("Test Case 7: test set with negative number");
		double output[] = sorter.sort(input);
		assertDoubleArrayEquals(expected, output);
	}

}
