package com.jp.webdriver.form.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.jp.webdriver.util.ChromeDriverUtil;

public class FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ChromeDriverUtil.getDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("first");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("last");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("868989812");
		Thread.sleep(1000);
		List<WebElement> radioElem = driver.findElements(By.name("sex"));
		
	       for (WebElement webElement : radioElem) {
	        	String radioSelection;
	        	radioSelection = webElement.getAttribute("value").toString();
	        	if(radioSelection.equals("2")) {
	        		webElement.click();
	        	}
	        }
		
		Select selectByIndex = new Select(driver.findElement(By.id("day")));
		selectByIndex.selectByIndex(10);
		Thread.sleep(500);
		
		Select selectByVisibleText = new Select(driver.findElement(By.id("month")));
		selectByVisibleText.selectByVisibleText("Nov");
		Thread.sleep(500);
		
		Select selectByValue = new Select(driver.findElement(By.id("year")));
		selectByValue.selectByValue("1980");
	}

}
