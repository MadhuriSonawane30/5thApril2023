package day21.CopyPaste;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CopyPaste1 {

	public static void main(String[] args) {
//set the browser
		WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.automationtesting.in/Register.html");
		//enter first name
		WebElement firstNameInputField= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		//type admin and press Ctrl A button using keys class
		firstNameInputField.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		//Press Ctrl c using keys class
		firstNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//or
		//write all together in one line
		firstNameInputField.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		//Enter last name and press enter button using Keys class
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
