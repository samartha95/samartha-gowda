package x_path_contains;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_contains {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//input[contains(@type,'email') and @name='email']")).sendKeys("jsn");
}}
