package testScript;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.Test;

import automationCore.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase {
	
	
	
	@Test
	public void verifyUserLoginWithValidCredential() throws IOException
	{
		String userName=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.enterUserNameOnUserNameField(userName);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnLoginButton();
		//WebElement userNameField=driver.findElement(By.id("user-name"));
		//userNameField.sendKeys("standard_user");
		
		//WebElement passwordField=driver.findElement(By.id("password"));
		//passwordField.sendKeys("secret_sauce");
		
//		WebElement loginButton=driver.findElement(By.id("login-button"));
//		loginButton.click();
		
		
		
		
	}
	@Test
	
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException 
	{
		String userName=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.enterUserNameOnUserNameField(userName);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnLoginButton();
		
		
//		WebElement userNameField=driver.findElement(By.id("user-name"));
//		userNameField.sendKeys("standard_user");
//		
//		WebElement passwordField=driver.findElement(By.id("password"));
//		passwordField.sendKeys("secret");
//		
//		WebElement loginButton=driver.findElement(By.id("login-button"));
//		loginButton.click();
		
		
				
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException 
	{
		
		String userName=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getStringData(3, 1, "LoginPage");
		
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.enterUserNameOnUserNameField(userName);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnLoginButton();
//		WebElement userNameField=driver.findElement(By.id("user-name"));
//		userNameField.sendKeys("123_user");
//		
//		WebElement passwordField=driver.findElement(By.id("password"));
//		passwordField.sendKeys("secret_sauce");
//		
//		WebElement loginButton=driver.findElement(By.id("login-button"));
//		loginButton.click();
		
		
				
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInValidPassword() throws IOException 
	{
		String userName=ExcelUtility.getStringData(4, 0, "LoginPage");
		String password=ExcelUtility.getStringData(4, 1, "LoginPage");
		
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.enterUserNameOnUserNameField(userName);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnLoginButton();
//		WebElement userNameField=driver.findElement(By.id("user-name"));
//		userNameField.sendKeys("123_user");
//		
//		WebElement passwordField=driver.findElement(By.id("password"));
//		passwordField.sendKeys("secret");
//		
//		WebElement loginButton=driver.findElement(By.id("login-button"));
//		loginButton.click();
		
		
	}
	
	

}
