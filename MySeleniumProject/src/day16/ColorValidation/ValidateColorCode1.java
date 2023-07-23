package day16.ColorValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day13.dropdownhandling.SeleniumUtil;

public class ValidateColorCode1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= SeleniumUtil.setUp("chrome","https://demo.actitime.com/login.do");
driver.findElement(By.id("loginButton")).click();
	
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		// why do we provide attribute to be= means error msg ke attribute mein ye value dikhni chahiye i.e class and error msg
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector(".errormsg"), "class", "errormsg"));
		Thread.sleep(2000);
		
		WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		//selenium got the color in RGBA format
		String msgColorCode= errorMsg.getCssValue("color");
		String msgFontSize= errorMsg.getCssValue("font-size");
		System.out.println("Color code:"+msgColorCode);
		System.out.println("Font-size:"+msgFontSize);
		
		
		
		
	
		
		
		
		
		
	}
}
