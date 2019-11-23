import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement s= driver.findElement(By.name("q"));
		s.sendKeys("java");
		WebElement b=driver.findElement(By.name("btnK"));
		Thread.sleep(2000);
		b.click();
		WebElement r=driver.findElement(By.name("q"));
		r.clear();
		r.sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
	}

}
