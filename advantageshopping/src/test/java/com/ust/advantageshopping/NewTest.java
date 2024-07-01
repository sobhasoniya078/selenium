package com.ust.advantageshopping;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(NewClass.class)
public class NewTest {
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
