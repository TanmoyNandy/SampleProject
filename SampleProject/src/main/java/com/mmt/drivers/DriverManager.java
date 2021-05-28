package com.mmt.drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(WebDriver dr) {
		driver.set(dr);
	}
	
	public static void unload() {
		driver.remove();
	}
	
}
