package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(bttn));
		
		Wait<WebDriver>fluent=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)) 
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(bttn));
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
