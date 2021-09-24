package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleSelenium {

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
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
		//metodos para get title and URL 
		String title = driver.getTitle();
		System.out.println("The title is: " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current URL is: " + currentUrl);
		
		
		//metodos de navegacion
		// driver.navigate().back();
		// Thread.sleep(2000);
		// driver.navigate().forward();
		// Thread.sleep(2000);
		// driver.navigate().refresh();
		
		//click en Assign leave
		WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
		assignLeaveBtn.click();
		
		//send text to Employee name input
		WebElement employeeNameInput = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
		Thread.sleep(2000);
		employeeNameInput.sendKeys("Maribel Araiza");
		Thread.sleep(2000);
		employeeNameInput.clear(); //borra texto
		
		//verifies webElement displayed in the screen
		boolean assingBtn = driver.findElement(By.id("assignBtn")).isDisplayed();
		if(assingBtn) {
			System.out.println("The button Assign is displayed");
		}
		
		//get text
		String welcomeMsg = driver.findElement(By.id("welcome")).getText();
		System.out.println("The message is: " + welcomeMsg);
		
		boolean msg = welcomeMsg.contains("Paul");
		if(msg) {
			System.out.println("The message contains Paul's name");
			
		} else {
			System.out.println("Paul's name is not there");
		}
		
		//Dropdown example
		Select leaveTypeDropdown = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		leaveTypeDropdown.selectByVisibleText("CAN - Vacation");
		Thread.sleep(2000);
		leaveTypeDropdown.selectByValue("8");
		Thread.sleep(2000);
		
		 driver.quit(); // cierra broswer

	}

}
