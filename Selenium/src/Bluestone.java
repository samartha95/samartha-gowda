import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		List<WebElement> c = driver.findElements(By.xpath("//ul[@class=\"wh-main-menu\"]/li"));
		Actions a=new Actions(driver);
		for (WebElement s : c) {
			a.moveToElement(s).perform();
			Thread.sleep(1000);
		}
	}

}
