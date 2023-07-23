package day5.syncAndbrowserOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UiComponentValidation {

	public static void main(String[] args) {
	WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.automationtesting.in/Register.html"); 
	//identify first name input field
	WebElement firstNameInputField=driver.findElement(By.className("form-control"));
	System.out.println("First name input field visible or not?"+firstNameInputField.isDisplayed());
	System.out.println("First name input field editable or not?"+firstNameInputField.isEnabled());	
	String firstNameInputFieldValue =firstNameInputField.getAttribute("placeholder");
	System.out.println("Default value validation status:"+firstNameInputFieldValue.equals("First Name"));
	//identify male radio button
	WebElement maleRadioButton=driver.findElement(By.name("radiooptions"));
	System.out.println("Male radio button visible or not?"+maleRadioButton.isDisplayed());
	System.out.println("Male radio button functional or not?"+maleRadioButton.isEnabled());
	System.out.println("Male radio button default selection status?"+maleRadioButton.isSelected());
	maleRadioButton.click();
	System.out.println("After selection,Male radio button selection status?"+maleRadioButton.isSelected());
	//identify submit button
	WebElement submitButton=driver.findElement(By.id("submitbtn"));
	System.out.println("Submit button visible or not?"+submitButton.isDisplayed());
	System.out.println("Submit button functional or not?"+submitButton.isEnabled());
	String actualButtonName=submitButton.getText().trim();
	System.out.println("Submit button name validation status?"+actualButtonName.equals("Submit"));
	
	}

}
