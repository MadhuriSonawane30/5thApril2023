package day11cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day5.syncAndbrowserOps.SeleniumUtil;

public class orangeHRM {

	public static void main(String[] args) throws InterruptedException {
	

		//set the required browser
				System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
				//create instance of required browser
				WebDriver driver= new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Enter the required URL
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				//maximize the browser
				driver.manage().window().maximize();
				Thread.sleep(1500);
				//get page title and print it
				String appTitle = driver.getTitle();
				System.out.println("Current page title is:" + appTitle);
				System.out.println("Current page title is:" + driver.getTitle());
				//Type username as standard_user
				driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
				Thread.sleep(1500);
				//Type password as secret_sauce
				driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
				Thread.sleep(1500);
				//click on login button
				driver.findElement(By.cssSelector("button[type='submit']")).click();
				Thread.sleep(1500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
