package AssertionsExample;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetExample {
  @Test
  public void TC_VerifyPageTitle () {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String currentTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		Assert.assertEquals(currentTitle, expectedTitle);
		
		driver.quit();
  }
}
