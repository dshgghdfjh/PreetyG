package javaproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixthAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\PreetyGuleria\\javaproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https:www.google.com");
		//driver.get("https://www.java.com/download/");
       //  WebElement wc=driver.findElement(By.xpath("//a[@href=\'https://www.java.com/download/\']"));
         driver.switchTo().activeElement().sendKeys("java");
	  	 driver.findElement (By.xpath("//input[@value='Google Search']")).click();
		
	//	String websiteTitle2 = driver.getTitle();
	
		//System.out.println("Title for selected Website for VIEW link: " + websiteTitle2);
	  	List<WebElement> alllinks = driver.findElements(By.xpath("//h3"));
	  	int count = alllinks.size();
	  	for(int i = 0;i<count;i++) 
	  {
		 WebElement link = alllinks.get(i);
		 System.out.println(link.getText());
	  }
		driver.close();

		 



	}

}
