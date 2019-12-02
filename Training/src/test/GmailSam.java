package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSam {
	public static void main(String[] args) throws InterruptedException {
        //launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter url
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		
		//find username element
		driver.findElement(By.id("identifierId")).sendKeys("samarthasam834@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("9482139548",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"gb_Aa gbii\"]")).click();
		driver.findElement(By.id("gb_71")).click();
}}
