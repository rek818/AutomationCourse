package testScript;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;

public class LoginTest extends TestNGBase {
	
	
	
	@Test
	public void verifyUserLoginWithValidCredential()
	{
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");
		
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
		
		
		
		
	}
	@Test
	
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() 
	{
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");
		
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret");
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
		
		
				
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() 
	{
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("123_user");
		
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
		
		
				
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInValidPassword() 
	{
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("123_user");
		
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret");
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
		
		
	}
	

}
