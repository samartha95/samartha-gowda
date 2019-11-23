import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class python {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement s= driver.findElement(By.name("q"));		 
		s.sendKeys("python");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'python')]/b[contains(.,'download')]")).click();
		List<WebElement> blocks = driver.findElements(By.xpath("//h3[@class=\"LC20lb\"]/span[@class=\"S3Uucc\"]"));
		for (WebElement b : blocks) {
			System.out.println(b.getText());
		}
}}
