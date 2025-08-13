package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base
{
	//mouse actions
	
	
	public void verifyRightClick()
	{
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		
		//create object for Action class
		Actions action=new Actions(driver);
		action.contextClick(home).build().perform();
		
	}
	
	public void mouseHover()
	{
		WebElement others=driver.findElement(By.id("others"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(others).build().perform();
	}
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		
		//element to be dragged
		WebElement drag=driver.findElement(By.id("draggable"));
		//element insdie which it has to be dropped
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	//keyboard actions
	public void verifyKeyBoardAction() throws AWTException
	{
		Robot robot=new Robot();	
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions=new HandlingActions();
		actions.initializeBrowser();
	//	actions.verifyRightClick();
		//actions.mouseHover();
	//	actions.verifyDragAndDrop();
		
		try {
			actions.verifyKeyBoardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
