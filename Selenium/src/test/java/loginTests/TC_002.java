package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_002 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//login page object
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_002_IncorrectLogin() {
		boolean errorMsg = login.incorrectLogin("super", "testing1234");
		Assert.assertTrue(errorMsg);
		
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}
