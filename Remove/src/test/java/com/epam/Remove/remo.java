package com.epam.Remove;

import static org.junit.Assert.*;

import org.junit.Test;

public class remo {

	@Test
	public void test1() {
		assertEquals("B",Removingina.rem("AaAB"));
	}
    @Test
    public void test2() {
          assertEquals("Baab",Removingina.rem("Baab"));
    }
    @Test
    public void test3() {
    	assertEquals("",Removingina.rem("AAaa"));
    }
    @Test
    public void test4() {
    	assertEquals("bbbcd",Removingina.rem("AAaabbbcd"));
    }
    @Test
    public void test5() {
    	assertEquals("ZAab",Removingina.rem("ZAab"));
    }
    @Test
    public void test6()
    {
    	assertEquals("q123d",Removingina.rem("Aaq123d"));
    }
}
