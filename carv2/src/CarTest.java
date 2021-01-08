import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {

	private int expectedWheels;
	private Engine engine;
	private Car myCar;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		expectedWheels = 4;
		engine = new FakeEngine();
		myCar = new Car(engine);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		myCar = null;
	}

	@Test
	public void testGetWheels() {
		assertEquals(expectedWheels, myCar.getWheels());
	}
	
	@Test
	public void testStarting() {
		assertEquals(1, myCar.start());
	}

	@Test
	public void testHighClass() {
		int prize = 160;
		assertTrue(myCar.isHighClass(prize));
	}
		
	@Test
	public void testLowClass() {
		int prize = 60;
		assertFalse(myCar.isHighClass(prize));
	}
		
	
	@Test(timeout=1000)
	public void testGetManyWheels() {
		assertEquals(expectedWheels, myCar.getManyWheels());
	}	

}
