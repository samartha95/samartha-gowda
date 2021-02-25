import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(2000);
		WebElement c= driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]"));
		Thread.sleep(2000);
		c.click();	
		List<WebElement> bedroom = driver.findElements(By.xpath("//span[contains(.,'Bedroom')]/parent::li/descendant::ul[@class=\"taxonslist\"]"));
		
		}
}