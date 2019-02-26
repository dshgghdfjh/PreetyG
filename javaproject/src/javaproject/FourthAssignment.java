package javaproject;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\PreetyGuleria\\javaproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		String parentwh = driver.getWindowHandle();
		Thread.sleep(4000);
		((JavascriptExecutor)driver).executeScript("window.open();");
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println( windowhandles);
		for(String wh : windowhandles)
		{
			driver.switchTo().window(wh);
			
				
		}
		System.out.println("Test");
		driver.get("https://www.urbanladder.com");
		
      driver.switchTo().window(parentwh).get("https://www.ebay.com");

	}

}
