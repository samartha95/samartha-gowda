import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		/*String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());*/
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		Set<String> wins=driver.getWindowHandles();
		Thread.sleep(2000);
		wins.remove(parent);
		for(String s:wins) {
			driver.switchTo().window(s).close();
		}
		Thread.sleep(1000);
	}
}
