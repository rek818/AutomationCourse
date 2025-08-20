package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorSample extends Base {

	public void verifyExecutor() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		// create reference for javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// executeScript is the method arguments[0]-predifned
		js.executeScript("arguments[0].click();", showMessageButton);
		// scrollby -to scroll inside the window vertically or horizontally
		// js.executeScript("window.scrollBy(0,350)", "");
		// scrollto
		js.executeScript("window.scrollTo(0,350)", "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecutorSample sample = new JavaScriptExecutorSample();
		sample.initializeBrowser();
		sample.verifyExecutor();

	}

}
