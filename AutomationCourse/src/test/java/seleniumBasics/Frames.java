package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base {

	public void verifyingFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		
		//size()  // to get the count of all the frames in the DOM
		List<WebElement>totalFrame=driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrame.size());
		
		//switchTo().frame(requiredframe) //to bring control to the given frame
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		
		WebElement frameheading=driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		
		// back to previous control
		driver.switchTo().defaultContent();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames frames=new Frames();
		frames.initializeBrowser();
		frames.verifyingFrames();

	}

}
