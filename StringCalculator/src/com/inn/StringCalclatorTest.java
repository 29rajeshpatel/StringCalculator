package com.inn;

import static org.junit.Assert.assertTrue;

public class StringCalclatorTest {
	@org.junit.Test
	public void validInput() {
		assertTrue(StringCalclator.add("1,3")==4);
	}
	
	@org.junit.Test
	public void NumberIsLessThen1000() {
		assertTrue(StringCalclator.add("1,1001")==1);
	}
	
	
	@org.junit.Test
	public void newLineInput() {
		assertTrue(StringCalclator.add("1\n3")==4);
	}
	@org.junit.Test
	public void inValidInput() {
		assertTrue(!(StringCalclator.add("1,a")==4));
	}
	
	@org.junit.Test
	public void neagativeInput() {
		try {
		StringCalclator.add("1,-3");
		}catch(Exception ex) {
			assertTrue(ex.getMessage().contains("Number can not be negative"));
		}
	}
}
