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
//-----------------------------------------------------------------------------------

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//----------------------------------------------------------------------------------
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
//------------------------------------------------------------------------------------
//this is testing static int parameters
	@Test
	public void test4(){
		assertTrue(MyInteger.isEven(8));
	}
	@Test
	public void test5(){
		assertTrue(MyInteger.isOdd(9));
	}
	@Test
	public void test6(){
		assertFalse(MyInteger.isPrime(9));
	}
//-----------------------------------------------------------------------------------
//this is testing static MyIntegers parameters
	MyInteger myInt = new MyInteger(10);
	@Test
	public void test7(){
		assertTrue(MyInteger.isEven(myInt));
	}
	@Test
	public void test8(){
		assertFalse(MyInteger.isOdd(16));
	}
	@Test
	public void test9(){
		assertTrue(MyInteger.isPrime(new MyInteger(13)));
	}
//------------------------------------------------------------------------------------
	
}

	