package day6.syncAndBrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day5.syncAndbrowserOps.SeleniumUtil;

public class Techlistic {

	public static void main(String[] args) throws InterruptedException {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");

	// create instance of required browser class
	WebDriver driver = new ChromeDriver();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	   //open the URL	
		
		
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		//minimize the browser
		driver.manage().window().setSize(new Dimension(700,500));
		Thread.sleep(1500);
		
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		
		//click on selenium link and validate page title 
		WebElement seleniumLinkField=driver.findElement(By.className("dropbtn"));
		seleniumLinkField.click();
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Current page title is:"+actualHomePageTitle);
		System.out.println("Current page title is:"+driver.getTitle());
	
		
		//navigate back to home page
			driver.navigate().back();
			
		//click on selenium page
			
		
		
		
		
		
		
		
		
		

	}

}
