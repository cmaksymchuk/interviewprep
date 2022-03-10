package com.maksymchuk.cce.arraysstrings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArraysStringsTest {
	ArraysStrings arraysStrings = new ArraysStrings();
	
	@Test 
	public void testIsUnique()
	{
		assertTrue(arraysStrings.isUnique("abcd"));
		assertFalse(arraysStrings.isUnique("abcdea"));
		
	}
	
	@Test public void isPermutation(String s)
	{
//		assertTrue(arraysStrings.isPermutation("abcd","bacd"));
//		assertFalse(arraysStrings.isPermutation("abcdea","abcdef"));
		
	}
}
