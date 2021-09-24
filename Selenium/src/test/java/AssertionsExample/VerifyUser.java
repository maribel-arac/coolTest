package AssertionsExample;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyUser {
	
	
  @Test
  public void validateUserInfo() throws InterruptedException {
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
			//Thread.sleep(2000);
			password.sendKeys("admin123");
			//Thread.sleep(2000);
			loginBtn.click();
			//Thread.sleep(2000);
		
		//click on Directory
			WebElement directoryBtn = driver.findElement(By.id("menu_directory_viewDirectory"));
			directoryBtn.click();
			
		// insert name (Nathan) in the input 
			WebElement inputName = driver.findElement(By.name("searchDirectory[emp_name][empName]"));
			inputName.sendKeys("Nathan");
			inputName.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
		// select job title from dropdown
			Select jobTitleDropdown = new Select(driver.findElement(By.id("searchDirectory_job_title")));
			jobTitleDropdown.selectByValue("13");
			Thread.sleep(2000);
		
		// select location from dropdown
			Select locationDropdown = new Select(driver.findElement(By.id("searchDirectory_location")));
			locationDropdown.selectByValue("1,2,5,-1");
			Thread.sleep(2000);
			
		// click on earch Btn
			WebElement searchBtn = driver.findElement(By.id("searchBtn"));
			searchBtn.click();
			Thread.sleep(2000);
			
		// validate Nathan is Nathan
			String nameSearchResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();
			boolean nameDisplayed = nameSearchResult.contains("Nathan Elliot");
			
			Assert.assertTrue(nameDisplayed);
			
			driver.quit();
		}
  }