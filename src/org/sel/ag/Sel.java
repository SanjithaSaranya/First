package org.sel.ag;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sel {
	
	
	 public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumOf\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement rest = driver.findElement(By.xpath(""));
		WebElement text = driver.findElement(By.id("heading20"));
		js.executeScript("arguments[0].scrollIntoView(true)", rest);
		text.click();
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\New\\In\\first.png");
		FileUtils.copyFile(src, dest);
		WebElement up = driver.findElement(By.xpath("//*[@id=\"upcoming-dates\"]/div[3]/a/div/span"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);

				}
	}

