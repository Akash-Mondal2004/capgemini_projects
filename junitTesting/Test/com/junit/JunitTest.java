package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class JunitTest {
	Junit j = new Junit();
	@BeforeEach
	public void start(){
		System.out.println("Before each");
	}
	@AfterEach
	public void end() {
		System.out.println("After each");
	}
	@Test
	void test() {
		
		int actual = j.add(1,4);
		int expected = 6;
		assertEquals(expected, actual);
	}
//	@Test
//	void mulTest() {
//	assertEquals(i+1, i+1);	
//	}
	@Test
	public void arrayTest() {
		try {
			int[] arr = null;
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
