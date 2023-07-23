package day22.KeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import day13.dropdownhandling.SeleniumUtil;

public class PressKeyboardButtons_forEg_Enter {

	public static void main(String[] args) {
//set the browser and write the url
WebDriver driver= SeleniumUtil.setUp("chrome","https://demo.actitime.com/login.do");
		//Enter username
driver.findElement(By.id("username")).sendKeys("admin");
//enter password and press ENTER button using Keys class
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		
		
		
		
		
		
		
		

	}

}
