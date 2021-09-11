package selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleFindElements {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//getting webElements from the website
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		//login
		userName.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("admin123");
		Thread.sleep(1000);
		loginBtn.click();

		//find elements
		List<WebElement> firstMenuLevel = driver.findElements(By.className("firstLevelMenu")); //del listWebElement, se importa el list.UTIL
		System.out.println("Menu's number: " + firstMenuLevel.size());
		
		String firstMenu = firstMenuLevel.get(0).getText();
		String secondMenu = firstMenuLevel.get(1).getText();
		
		System.out.println(firstMenu + " " + secondMenu);
		
		for (int i = 0; i<firstMenuLevel.size();i++) {
			System.out.println("The menus are: " + firstMenuLevel.get(i).getText());
		}
		
		
		driver.quit(); // cierra la ventana

	}

}
