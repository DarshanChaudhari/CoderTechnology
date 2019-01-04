package com.jp.selenium.test;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import com.jp.selenium.util.FireFoxUtil;

public class FireforMain {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver =FireFoxUtil.getDriver();
		System.out.println("Loadng the browser...");
		driver.get("https://www.google.com");
		System.out.println("Opening the browser...");
		String title = driver.getTitle();		
		if(title.equals("Google")) {
			System.out.println("The title is :"+ title);
		} else {
			System.out.println("Wrong Title detected");
		}
		Thread.sleep(1000);
		driver.close();		
	}

}
