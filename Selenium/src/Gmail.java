import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("suhas123@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("12347474",Keys.ENTER);
		

}
}