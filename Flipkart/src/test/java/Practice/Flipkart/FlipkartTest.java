package Practice.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver92\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	
	FlipkartLogin Login =new FlipkartLogin(driver);
	
	Login.usernameMethod();
	Login.passwordMethod();
	Login.LoginbuttonMethod();
	
}
}
