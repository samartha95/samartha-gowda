import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement s= driver.findElement(By.name("q"));
		s.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		for (WebElement suggetion : sugg) {
			System.out.println(suggetion.getText());
		}
}}
