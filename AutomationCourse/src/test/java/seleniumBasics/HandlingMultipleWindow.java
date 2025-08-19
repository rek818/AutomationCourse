package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base {
	
	public void verifyMulipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowHandle=driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
				
		Set<String> handleIds=driver.getWindowHandles();
		System.out.println(handleIds);
		
		Iterator<String> it=handleIds.iterator();
		while(it.hasNext())
		{
			String currentId=it.next();
			if(!currentId.equals(firstWindowHandle))
			{
				driver.switchTo().window(currentId);
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("rekha@ims.com");
				WebElement submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingMultipleWindow window=new HandlingMultipleWindow();
		window.initializeBrowser();
		window.verifyMulipleWindow();

	}

}
