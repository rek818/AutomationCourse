package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement simplealert=driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmBttn=driver.findElement(By.id("confirmButton"));
		confirmBttn.click();
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingAlert al=new HandlingAlert();
		al.initializeBrowser();
	//	al.verifySimpleAlert();
		al.verifyConfirmAlert();
	}

}
