package com.mmt.support.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.mmt.support.FrameworkConstants.getExplicitwait;

import java.util.List;

import com.mmt.drivers.DriverManager;

/*
 * Explicit wait based on certain conditions
 * The conditions are referenced from the WaitStrategy enumerator
 */
public class ExplicitWaitFactory {

	public static WebElement explicitlyWaitForElement(By by, WaitStrategy waitStrategy) {

		if (waitStrategy == WaitStrategy.CLICKABLE) {
			return new WebDriverWait(DriverManager.getDriver(), getExplicitwait())
					.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if (waitStrategy == WaitStrategy.PRESENT) {
			return new WebDriverWait(DriverManager.getDriver(), getExplicitwait())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if (waitStrategy == WaitStrategy.VISIBLE) {
			return new WebDriverWait(DriverManager.getDriver(), getExplicitwait())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		return DriverManager.getDriver().findElement(by);
	}

	
	
	
	public static List<WebElement> explicitlyWaitForElements(By by, WaitStrategy waitStrategy) {

		if (waitStrategy == WaitStrategy.PRESENT) {
			return new WebDriverWait(DriverManager.getDriver(), getExplicitwait())
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		}
		else if (waitStrategy == WaitStrategy.VISIBLE) {
			return new WebDriverWait(DriverManager.getDriver(), getExplicitwait())
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		}
		return DriverManager.getDriver().findElements(by);
	}
}
