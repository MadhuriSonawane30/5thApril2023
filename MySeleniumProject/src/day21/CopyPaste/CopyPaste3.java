package day21.CopyPaste;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste3 {


	public static void main(String[] args) {
		// set the browser
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		// enter first name
		WebElement firstNameInputField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		// Create an instance of Actions class and pass browser instance to its
        	Actions act = new Actions(driver);

		//type admin and double click on it using action class
        	firstNameInputField.sendKeys("admin");
        	act.doubleClick(firstNameInputField).build().perform();
        	act.contextClick(firstNameInputField).sendKeys(Keys.ARROW_DOWN) //here context click is used concentrate and no semicolon is given
        	.sendKeys(Keys.ARROW_DOWN) //concentrate no semi colon is given here
        	.sendKeys(Keys.ARROW_DOWN) //concentrate no semi colon is given here
        	.sendKeys(Keys.RETURN).build().perform(); //here return means copy concentrate
		
		//Enter last name and press ENTER button using Keys class
        	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL ,"v"));
		
		
		
	//note: Usually we perform copy paste operation by keyboard because it doesnt always work using mouse methods	
	}


}
