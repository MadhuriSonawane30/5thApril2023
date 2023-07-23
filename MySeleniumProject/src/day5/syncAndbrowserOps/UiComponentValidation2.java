package day5.syncAndbrowserOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UiComponentValidation2 {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtil.setUp("chrome",
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// identify first name input field
		WebElement userNameInputField = driver.findElement(By.name("username"));
		System.out.println("User name input field visible or not?" + userNameInputField.isDisplayed());
		System.out.println("User name input field enabled or not?" + userNameInputField.isEnabled());
		String userNameInputFieldValue = userNameInputField.getAttribute("placeholder");
		System.out.println("Default value validation status?" + userNameInputFieldValue.equals("Username"));

		// identify password input field
		WebElement passwordInputField = driver.findElement(By.name("password"));
		System.out.println("Password input field visible or not?" + passwordInputField.isDisplayed());
		System.out.println("Password input field enabled or not?" + passwordInputField.isEnabled());
		String passwordInputFieldValue = passwordInputField.getAttribute("placeholder");
		System.out.println("Default value validation status?" + passwordInputFieldValue.equals("Password"));

		// identify login button
		WebElement loginButton = driver.findElement(By.className("oxd-button"));
		System.out.println("login button field visible or not?" + loginButton.isDisplayed());
		System.out.println("login button functional or not?" + loginButton.isEnabled());
		String actualButtonName = loginButton.getText().trim();
		System.out.println("Submit Button name validation status?" + actualButtonName.equals("Login"));

		// identify forgot your password button
		WebElement forgotYourPasswordButton = driver.findElement(By.className("orangehrm-login-forgot-header"));
		System.out.println("Forgot your password button visible or not?" + forgotYourPasswordButton.isDisplayed());
		System.out.println("Forgot your password button functional or not?" + forgotYourPasswordButton.isEnabled());
		String forgotPasswordButtonName = forgotYourPasswordButton.getText().trim();
		System.out.println("Forget your password button validation status?"
				+ forgotPasswordButtonName.equals("Forgot your password?"));

	}

}
