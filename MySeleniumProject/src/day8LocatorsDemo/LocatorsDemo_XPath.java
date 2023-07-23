package day8LocatorsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo_XPath {

	public static void main(String[] args) {
	//set the required browser
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		//create an instance
	WebDriver driver=new ChromeDriver();
	//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//get the url
	driver.get("https://www.gsmarena.com/");
		//maximize the browser
	driver.manage().window().maximize();
	//Absolute Xpath
	//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/form[1]/input[1]")).sendKeys("Samsung");
	//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/form[1]/span[1]/input[1]")).click();	
		
	//Relative Xpath
	driver.findElement(By.xpath(" //input[@id='topsearch-text']")).sendKeys("Samsung");
	driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/span[1]/input[1]")).click();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
