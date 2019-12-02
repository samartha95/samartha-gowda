package x_path_sibling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {
	public static void main(String[] args) {

	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/New%20folder/Training/src/htmlflies/relative.html");
	driver.findElement(By.xpath("//img[contains(@src,'Bullet Standard')]/parent::div/preceding-sibling::div/img")).click();
	}
}
