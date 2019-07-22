package com.mphasis.training.testcases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringTestCase {
Testing test;
	@Before
	public void setUp() throws Exception {
		test=new Testing();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	
	@Test
	public void test1() {
		assertEquals("XY",test.Display("AAXY"));
		assertEquals("XY",test.Display("XAXY"));
		
		
	}
	

	@Test(expected=NullPointerException.class)
	public void testArray() {
		int[] numbers=null;
		Arrays.sort(numbers);
	}
	@Test
	public void testArray1() {
		int[] numbers= {32,12,4,56,87,90};
		Arrays.sort(numbers);
		int[] expected= {4,12,32,56,87,90};
		assertArrayEquals(expected,numbers);
	}
	@Test(timeout=15)
	public void testTiming() {
for(int i=0;i<23;i++)
{
	int [] no= {i,i*1,i+1};
	Arrays.sort(no);
	
}
	
	}
	
	
	
	
	
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
