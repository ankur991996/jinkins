package org.testng;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class1 {
	/*
	 * @BeforeClass public void beforeclass() { Reporter.log("before class"); }
	 * 
	 * @BeforeMethod public void beforemethod() { Reporter.log("Before method");
	 * }
	 */
	@Parameters("actress")
	@Test
	public void demo1(@Optional("kuch v") String s) {
		// Assert.fail();
		System.out.println(s);
	}

	/*
	 * @AfterMethod public void aftermethod() { Reporter.log("After method"); }
	 */

}
