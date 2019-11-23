 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/instagram/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		driver.navigate().to("https://www.google.com/");
	}

}
