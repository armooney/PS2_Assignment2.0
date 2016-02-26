package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
public static MyInteger obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj=new MyInteger(4);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

/*	@Test
	public void test() {
			assertTrue(1==1);
	}
*/
	@Test 
	public void test1(){
		assertTrue(obj.isEven());
	}

	@Test
	public void test2(){
		assertFalse(obj.isOdd());
	}
	@Test
	public void test3(){
		assertFalse(obj.isPrime());
	}
/*	@Test
	public void test4(){
		assert(obj.isEven(y));
	}
*/
}

	