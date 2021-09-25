package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;
import wrapper.CommonMethods;

public class TC_006 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//login page object
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_006_ReadExcelFiles() {
		String user = CommonMethods.getCellData("TC_006", 1, 0);
		String password = CommonMethods.getCellData("TC_006", 1, 1);
		login.login(user, password);
		
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshoot(driver, "TC_006_ReadExcelFiles");
		driver.close();
	}

}
