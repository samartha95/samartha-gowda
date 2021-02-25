import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaImage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Images')]")).click();
		driver.findElement(By.xpath("//img[@id=\"rT8rqQKh8jt3DM:\"]")).click();
		
}}
