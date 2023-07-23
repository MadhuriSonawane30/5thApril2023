package day5.syncAndbrowserOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UiComponentValidation3 {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtil.setUp("chrome",
				"https://demo.vtiger.com/vtigercrm/");
		
		// identify first name input field
		WebElement userNameInputField = driver.findElement(By.id("username"));
		System.out.println("User name input field visible or not?" + userNameInputField.isDisplayed());
		System.out.println("User name input field enabled or not?" + userNameInputField.isEnabled());
		String userNameInputFieldValue = userNameInputField.getAttribute("value");
		System.out.println("Default value validation status?" + userNameInputFieldValue.equals("admin"));


		// identify password input field
		WebElement passwordInputField = driver.findElement(By.id("password"));
		System.out.println("Password input field visible or not?" + passwordInputField.isDisplayed());
		System.out.println("Password input field enabled or not?" + passwordInputField.isEnabled());
		String passwordInputFieldValue = passwordInputField.getAttribute("value");
		System.out.println("Default value validation status?" + passwordInputFieldValue.equals("Test@123"));

		// identify sign in button
		WebElement signInButton = driver.findElement(By.className("button"));
		System.out.println("Sign in button field visible or not?" + signInButton.isDisplayed());
		System.out.println("Sign in button functional or not?" + signInButton.isEnabled());
		String actualButtonName = signInButton.getText().trim();
		System.out.println("Submit Button name validation status?" + actualButtonName.equals("Sign in"));

		// identify forgot password button
		WebElement forgotPasswordButton = driver.findElement(By.className("forgotPasswordLink"));
		System.out.println("Forgot password button visible or not?" + forgotPasswordButton.isDisplayed());
		System.out.println("Forgot password button functional or not?" + forgotPasswordButton.isEnabled());
		String forgotPasswordButtonName = forgotPasswordButton.getText().trim();
		System.out.println("Forget password button validation status?"
				+ forgotPasswordButtonName.equals("forgot password?"));


	}

}
