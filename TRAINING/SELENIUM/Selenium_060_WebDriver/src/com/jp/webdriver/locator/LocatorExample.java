package com.jp.webdriver.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jp.webdriver.util.ChromeDriverUtil;

public class LocatorExample {

	public static void main(String[] args) throws InterruptedException {
		// get the driver
		WebDriver driver = ChromeDriverUtil.getDriver();
		driver.get("file:\\D:\\GITHUB\\CoderTechnology\\TRAINING\\SELENIUM\\Selenium_060_WebDriver\\src\\Locators.html");
		// lets the locate the webElement
		
		WebElement webElement = driver.findElement(By.id("user"));
		webElement.sendKeys("Darshan");
		Thread.sleep(1000);
		driver.findElement(By.name("admin")).sendKeys("Chaudahri");
		Thread.sleep(1000);
		webElement = driver.findElement(By.linkText("How to use locators?"));
		webElement.click();
		/*
		 * --> ^ - Beginning of the text
		 * --> $ - end of the text
		 * --> * - any text
		 */
		Thread.sleep(1000);
		//driver.close();
	}
	
}
