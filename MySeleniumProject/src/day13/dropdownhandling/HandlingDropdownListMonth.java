package day13.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day12RelativePath.SeleniumUtil;

public class HandlingDropdownListMonth {

	public static void main(String[] args) {
		 //Set the browser
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		// Identify dropdown list
		WebElement monthDropdown = driver.findElement(By.cssSelector("select[placeholder='Month']"));
//Create an instance of Select class and pass above element into its constructor
		Select selectMonth = new Select(monthDropdown);
//Check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown allowing you to select multiple option:" + selectMonth.isMultiple());
//Get default or already selected option
		System.out.println("Default value is:" + selectMonth.getFirstSelectedOption().getText());
//Get option count
		List<WebElement> options = selectMonth.getOptions();
		System.out.println("Options Count is:"+options.size());
//get dropdown option names
		for (int i = 0; i < options.size(); i++) {
		System.out.println("Option " + i + " : " + options.get(i).getText());	
		}
	//checking order of months
	String[] expectedMonth= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	for (int j = 1; j < options.size(); j++) {	
		//refer recording for explanation day 4 july 2023
	System.out.println("Checking sequence of months:"+options.get(j).getText().equals(expectedMonth[j-1]));	
	}
	}	
}
	
		
	

	
	
	
	
	
	
			
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



