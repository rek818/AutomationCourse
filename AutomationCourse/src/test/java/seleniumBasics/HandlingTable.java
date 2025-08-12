package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{

	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");	
		//to get entire row
		WebElement table=driver.findElement(By.id("dataTable"));
		System.out.println(table.getText());
		
		//to get single row
		WebElement table2=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[7]"));
		System.out.println(table2.getText());
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingTable handlingtable=new HandlingTable();
		handlingtable.initializeBrowser();
		handlingtable.verifyTable();
		

	}

}
