package x_path_parent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent{
		public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\New folder\\Training\\src\\htmlflies\\parent.html");
		driver.findElement(By.xpath("//div[1]/input[@type=\"text\"]")).clear();
		
}}
