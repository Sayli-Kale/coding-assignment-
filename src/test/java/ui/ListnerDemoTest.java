package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import comman.BaseTest;

public class ListnerDemoTest  extends BaseTest{
	@Test
	public void launchApp() {
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	
	}

}
