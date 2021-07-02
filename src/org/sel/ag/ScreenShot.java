package org.sel.ag;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\eclipse-workspace\\SeleniumOf\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 WebElement crsMark = driver.findElement(By.xpath("//button[text()='✕']"));
	 crsMark.click();	
	 WebElement search = driver.findElement(By.name("q"));
	 search.sendKeys("womens",Keys.ENTER);
	 Thread.sleep(5000);
	 Actions a = new Actions(driver);
	 
	 WebElement women = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[4]"));
	a.moveToElement(women).perform();
	
	 TakesScreenshot tk = (TakesScreenshot)driver;
	 File src = tk.getScreenshotAs(OutputType.FILE);
	 File dest= new File("F:\\New\\In.screen.jpg");
	 FileUtils.copyFile(src, dest);
	}

}
