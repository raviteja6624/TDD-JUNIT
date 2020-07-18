package com.epam.tddjunit;
import org.junit.jupiter.api.Test;
/*
 * TODO LIST
 * 1.A IS PRESENT AT THE 0 INDEX ABCD -> BCD
 * 2.A IS PRESENT AT THE 1ST INDEX BACD -> BCD
 * 3.A IS PRESENT AT THE BOTH 0 AND 1ST INDEX AACD -> CD
 * 4.A IS PRESNT IN 0 AND 1 ST INDEX AND ALSO AT OTHER INDEX AABAA -> BAA
 * 5.A IS NOT PRESENT IN THE STRING BBAA -> BBAA
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tddjuittest 
{	
	DeleteA delete=new DeleteA();
	@Test
	void testA_at_0() 
	{
		assertEquals("BCD",delete.delete1("ABCD"));
	}
	@Test
	void testA_at_1()
	{
		assertEquals("BCD",delete.delete1("BACD"));
	}
	@Test
	void testA_at_0and1()
	{
		assertEquals("CD",delete.delete1("AACD"));
	}
	@Test
	void testA_at_0and1_also_other_index()
	{
		assertEquals("BAA",delete.delete1("AABAA"));
	}
	@Test
	void testA_not_present()
	{
		assertEquals("BBAA",delete.delete1("BBAA"));
	}
}
