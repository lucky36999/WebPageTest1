package com.qa.WebPageTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedTestingPage {

	private WebDriver driver;

	private By titleLbl = By.cssSelector("div#main > h1");
	private By advancedTestingTab = By.linkText("Advanced Testing");
	private By urlText = By.id("url");
	private By startTestBtn = By.xpath("//button[starts-with(text(), 'Start Test')]");
	private By testLocationSsl = By.id("location");
	private By browserSsl = By.id("browser");

	public AdvancedTestingPage(WebDriver driver) {

		this.driver = driver;
	}

	public String getTitle() {

		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void performWebsiteTesting(String url) {
		driver.findElement(urlText).sendKeys(url);
		// Select locationEle = new Select(driver.findElement(testLocationSsl));
		// locationEle.selectByVisibleText(location);
		//
		// Select browserEle = new Select(driver.findElement(browserSsl));
		// browserEle.selectByVisibleText(browser);

		driver.findElement(startTestBtn).click();
	}
}
