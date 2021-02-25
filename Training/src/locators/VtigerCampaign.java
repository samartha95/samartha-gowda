package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerCampaign {
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
		Actions a=new Actions(driver);
		WebElement More = driver.findElement(By.linkText("More"));
		a.moveToElement(More).perform();
		driver.findElement(By.name("Campaigns")).click();
	
}}
