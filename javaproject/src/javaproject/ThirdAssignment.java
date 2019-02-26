package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class ThirdAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\PreetyGuleria\\javaproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Bluestone.com");
		 WebElement GoldCoins  = driver.findElement(By.id("goldCoins"));
	      driver.manage().window().maximize();
	      Actions ac = new Actions(driver);
	        ac.moveToElement(GoldCoins).perform();
	        driver.findElement(By.xpath("//span[@data-p=\'l-gold-coins-weight-5gms,m\']")).click();
	        Assert.assertEquals(driver.getTitle(),"5 gram 24 KT Lakshmi Gold Coin|Bluestone.com");
	        

	}

}
