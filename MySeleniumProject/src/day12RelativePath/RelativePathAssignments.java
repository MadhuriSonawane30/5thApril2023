package day12RelativePath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativePathAssignments {

	public static void main(String[] args) throws InterruptedException {
		//set the required browser
				System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
				//create instance of required browser
				WebDriver driver= new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Enter the required URL
				driver.get("https://www.saucedemo.com/");
				//maximize the browser
				driver.manage().window().maximize();
				Thread.sleep(1500);
				//Type username as standard_user
				driver.findElement(By.cssSelector("form>:first-child>input#user-name")).sendKeys("standard_user");
				Thread.sleep(1500);
				//Type password as secret_sauce
				driver.findElement(By.cssSelector("form>div:nth-of-type(2)>input#password")).sendKeys("secret_sauce");
				Thread.sleep(1500);
				//click on login button
				driver.findElement(By.cssSelector("form>input#login-button")).click();
				Thread.sleep(1500);
		
		
		
		
		
		
		
		
	}
}
