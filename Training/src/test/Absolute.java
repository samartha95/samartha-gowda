package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("file:///C:/New%20folder/Training/src/htmlflies/absolute.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("sam");
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("sam");
		Thread.sleep(3000);
		driver.close();
	}

}
