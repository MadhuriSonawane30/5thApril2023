package day13.dropdownhandling;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import day12RelativePath.SeleniumUtil;
public class HandlingDropdownList1 {
	public static void main(String[] args) {
	//Set the browser
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		// Identify dropdown list
		WebElement yearDropdown = driver.findElement(By.id("yearbox"));
//Create an instance of Select class and pass above element into its constructor
		Select selectYear = new Select(yearDropdown);
//Check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown allowing you to select multiple option:" + selectYear.isMultiple());
//Get default or already selected option
		System.out.println("Already selected option name:" + selectYear.getFirstSelectedOption().getText());
//Get option count
		List<WebElement> options = selectYear.getOptions();
		System.out.println("Option Count is:"+options.size());
//get dropdown option names
		for (int i = 0; i < options.size(); i++) {
			System.out.println("Options " + i + " : " + options.get(i).getText());	
		}
		//select options from dropdown
		//select by index
		selectYear.selectByIndex(5);
		System.out.println("Already selected option name is:"+selectYear.getFirstSelectedOption().getText());
		//select by value
		selectYear.selectByValue("1920");
		System.out.println("Already selected option name is:"+selectYear.getFirstSelectedOption().getText());
		//select by visible text
		selectYear.selectByVisibleText("1930");
		System.out.println("Already selected option name is:"+selectYear.getFirstSelectedOption().getText());
		//verify drop down list sequence
		//checking the order of year
		//Refer Recording for explanation day 4 july 2023
		String act_yearValue="";//
		//get dropdown option names
		for(int i= 1; i <options.size(); i++ ) {
			if((options.size()-1)!=i) {
				act_yearValue=act_yearValue+options.get(i).getText()+",";
			}else {
				act_yearValue=act_yearValue+options.get(i).getText();
			}
		}
	//Expected skills
String exp_yearValue="1916,1917,1918,1919,1920,1921,1922,1923,1924,1925,1926,1927,1928,1929,1930,1931,1932,1933,1934,1935,1936,1937,1938,1939,1940,1941,1942,1943,1944,1945,1946,1947,1948,1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015";       
System.out.println("skillName:"+act_yearValue);			
System.out.println("exp_skillName:"+exp_yearValue);		
System.out.println("Skills are in sequential order or not:"+act_yearValue.equals(exp_yearValue));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}