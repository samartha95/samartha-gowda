package x_path_ralative;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realative {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/New%20folder/Training/src/htmlflies/absolute.html");
		driver.findElement(By.xpath("//input[@placeholder='enter address']")).sendKeys("kanakapura");
		driver.findElement(By.xpath("//input[@placeholder='enter username']")).sendKeys("sam");
		driver.findElement(By.xpath("//input[@value='login']")).click();
	}

}
