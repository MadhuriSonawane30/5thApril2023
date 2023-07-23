package day3.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagLabs {

	public static void main(String[] args) {
	     //open browser
		WebDriver driver=setUp("chrome");
		//enter required application url
		driver.get("https://www.saucedemo.com/v1/");
		//enter user name as standard user
		/**identify username input field*/
		driver.findElement(By.id("user-name"));
		WebElement userNameInputField= driver.findElement(By.id("user-name"));
		/**type username in the userNameInputField*/
		userNameInputField.sendKeys("standard_user");
		//enter password as secret_sauce
		driver.findElement(By.name("password"));
		WebElement passwordInputField=driver.findElement(By.name("password"));
		/**typepassword in the passwordInputField*/
		passwordInputField.sendKeys("secret_sauce");
		//click on login button
		driver.findElement(By.id("login-button"));
		WebElement loginButton=driver.findElement(By.id("login-button"));
		//Perform click operation on login button
		loginButton.click();
		//validate login done successfully or not
		String expectedUrl=("Dashboard");
		String actualUrl=driver.getCurrentUrl();
		System.out.println("Actual URL:"+actualUrl);
		System.out.println("Login validation status:"+actualUrl.contains(expectedUrl));
		//close the browser
			driver.close();
	}

		
		
		
		
		
		static WebDriver setUp(String browsername) {
		    WebDriver driver;
		 if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe"); 
		//create required browser driver class and upcast it to webdriver interface
		driver =new ChromeDriver();
		return driver;
		 }else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");	 
			//create required browser driver class and upcast it to webdriver interface 
			 driver=new FirefoxDriver();
			 return driver;
		 }
		 return null;
	}
	}

