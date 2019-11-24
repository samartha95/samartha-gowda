import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlustoneKadas {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Actions a=new Actions(driver);
		WebElement aj=driver.findElement(By.xpath("//li/a[@title=\"Jewellery\"]"));
		a.moveToElement(aj).perform();
		driver.findElement(By.xpath("//div[@class=\"wh-submenu new-column\"]/ul/li/div/ul/li[6]/a[@title=\"Kadas\"]")).click();

}}
