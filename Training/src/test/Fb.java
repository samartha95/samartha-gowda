package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	public static void main(String[] args) {
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    // find element
     	WebElement email=driver.findElement(By.id("email"));
	    //to pass values
	    email.sendKeys("suhas");
	    //find element and to pass values
	     driver.findElement(By.id("pass")).sendKeys("suhas123");
}}
