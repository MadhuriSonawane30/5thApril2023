package day22.KeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import day13.dropdownhandling.SeleniumUtil;

public class PageScrollingWithKeysPage_homePage_end {

	public static void main(String[] args) throws InterruptedException {
	//set the browser and open the url
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.makemytrip.com/");
		//If login page is shown then we have to escape it by using try and catch method
				try {
					driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
				}catch(NoSuchElementException e) //Concentrate
				{
					System.out.println(e);
				}
		
		//scrolling till bottom of page
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL , Keys.END));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL ,Keys.HOME));
		
	}

}
