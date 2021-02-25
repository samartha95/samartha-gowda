import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("suhas");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("suhas123",Keys.ENTER);
		//WebElement log=driver.findElement(By.id("loginbutton"));
		//log.click();

	}

}
