package day4.syncAndbrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StdWebDriverCode {

	public static void main(String[] args) throws InterruptedException {
		// set required browser drive executable path using System.setPropert(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(1500); // It will hold the next action till the time is over
		// set required window size
		driver.manage().window().setSize(new Dimension(700, 500));

		Thread.sleep(1500);//
		// maximize browser windows
		driver.manage().window().maximize();
		// click on login button
		driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		Thread.sleep(1500);
		// to come back to previous page
		driver.navigate().back();
		Thread.sleep(1500);
		// to move to next page
		driver.navigate().forward();
		Thread.sleep(1500);
		// to refresh current page
		driver.navigate().refresh();
		Thread.sleep(1500);
		// to move to different application
		driver.navigate().to("https://www.google.com");
		// close the browser
		driver.close();
	}
}
