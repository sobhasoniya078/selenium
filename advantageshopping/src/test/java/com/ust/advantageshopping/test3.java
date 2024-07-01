package com.ust.advantageshopping;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class test3 {
	@Test(priority=1)
	public void successTest() {
		assertTrue(true);
	}
	@Test(priority=1)
	public void failTest() {
		assertTrue(false);
	}
	@Test(dependsOnMethods="failTest")
	public void thirdTest() {
		assertTrue(true);
	}

}
