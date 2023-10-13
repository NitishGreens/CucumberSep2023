package com.libglobal;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public void launchBrowser(String browserName) {

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			break;
		}

	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void elementSendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void elementClick(WebElement element) {
		element.click();
	}

	public void closeBrowser() {
		driver.quit();
	}

	public static String getProjectPath() {

		String property = System.getProperty("user.dir");
		return property;

	}

	public void selectOptionByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public byte[] takeScreenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}

	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
