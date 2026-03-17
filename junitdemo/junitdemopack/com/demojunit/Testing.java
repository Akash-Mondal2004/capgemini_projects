package com.demojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test() {
		CheckString s = new CheckString();
		int actual = s.containvowel("akash");
		int expected = 2;
		assertEquals(expected,actual);
	}

}
