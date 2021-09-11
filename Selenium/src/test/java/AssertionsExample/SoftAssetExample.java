package AssertionsExample;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssetExample {
	SoftAssert softA = new SoftAssert();
	
  @Test
  public void softAssertExampleSelenium() {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String currentTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		String wrongTitle = "OraneHRM";
		
		softA.assertEquals(currentTitle, expectedTitle);
		softA.assertEquals(currentTitle, wrongTitle);
		softA.assertAll();
		
		driver.quit();
  }
}
