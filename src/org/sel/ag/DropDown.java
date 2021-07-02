package org.sel.ag;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
int nom=0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumOf\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
        WebElement userName = driver.findElement(By.id("username"));
     
		userName.sendKeys("karthi007");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("Karthi@1989");
        WebElement btnLogin = driver.findElement(By.id("login"));
        btnLogin.click();
        WebElement location = driver.findElement(By.id("location"));
        Select s = new Select(location);
        s.selectByIndex(2);
        List<WebElement> options = s.getOptions();
        for (int i = 0; i < options.size(); i++) {
			WebElement web = options.get(i);
			String text = web.getText();
			System.out.println(text);
		}
        WebElement hotel = driver.findElement(By.id("hotels"));
        Select s1 = new Select(hotel);
        s1.selectByValue("Hotel Creek");
        WebElement type = driver.findElement(By.id("room_type"));
        Select s2 = new Select(type);
        s2.selectByVisibleText("Double");
        WebElement no = driver.findElement(By.id("room_nos"));
        Select s3 = new Select(no);
        s3.selectByVisibleText("1 - One");
        WebElement dateIn = driver.findElement(By.id("datepick_in"));
        dateIn.sendKeys("09/01/2020");
        WebElement dateOut = driver.findElement(By.id("datepick_out"));
        dateOut.sendKeys("12/01/2020");
        WebElement adult = driver.findElement(By.id("adult_room"));
        Select ss = new Select(adult);
        ss.selectByIndex(1);
        Thread.sleep(3000);
        List<WebElement> options2 = ss.getOptions();
        for (int i = 0; i < options2.size() ; i++) {
			nom= nom +1;
		}
        System.out.println(nom);
        WebElement search = driver.findElement(By.id("Submit"));
        search.click();
        WebElement radio = driver.findElement(By.id("radiobutton_0"));
        radio.click();
        WebElement ctn = driver.findElement(By.id("continue"));
        ctn.click();

        WebElement frstName = driver.findElement(By.id("first_name"));
        frstName.sendKeys("abcd");
        WebElement lstName = driver.findElement(By.id("last_name"));
        lstName.sendKeys("xyz");
        WebElement add = driver.findElement(By.id("address"));
        add.sendKeys("12, erd,tyv");
        Thread.sleep(5000);
        WebElement ccNum = driver.findElement(By.id("cc_num"));
        ccNum.sendKeys("1234567890123456");
        WebElement ccType = driver.findElement(By.id("cc_type"));
        Select ss1 = new Select(ccType);
        ss1.selectByVisibleText("American Express");
        WebElement month = driver.findElement(By.id("cc_exp_month"));
        Select ss2 = new Select(month);
        ss2.selectByIndex(3);
        WebElement year = driver.findElement(By.id("cc_exp_year"));
        Select ss3 = new Select(year);
        ss3.selectByIndex(4);
        WebElement cNum = driver.findElement(By.id("cc_cvv"));
        cNum.sendKeys("1234");
        WebElement btn = driver.findElement(By.id("book_now"));
        btn.click();
        Thread.sleep(10000);
        JavascriptExecutor jk = (JavascriptExecutor)driver;
        WebElement orderNo = driver.findElement(By.id("order_no"));
        jk.executeScript("arguments[0].scrollIntoView(true)", orderNo);
		String text = orderNo.getAttribute("value");
		System.out.println(text);
             
	}
}
