package day11cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTIME {

	public static void main(String[] args) throws InterruptedException {
		
		//set the required browser
				System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
				//create instance of required browser
				WebDriver driver= new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Enter the required URL
				driver.get("https://demo.actitime.com/login.do");
				//maximize the browser
				driver.manage().window().maximize();
				Thread.sleep(1500);
				//Type username as standard_user
				driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
				Thread.sleep(1500);
				//Type password as secret_sauce
				driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
				Thread.sleep(1500);
				//click on login button
				driver.findElement(By.cssSelector("a#loginButton")).click();
				Thread.sleep(1500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
