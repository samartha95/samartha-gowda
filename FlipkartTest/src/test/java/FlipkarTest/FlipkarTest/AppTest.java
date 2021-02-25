package FlipkarTest.FlipkarTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AppTest 
{
	public static void main(String[] args) throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.flipkart.android");
		cap.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		cap.setCapability("autoGrantPermissions", "true");
		AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\r\n"
				+ "\"com.flipkart.android:id/custom_back_icon\"]")).click();
		Thread.sleep(10000);
		WebElement search = driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc='Search on flipkart']/android.widget.TextView"));
		System.out.println(search.isEnabled());
		search.click();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Search grocery products']")).sendKeys("iphone12");
		driver.findElement(By.xpath("//android.widget.TextView[@text='iphone 12']")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup)[14]")).click();
		Thread.sleep(5000);
		System.out.print(driver.findElement(By.xpath("//android.widget.TextView")).getText());
		String price = driver.findElement(By.xpath("(//android.widget.TextView)[2]")).getText().substring(1);
		System.out.println("==> Rs"+price);
		TouchAction touch = new TouchAction(driver);
		for(int i=1;i<=8;i++) {
			touch.longPress(PointOption.point(700, 2600)).moveTo(PointOption.point(700,600)).release().perform();
			try {
				driver.findElement(By.xpath("//android.widget.TextView[@text='All Details']")).click();
				break;
			}
			catch (Exception e){
				System.out.println("Swipe "+i);
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='SPECIFICATIONS']")).click();
	}
    
    }
