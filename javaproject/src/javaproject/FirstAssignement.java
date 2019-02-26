package javaproject;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class FirstAssignement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\PreetyGuleria\\javaproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Bluestone.com");
      WebElement GoldCoins  = driver.findElement(By.id("goldCoins"));
      driver.manage().window().maximize();
       Actions ac = new Actions(driver);
        ac.moveToElement(GoldCoins).perform();
        driver.findElement(By.xpath("//span[@data-p=\'gold-coins-weight-50gms,m\']")).click();
        Assert.assertEquals(driver.getTitle(),"50 gram 24 KT Gold Coin | BlueStone.com");
        
	 
			 
		
		

	}

}
