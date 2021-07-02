package org.sel.ag;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumOf\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement frme = driver.findElement(By.id("heading304"));
		a.contextClick(frme).perform();
		for (int i = 0; i < 9; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		//r.keyPress(KeyEvent.ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
		
		
//		WebElement srch = driver.findElement(By.id("heading20"));
//	    srch.click();
//	    Thread.sleep(4000);
//	    WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
//	    a.moveToElement(cts).perform();
//	    Thread.sleep(2000);
//	    a.contextClick(cts).perform();
//	    Thread.sleep(2000);
//	//r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
	//	r.keyRelease(KeyEvent.VK_CONTROL);

//		Robot r = new Robot();
//		WebElement txt = driver.findElement(By.id("email"));
//		txt.sendKeys("sanji");
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(2000);
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.click();
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
	}

}