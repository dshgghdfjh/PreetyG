package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FifthAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\PreetyGuleria\\javaproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/preety.html");
	       String  value =	  driver.findElement(By.xpath("//input[@value='Testyantra']")).getAttribute("value");
	        System.out.println(value);
	       String value2 =   driver.findElement(By.xpath("(//input[@type='Text'])[2]")).getAttribute("value");
	       System.out.println(value2);
	       Assert.assertEquals(value, value2);
	
	
		
		

	}

}
