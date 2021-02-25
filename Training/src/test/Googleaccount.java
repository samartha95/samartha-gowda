package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleaccount {
	public static void main(String[] args) throws InterruptedException {
        //launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter url
		driver.get("http://www.gmail.com");
		
		//find username element
		driver.findElement(By.id("identifierId")).sendKeys("suhasbond@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("bond007",Keys.ENTER);
}}
