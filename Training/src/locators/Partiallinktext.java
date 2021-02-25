package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {
	public static void main(String[] args) {
		         //launch browser
				ChromeDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//enter url
				driver.get("http://www.google.com");
				
				//find bolo app link
				driver.findElement(By.partialLinkText("Bolo")).click();
	}
}
