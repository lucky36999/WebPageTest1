package com.qa.webPageTest.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import com.qa.WebPageTest.factory.DriverFactory;
import com.qa.WebPageTest.pages.AdvancedTestingPage;

public class BaseTest {

	public WebDriver driver;
	public Properties prop;
	public DriverFactory df;
	public AdvancedTestingPage advancedTestingPage;

	@BeforeTest
	public void setUo() {

		df = new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		advancedTestingPage = new AdvancedTestingPage(driver);

		driver.get(prop.getProperty("url"));
	}

	@AfterTest(enabled = false)
	public void tearDown() {
		driver.quit();
	}
}
