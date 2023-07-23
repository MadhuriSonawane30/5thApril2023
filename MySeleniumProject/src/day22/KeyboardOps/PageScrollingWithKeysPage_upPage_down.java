package day22.KeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import day13.dropdownhandling.SeleniumUtil;

public class PageScrollingWithKeysPage_upPage_down {

	public static void main(String[] args) throws InterruptedException {
//set the browser n url
		WebDriver driver= SeleniumUtil.setUp("chrome","https://www.flipkart.com/");
//If login page is shown then we have to escape it by using try and catch method
		try {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e) //Concentrate
		{
			System.out.println(e);
		}
		//Scrolling down the page
		//we are scrolling 6 times therefore
		for (int i=0 ; i<6; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		//scrolling up the page
		for( int i=0;i<6; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
			Thread.sleep(1000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
