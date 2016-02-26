package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
public static MyInteger obj;
public static MyInteger obj2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj=new MyInteger(4);
		obj2 =new MyInteger(5);
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
	public void test10(){
		assertFalse(obj2.isEven());
	}

	@Test
	public void test2(){
		assertFalse(obj.isOdd());
	}
	@Test
	public void test11(){
		assertTrue(obj2.isOdd());
	}
	
	@Test
	public void test3(){
		assertFalse(obj.isPrime());
	}
	@Test
	public void test12(){
		assertTrue(obj2.isPrime());
	}
//------------------------------------------------------------------------------------
//this is testing static int parameters
	@Test
	public void test4(){
		assertTrue(MyInteger.isEven(8));
	}
	@Test
	public void test13(){
		assertFalse(MyInteger.isEven(9));
	}
	@Test
	public void test5(){
		assertTrue(MyInteger.isOdd(9));
	}
	@Test
	public void test14(){
		assertFalse(MyInteger.isOdd(12));
	}
	@Test
	public void test6(){
		assertFalse(MyInteger.isPrime(9));
	}
	@Test
	public void test15(){
		assertTrue(MyInteger.isPrime(13));
	}
//-----------------------------------------------------------------------------------
//this is testing static MyIntegers parameters
	MyInteger myInt3 = new MyInteger(10);
	MyInteger myInt2 = new MyInteger(11);
	@Test
	public void test7(){
		assertTrue(MyInteger.isEven(myInt3));
	}
	@Test
	public void test16(){
		assertFalse(MyInteger.isEven(myInt2));
	}
	@Test
	public void test8(){
		assertFalse(MyInteger.isOdd(myInt3));
	}
	@Test
	public void test17(){
		assertTrue(MyInteger.isOdd(myInt2));
	}
	@Test
	public void test9(){
		assertTrue(MyInteger.isPrime(new MyInteger(13)));
	}
	@Test
	public void test18(){
		assertFalse(MyInteger.isPrime(new MyInteger(14)));
	}
	@Test
	public void test19(){
		assertFalse(myInt3.equals(11));
	}
	@Test
	public void test20(){
		assertTrue(myInt3.equals(10));
	}

//* I tried making a test for equal(MyInteger) but none worked. I don't understand
// * what I am doing wrong
/* 
	@Test
	public void test21(){
		assertEquals(myInt3,10 );
	}
//------------------------------------------------------------------------------------
*/	
}

	