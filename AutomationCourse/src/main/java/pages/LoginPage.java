package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		//encapsulation
		@FindBy(id="user-name") private WebElement userNameField;
		@FindBy(id="password") private WebElement passwordField;
		@FindBy(id="login-button") private WebElement loginButton;
		
		public void enterUserNameOnUserNameField(String userName)
		{
			
			userNameField.sendKeys(userName);
		}
		 
		public void enterPasswordOnPasswordField(String password)
		{
			passwordField.sendKeys(password);
		}
		
		public void clickOnLoginButton()
		{
			loginButton.click();
		}
		
		
		
		
	}
	


