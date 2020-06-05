package com.SimpleExample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PrimeNumTest {
	Number x;
	 @Before
	 public void setUp() throws Exception {
	 x=new Number();}

	 @Test
	 public void toCheckNumberIsPrime() throws Exception{
	  
	  assertEquals(true,x.prime(23));
	 }
	 @Test
	 public void toCheckNumberIsNotPrime() throws Exception {
	 
	  assertEquals(false,x.prime(9));
	 }

		@Test
			public void toCheckNumberIsPrimeThrowsException() throws Exception {
				try {
				int input = -1;
				String expected = "Odd";
				boolean actual = x.prime(input);
				 fail();
				}
				catch (Exception e) {
					  
				}
		}
	@Test
	 public void toCheckNumberIsAmstrong()  {
	 
	  assertEquals(true,x.amstrong(153));
	 }
	@Test
	 public void toCheckNumberIsNotAmstrong() {
	 
	  assertEquals(false,x.amstrong(100));
	 }
	@Test
	 public void toCheckNumberIsPalindrome(){
	 
	  assertEquals(true,x.polindrome(454));
	 }
	@Test
	 public void toCheckNumberIsNotPalindrome() {
	 
	  assertEquals(false,x.polindrome(100));
	 }

	 @After
	 public void tearDown() throws Exception {
	 x=null;}



}
