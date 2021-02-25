import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ULliving {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(3000);
		WebElement c= driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]"));
		Thread.sleep(2000);
		c.click();
		List<WebElement> e = driver.findElements(By.xpath("//div/ul[@class=\"topnav bodytext\"]/li"));
		Actions a=new Actions(driver);
		for(WebElement d:e) {
			a.moveToElement(d).perform();
			Thread.sleep(1000);
		}
}}
