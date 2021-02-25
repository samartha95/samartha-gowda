package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerOrganization {
	public static void main(String[] args) {
        //launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter url
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//a/img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		driver.findElement(By.name("accountname")).sendKeys("samartha");
		driver.findElement(By.name("button")).click();
}}
