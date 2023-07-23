package day17.ValidatePosition;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import day13.dropdownhandling.SeleniumUtil;

public class ValidatePosition1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// why do we provide attribute to be= means error msg ke attribute mein ye value
		// dikhni chahiye i.e class and error msg
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector(".errormsg"), "class", "errormsg"));
		Thread.sleep(2000);

		WebElement errorMsg = driver.findElement(By.cssSelector(".errormsg"));
		// get point class object using getLocation method
		Point errorCord = errorMsg.getLocation();
		// //get x or y cord based on requirement from point class
		int errorCord_x = errorCord.getX();
		int errorCord_y = errorCord.getY();
		System.out.println("Error msg x cord:" + errorCord_x);
		System.out.println("Error msg y cord:" + errorCord_y);

		// now for username
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		WebElement usernameInputField = driver.findElement(By.id("username"));
		// get point class object using get location method
		Point userNameInputCord = usernameInputField.getLocation();
		// get x or y cord based on requirement from point class
		int user_x = userNameInputCord.getX();
		int user_y = userNameInputCord.getY();
		System.out.println("Username input field x cord:" + user_x);
		System.out.println("Username input field y cord:" +user_y);
 
		System.out.println("Is error msg getting displayed over username input field:" + (errorCord_y < user_y));

	}

}
