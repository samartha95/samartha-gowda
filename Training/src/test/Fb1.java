package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb1 {
	public static void main(String[] args) {
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    // finding element first name and passing values
     	driver.findElement(By.id("u_0_m")).sendKeys("samartha");
        // finding element last name and passing values
     	driver.findElement(By.name("lastname")).sendKeys("gowda");
        // finding element email and ph no. and passing values
     	driver.findElement(By.id("u_0_r")).sendKeys("9901920012");
        // finding element password and passing values
     	driver.findElement(By.id("u_0_w")).sendKeys("samartha");
}
}