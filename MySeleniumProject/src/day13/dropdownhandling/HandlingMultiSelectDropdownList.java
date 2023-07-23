package day13.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day14CustomDropDown.SeleniumUtil;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome","http://omayo.blogspot.com/");
//Identify dropdown list
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		//create an instance of select class and pass above element into the constructor
		Select selectSkill=new Select(carDropdown);
		//check whether dropdown list is multiselect or not
		System.out.println("Is dropdown allowing ypu to select multiple option:"+selectSkill.isMultiple());
		//get option count
		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Option count is"+options.size());
		//get dropdown option names
		for(int i=0; i<options.size();i++) {
			System.out.println("Options"+i+":"+options.get(i).getText());
		}
		//select options from dropdown by (ByIndex)
		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(2);
		selectSkill.selectByIndex(3);
		//or
		//select options from dropdown by(ByValue)
		selectSkill.selectByValue("Hyundaix");
		//or
		//select options from dropdown by (ByVisibleText)
		selectSkill.selectByVisibleText("Audi");
		
		//get all the selected options
		List<WebElement> selectCars=selectSkill.getAllSelectedOptions();
		System.out.println("Selected Car Count:"+selectCars.size());
		
		//unselect already selected options by ByIndex
		selectSkill.deselectByIndex(0);
		
		//unselect already selected options by ByValue
		selectSkill.deselectByValue("Hyundaix");

		//unselect already selected options by ByVisibleText
		selectSkill.deselectByVisibleText("Audi");
		//or
		selectSkill.deselectAll();
		
		

	}

}
