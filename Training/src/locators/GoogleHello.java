package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHello {
	public static void main(String[] args) {
        //launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter url
		driver.get("http://www.google.com");
		
		//search hello
		driver.findElement(By.name("q")).sendKeys("hello",Keys.ENTER);
}}
