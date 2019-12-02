package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter url
		driver.get("http://www.google.com");
		
		//to get name of page
		System.out.println(driver.getTitle());
		
		//get the title current url
		 String title=driver.getCurrentUrl();
		 System.out.println(title);
		 
		 //get page source
		//driver.getPageSource();
		
		//get current window
		System.out.println(driver.getWindowHandle());
		
		//to close
		driver.close();

	}

}
