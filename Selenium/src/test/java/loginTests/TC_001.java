package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;
import wrapper.CommonMethods;

public class TC_001 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//login page object
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_01_CorrectLogin() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshoot(driver, "TC_01_CorrectLogin");
		driver.close();
	}

}
