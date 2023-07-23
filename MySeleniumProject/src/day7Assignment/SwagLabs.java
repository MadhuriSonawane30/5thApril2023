package day7Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabs {
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
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1500);
		//Type password as secret_sauce
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		//click on login button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1500);
		//click on  Sauce Labs Backpack to open it
		driver.findElement(By.className("inventory_item_name")).click();
		Thread.sleep(1500);
		//click on add to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1500);
		//go to cart
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(1500);
		//go to checkout
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1500);
		//fill details for First Name
		driver.findElement(By.id("first-name")).sendKeys("Jenny");
		Thread.sleep(1500);
		//fill details for last name
		driver.findElement(By.id("last-name")).sendKeys("Joseph");
		Thread.sleep(1500);
		//fill details for Zip/PostalCode
		driver.findElement(By.id("postal-code")).sendKeys("345678");
		Thread.sleep(1500);
		//click on continue option
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1500);
		//click on finish button
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1500);
		//close the browser
		driver.close();
				
	
		
		
		
		
		
		
		

	}

}
