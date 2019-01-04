package com.jp.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxUtil {

	public static WebDriver getDriver() {
		WebDriver driver=null;		
	// Step1 : driver class		
			String driverClassKey="webdriver.gecko.driver";
	// Step2 :driver path								
			String driverPathValue=".\\driver\\geckodriver.exe";
	//Step3 :Set the System class Properties (Key, Value)
			System.setProperty(driverClassKey,driverPathValue );
	//Step4 : Set the capabilities of the Browser
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	//Step5 : Get the driver instance by FirefoxDriver
			driver = new FirefoxDriver(capabilities);
		return driver;
		
	}

}
