package com.inn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalc {

	@Test
	void test() {
		int reslt=StringCalclator.add("1,3");
		assertTrue(reslt==4);
	}

}
