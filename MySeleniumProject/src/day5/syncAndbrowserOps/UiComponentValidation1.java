package day5.syncAndbrowserOps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class UiComponentValidation1 {
	public static void main(String[] args) {
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.actitime.com/login.do");
		// identify first name input field
		WebElement userNameInputField = driver.findElement(By.id("username"));
		System.out.println("User name input field visible or not?" + userNameInputField.isDisplayed());
		System.out.println("User name input field enabled or not?" + userNameInputField.isEnabled());
		String userNameInputFieldValue = userNameInputField.getAttribute("placeholder");
		System.out.println("Default value validation status?" + userNameInputFieldValue.equals("Username"));
//identify password input field
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		System.out.println("Password input field visible or not?" + passwordInputField.isDisplayed());
		System.out.println("Password input field enabled or not?" + passwordInputField.isEnabled());
		String passwordInputFieldValue = passwordInputField.getAttribute("placeholder");
		System.out.println("Default value validation status?" + passwordInputFieldValue.equals("Password"));
//identify keep me login checkbox
		WebElement loginCheckboxButton = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("Login radio button visible or not?" + loginCheckboxButton.isDisplayed());
		System.out.println("Login radio button enabled or not?" + loginCheckboxButton.isEnabled());
		System.out.println("Login radio button selected or not?" + loginCheckboxButton.isSelected());
		loginCheckboxButton.click();
		System.out.println("After selection, login radio button selection status?" + loginCheckboxButton.isSelected());
//identify login button
		WebElement loginButton = driver.findElement(By.id("loginButtonContainer"));
		System.out.println("login button field visible or not?" + loginButton.isDisplayed());
		System.out.println("login button functional or not?" + loginButton.isEnabled());
		String actualButtonName = loginButton.getText().trim();
		System.out.println("Submit Button name validation status?" + actualButtonName.equals("Login"));
//identify forgot your password button
		WebElement forgotYourPasswordButton = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		System.out.println("Forgot your password button visible or not?" + forgotYourPasswordButton.isDisplayed());
		System.out.println("Forgot your password button functional or not?" + forgotYourPasswordButton.isEnabled());
		String forgotPasswordButtonName = forgotYourPasswordButton.getText().trim();
		System.out.println("Forget your password button validation status?"
				+ forgotPasswordButtonName.equals("Forgot your password?"));
		
		//identify actiTIME Inc button
		WebElement actiTIMEIncButton=driver.findElement(By.linkText("actiTIME Inc."));
		System.out.println("actiTIME Inc button visible or not?" + actiTIMEIncButton.isDisplayed());
		System.out.println(" actiTIME Inc button functional or not?" +actiTIMEIncButton.isEnabled());
		String actiTIMEIncButtonName = actiTIMEIncButton.getText().trim();
		System.out.println("actiTIME Inc button validation status?"
				+ actiTIMEIncButtonName.equals("actiTIME Inc."));
		
		
		
		
		
	}

}
