import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(1000);
	WebElement g=driver.findElement(By.className("google-auth"));
	g.click();
	
}
}