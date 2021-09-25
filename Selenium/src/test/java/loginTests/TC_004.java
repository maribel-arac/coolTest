package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;
import wrapper.CommonMethods;

public class TC_004 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//login page object
	LoginPage login = new LoginPage(driver);
	DashboardPage dashBoard = new DashboardPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_004_Search() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		
		dashBoard.clickMenuDirectory();
		
		directory.searchByName("Nathan");
		
		directory.selectJobTitle("Sales Representative");
		
		directory.selectLocation("  United States");
		
		directory.clickSearchBtn();
		
		boolean userIsPresent = directory.verifySearchNameResult("Nathan");
		
		Assert.assertTrue(userIsPresent);
		
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshoot(driver, "TC_004_Search");
		driver.close();
	}

}
