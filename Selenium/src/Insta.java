

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Insta {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			WebElement log=driver.findElement(By.className("izU2O"));
			log.click();

}
	}
