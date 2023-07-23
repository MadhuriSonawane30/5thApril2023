package day10MultipleElementsDropDownAssignment;

import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import day5.syncAndbrowserOps.SeleniumUtil;


public class Flipkart {	
	public static void main(String[] args) {
// set browser
WebDriver driver=SeleniumUtil.setUp("chrome","https://www.flipkart.com/");
//implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//get page title and print it
		String appTitle = driver.getTitle();
		System.out.println("Current page title is:" + appTitle);
		System.out.println("Current page title is:" + driver.getTitle());

   	// Validate the title
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		// Explicit Wait WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// WebDriver will wait till the page title matches with in given time
		wait.until(ExpectedConditions.titleIs(expectedTitle));
	String actualTitle = driver.getTitle();
	System.out.println("Page title :" + driver.getTitle());
		System.out.println("Home page validation status:" + expectedTitle.equals(actualTitle));
		//select main menu
		List<WebElement>menuList=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div"));
		System.out.println("Total menu found:"+menuList.size());	
		//print suggestions in console
			for(int i=0; i < menuList.size();i++) {
			WebElement Menu=menuList.get(i);
			System.out.println("Menu list name"+i+":"+Menu.getText());
				
				
				
				
			}






		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void ignoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private static void pollingEvery(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

	private static void waitTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

}
