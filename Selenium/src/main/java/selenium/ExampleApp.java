package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleApp {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.applitools.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("log-in"));
				
				
		username.sendKeys("maribel@butchershop.co");
		Thread.sleep(2000);
		password.sendKeys("testing4321");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
