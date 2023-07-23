package day10MultipleElementsDropDownAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day9MultipleElementsDropdown.Selenium;

public class GSMArena2 {
	static WebDriver driver;
	public static void main(String[] args) {
		
		// set browser
		driver = Selenium.setUp("chrome", "https://www.gsmarena.com/");
		//select samsung option
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/aside/div[1]/ul/li[1]/a")).click();

	//identify all mobile devices
		List<WebElement>mobileList=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
	System.out.println("Total mobile found:"+mobileList.size());	
	//print suggestions in console
		for(int i=0; i <mobileList.size();i++) {
		WebElement mobile=mobileList.get(i);
	System.out.println("Mobile" +i+ ":"+mobile.getText());	
		
		
		
		}	
		
	}
}

