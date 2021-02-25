package x_path_contains;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[contains(@type,'text') and @name='q']")).sendKeys("1 plus 7",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title=\"OnePlus 7T (Glacier Blue, 256 GB)\"]")).click();
	}

}
