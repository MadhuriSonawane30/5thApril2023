package day4.syncAndbrowserOps;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {

	public static void main(String[] args) {
	//set required browser driver executable path using System.setProperty(key,value)
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//create instance of required browser class 
WebDriver driver=new ChromeDriver();
//enter required URL
driver.get("https://demo.actitime.com/login.do");
System.out.println("Login page title:"+driver.getTitle());
//type username as admin
driver.findElement(By.id("username")).sendKeys("admin");
//type password as manager
driver.findElement(By.name("pwd")).sendKeys("manager");
//click on login button
driver.findElement(By.id("loginButtonContainer")).click();
//validate home page
String expectedHomePageTitle="actiTIME - Enter Time-Track";
//In real world,ActiTime home page title changes after sometime, thats why selenium will login page title
//To avoid this we can use conditional wait of selenium
//Create an instance of FluentWait class with timeout.polling.time(try) and exception to be ignored
FluentWait wait=new FluentWait(driver)
.withTimeout(Duration.ofSeconds(20))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);

wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
String actualHomePageTitle=driver.getTitle();
System.out.println("Actual Home page title:"+actualHomePageTitle);
System.out.println(("Expected Home page title:"+expectedHomePageTitle));
if(actualHomePageTitle.equals(expectedHomePageTitle)) {
	System.out.println("Homepage validation is successful,logout from application now");
//Logout from application
	/**identify the login button using findElement(By) and perform the required operation*/
	driver.findElement(By.id("logoutLink")).click();
}else {
	System.out.println("Home page validation is failed,not allowed to logout from the application ");
	//close the browser
	driver.close();
	
}
	}

	private static FluentWait pollingEvery(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}
	
}








