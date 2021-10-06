package com.qa.webPageTest.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.webPageTest.base.BaseTest;

public class AdvancedTestingPageTest extends BaseTest {
	@DataProvider(name = "websites")
	private Object[] websitesData() {
		return new Object[] { "https://www.browserstack.com/" };
	}

	@Test(dataProvider = "websites")
	public void performWebsiteTestingTest(String url) {
		advancedTestingPage.performWebsiteTesting(url);
	}
}
