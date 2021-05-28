package com.mmt.drivers;

import static com.mmt.support.FrameworkConstants.getChromedriver;
import static com.mmt.support.FrameworkConstants.getImplicitwait;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class Drivers {

	public static void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", getChromedriver());
		if(Objects.isNull(DriverManager.getDriver())) {
			DriverManager.setDriver(new ChromeDriver());
		}
		implicitlyWait();
		maximizeBrowser();
	}
	
	public static void quitDrivers() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
	
	public static void implicitlyWait() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(getImplicitwait(), TimeUnit.SECONDS);
	}
	
	public static void maximizeBrowser() {
		DriverManager.getDriver().manage().window().maximize();
	}	
}
