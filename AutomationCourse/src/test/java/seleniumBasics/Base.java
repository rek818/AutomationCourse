package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	
	public WebDriver driver;//created reference for webdriver 

	public void initializeBrowser()
	{ 
		
			
		
//			driver=new FirefoxDriver();
			driver=new ChromeDriver();//open browser
//		driver=new EdgeDriver();
//			driver.get("https://selenium.qabible.in/");//open url
			driver.get("https://selenium.qabible.in/");
			
			driver.manage().window().maximize();
	}
	
	public void closeandquit()//close all the browsers
	{
		//driver.close();//# Close the last opened tab
		//driver.quit();//close more than one browsers
		
	}
	public static void main(String[] args) 
	{
		Base base=new Base();
		base.initializeBrowser();
		base.closeandquit();
		
	}

}
