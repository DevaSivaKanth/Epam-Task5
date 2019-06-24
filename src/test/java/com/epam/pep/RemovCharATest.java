package com.epam.pep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemovCharATest {
	
	/**
	 * Remove ‘A’ if it is present in first 2 characters of the string.
	   if ‘A’ is present after 2 characters, it should not be removed.
	 *
	 */
	
	RemoveCharA removcharA;
	
	@BeforeEach
	void Setup() {
		removcharA=new RemoveCharA();
	}
	
	@Test
	void test0() {
		String actual=removcharA.remove("A");
		assertEquals("",actual);
		
		actual=removcharA.remove("B");
		assertEquals("B",actual);
	}
	
	@Test
	void test1() {
		String actual=removcharA.remove("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void test2() {
		String actual=removcharA.remove("AACD");
		assertEquals("CD",actual);
	}

	@Test
	void test3() {
		String actual=removcharA.remove("BACD");
		assertEquals("BCD",actual);
	}

	@Test
	void test4() {
		String actual=removcharA.remove("BBAA");
		assertEquals("BBAA",actual);
	}
	
	@Test
	void test5() {
		String actual=removcharA.remove("AABAA");
		assertEquals("BAA",actual);
	}

}
