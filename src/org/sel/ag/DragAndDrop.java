package org.sel.ag;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumOf\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Actions a = new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath(""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement findElement = driver.findElement(By.xpath("//a[text()='Sports & More']"));
//		
//		a.moveToElement(findElement).perform();
//		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
//		
//		findElement2.click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("http://www.flipkart.com");
//		WebElement cross = driver.findElement(By.xpath("//button[text()='✕']"));
//		cross.click();
//		Actions a = new Actions(driver);
//		WebElement find = driver.findElement(By.xpath("(//div [@class=\"xtXmba\"])[6]"));
//		a.moveToElement(find).perform();
//		WebElement findElement = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
//		findElement.click();
//		Thread.sleep(5000);
//		WebElement findElement2 = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
//		a.moveToElement(findElement2).perform();
//		Thread.sleep(3000);
//		WebElement findElement3 = driver.findElement(By.xpath("(//a[text()='Bath Towels'])[1]"));
//		findElement3.click();
//		Thread.sleep(5000);
//		WebElement twl = driver.findElement(By.xpath("(//a[text()='Auris Cotton 500 GSM Bath, Beach Towel'])[1]"));
//		String text = twl.getText();
//		System.out.println(text);
//		
		
		
		
		
//		WebElement src = driver.findElement(By.xpath("//span[text()='Prime']"));
//		a.moveToElement(src );
//		src.click();
//
//		
		
		
		
		
		
			//		WebElement dest = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
////		JavascriptExecutor jk =(JavascriptExecutor) driver;
////		jk.executeScript("arguments[0].scrollIntoView(true)", dest);
//		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//		Thread.sleep(4000);
		//a.dragAndDrop(src,dest).perform();
		
	}
}
