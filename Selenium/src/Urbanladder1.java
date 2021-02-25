import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(5000);
		WebElement c= driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]"));
		c.click();
		WebElement d=driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]/span"));
		System.out.println(d.getText());
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys(d.getText());
		driver.findElement(By.xpath("//a[contains(., 'Track Order')]"));
		driver.findElement(By.xpath("//li/a[contains(., 'Stores')]"));
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]"));
		for (WebElement name : menu) {
			System.out.println(name.getText());
		}}}