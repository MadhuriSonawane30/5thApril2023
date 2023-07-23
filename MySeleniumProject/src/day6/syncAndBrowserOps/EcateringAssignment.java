package day6.syncAndBrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import day5.syncAndbrowserOps.SeleniumUtil;

public class EcateringAssignment {

	public static void main(String[] args) {
	
		// set browser
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.ecatering.irctc.co.in/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//get page title and print it
				String appTitle = driver.getTitle();
				System.out.println("Current page title is:" + appTitle);
				System.out.println("Current page title is:" + driver.getTitle());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
