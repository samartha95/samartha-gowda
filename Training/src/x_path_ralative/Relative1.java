package x_path_ralative;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/New%20folder/Training/src/htmlflies/absolute.html");
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='enter username']")).sendKeys("jka");
		driver.findElement(By.xpath("//input[@type='password' and @placeholder='enter password']")).sendKeys("jahkj");
		driver.findElement(By.xpath("//input[@type='radio' and @id='2']")).click();
}}
