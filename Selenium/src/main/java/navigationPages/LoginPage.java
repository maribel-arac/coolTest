package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Login PageObjects/ WebElements
	@FindBy(id = "txtUsername")
	private WebElement userNameTxt;
	@FindBy (id = "txtPassword")
	private WebElement passwordTxt;
	@FindBy (id = "btnLogin")
	private WebElement btnLogin;
	@FindBy (id = "spanMessage")
	private WebElement spanMessage;
	
	public void login (String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean incorrectLogin (String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		
		boolean errorMsg = spanMessage.getText().contains("Invalid credentials");
		
		return errorMsg;
	}

}
