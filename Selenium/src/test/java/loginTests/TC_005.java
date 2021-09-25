package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;
import wrapper.CommonMethods;

public class TC_005 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//login page object
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_005_ReadJson() {
		String user = CommonMethods.getJSONValue("TC_005", "username");
		String password = CommonMethods.getJSONValue("TC_005", "password");
		login.login(user,password);
		
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshoot(driver, " TC_005_ReadJson");
		driver.close();
	}

}
