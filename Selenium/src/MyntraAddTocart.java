import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAddTocart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("suhas shirts",Keys.ENTER);
		WebElement shirt = driver.findElement(By.xpath("//img[@src=\"https://assets.myntassets.com/dpr_2,q_40,w_210,c_limit,fl_progressive/assets/images/1364628/2016/8/31/11472636737718-Roadster-Men-Blue-Regular-Fit-Printed-Casual-Shirt-6121472636737160-1.jpg\"]"));
		Thread.sleep(2000);
		shirt.click();
		
}
}