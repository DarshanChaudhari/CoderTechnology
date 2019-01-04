package com.jp.selenium.test;

import org.openqa.selenium.WebDriver;

import com.jp.selenium.util.ChromeUtil;

public class ChromeforMain {

	public static void main(String[] args) {
		WebDriver driver = ChromeUtil.getDriver();
		System.out.println("Loading the Chrome Browser....");
		driver.get("https://google.com/");		
		String title = driver.getTitle();
		if(title.equals("Google" )) {
			System.out.println("Title : " + title);
		} else {
			System.out.println("Wrong Title" );
		}

	}

}
