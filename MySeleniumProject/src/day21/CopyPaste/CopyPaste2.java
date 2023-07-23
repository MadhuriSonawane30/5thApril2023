package day21.CopyPaste;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste2 {

	public static void main(String[] args) {
		// set the browser
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		// enter first name
		WebElement firstNameInputField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		// Create an instance of Actions class and pass browser instance to its
	
		Actions act = new Actions(driver);
//type admin and double click on it using Action class
		firstNameInputField.sendKeys("admin");
		//note: When we are performing more than 1 operations using mouse class then we use build method
		act.moveToElement(firstNameInputField).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//enter last name and press ENTER button using keys class
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
		
		//another way to copy paste is in next program i.e CopyPaste 3
		
		
		
		
		
		
		
		
		
		
		
	}

}
