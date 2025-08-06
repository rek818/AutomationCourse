package seleniumBasics;

public class BrowserCommands extends Base{
	
	public void handlingBrowserCommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String handleId=driver.getWindowHandle();//to get current window handle id(single window)
		System.out.println(handleId);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
	}
	
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");//to navigate to diff website
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands browser=new BrowserCommands();
browser.initializeBrowser();
//browser.handlingBrowserCommands();
browser.navigationCommands();
	}

}
