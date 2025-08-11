package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {

	public void handlingelements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//sendKeys()
		WebElement msgBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgBox.sendKeys("Rekha");
		
		//click()

		WebElement bttn=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(bttn.isEnabled());
		
		bttn.click();
		System.out.println(bttn.isDisplayed());
		
		WebElement txt=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(txt.getText());
		
		//clear()
		msgBox.clear();
		
		//getcssvalue
		System.out.println(bttn.getCssValue("background-color"));
		
		//getTagName
		WebElement tag=driver.findElement(By.id("value-a"));
		System.out.println(tag.getTagName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webElement=new WebElementCommands();
		webElement.initializeBrowser();
		webElement.handlingelements();

		
	}

}
