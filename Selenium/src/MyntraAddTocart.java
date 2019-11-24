import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAddTocart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("Fossil",Keys.ENTER);
		WebElement shirt = driver.findElement(By.xpath("//img[@src=\"https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/9037489/2019/3/28/57d5f4d8-ac3c-4783-93d5-3f7110d5505b1553774914260-Fossil-Men-Watches-9661553774913372-1.jpg\"]"));
		Thread.sleep(2000);
		shirt.click();
		Set<String> tab = driver.getWindowHandles();
		for (String tabs : tab) {
		 driver.switchTo().window(tabs);
		}
}
}