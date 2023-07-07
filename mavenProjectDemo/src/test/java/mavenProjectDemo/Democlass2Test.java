package mavenProjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Democlass2Test 
{
	WebDriver driver=null;
	@Test
	public void m2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		/* String BROWSER = System.getProperty("browser");
		 String URL = System.getProperty("url");
		 
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("firefox"))
		 {
			 driver=new FirefoxDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
		 driver.get(URL);*/
		
		
		/*driver.get("http://localhost:8888/");
		 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath(" //input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath(" //input[@type='submit']")).click();*/
		
	}

}
