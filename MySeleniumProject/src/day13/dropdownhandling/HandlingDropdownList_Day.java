package day13.dropdownhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day12RelativePath.SeleniumUtil;

public class HandlingDropdownList_Day {

	public static void main(String[] args) {
	
		 //Set the browser
			WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
			//Create an instance of Select class and pass above element into its constructor
			Select dayDropdown=new Select(driver.findElement(By.id("daybox")));
	//Check whether dropdown is multiselect dropdown or not
			System.out.println("Is dropdown allowing you to select multiple option:" + dayDropdown.isMultiple());
	//Get default or already selected option
			System.out.println("Default value is:" + dayDropdown.getFirstSelectedOption().getText());
	//Get option count
			List<WebElement> options =dayDropdown.getOptions();
			System.out.println("Options Count is:"+options.size());
//see Recording for Explanation 4 july2023 47:00 min
		List<Integer> days=new ArrayList<Integer>();
		for(int i=1; i<dayDropdown.getOptions().size();i++) {
			String day=dayDropdown.getOptions().get(i).getText();
			days.add(Integer.parseInt(day));
		}
		List<Integer> dupdays=new ArrayList<Integer>(days);
		//dupDays.addAll(days);
		Collections.sort(dupdays);
		System.out.println(days.equals(dupdays));
		
			
		
	}

}
