package x_path_contains;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_pathGmail {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//input[contains(@class,\"whsOnd zHQkBf\") and @type='email']")).sendKeys("suhasbond@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,\"whsOnd zHQkBf\") and @type='password']")).sendKeys("suahsbond",Keys.ENTER);

}}
