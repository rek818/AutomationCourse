package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	public void handlingDropDown()
	{
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		
		Select select=new Select(dropdown);
		//selectByIndex()
		//select.selectByIndex(3);
		
		//selectByValue
		//select.selectByValue("c#");
		
		//selectByVisibleText
		select.selectByVisibleText("Python");
		
		
	}
	public void handlingCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement checkBox=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkBox.click();
		WebElement checkBox2=driver.findElement(By.xpath("//input[@value='option-2']"));
//		checkBox2.click();
		System.out.println(checkBox.isSelected());
		System.out.println(checkBox2.isSelected());
		
		
		
	}
	public void handlingRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement rButton=driver.findElement(By.xpath("//input[@value='yellow']"));
		rButton.click();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingDropdown drop=new HandlingDropdown();
		drop.initializeBrowser();
		drop.handlingDropDown();
		drop.handlingCheckBox();
		drop.handlingRadioButton();
		
		
 
	}

}
