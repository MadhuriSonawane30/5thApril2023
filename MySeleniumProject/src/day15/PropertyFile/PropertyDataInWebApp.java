package day15.PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;    
import java.util.Properties;   
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.support.ui.ExpectedConditions;      
import org.openqa.selenium.support.ui.WebDriverWait;
import day13.dropdownhandling.SeleniumUtil;  

public class PropertyDataInWebApp { 

	public static void main(String[] args) throws IOException {
	//Load required property file
		FileInputStream fis=new FileInputStream(".\\MyData\\TestData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
WebDriver driver = SeleniumUtil.setUp(prop.getProperty("browsername"), prop.getProperty("url"));		
	driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));	
	driver.findElement(By.name("pwd")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.id("loginButton")).click();
		
	String expectedTitle=prop.getProperty("expectedHomePageTitle");	
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
		System.out.println("Login Successful");
	}else {
		System.out.println("Either login got failed or title got changed");
	
	}

	}
}
