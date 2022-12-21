package com.HRM.Orange_module;

import org.testng.annotations.Test;
public class OpenApplication {
	@Test(groups = "sanity")
	public void test() {
		System.out.println("sagar");
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}

}
