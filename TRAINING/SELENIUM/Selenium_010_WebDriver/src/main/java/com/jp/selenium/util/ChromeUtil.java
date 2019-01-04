package com.jp.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeUtil {

	public static WebDriver getDriver() {
		WebDriver driver=null;		
	// Step1 : driver class		
			String driverClassKey="webdriver.chrome.driver";
	// Step2 :driver path								
			String driverPathValue=".\\driver\\chromedriver.exe";
	//Step3 :Set the System class Properties (Key, Value)
			System.setProperty(driverClassKey,driverPathValue );
	//Step4 : Set the Chrome options
			ChromeOptions options = new ChromeOptions();
	//Step5 : Get the driver instance by passing the options object to ChromeDriver
			driver = new ChromeDriver(options);
		return driver;
		
	}

}
