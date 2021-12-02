package Practice.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class FlipkartLogin {

	private WebElement username;
	private WebElement password;
	private WebElement Loginbutton;
	WebDriver driver;
	
	public FlipkartLogin(WebDriver driver) {
	this.driver =driver;

	username =driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	password =driver.findElement(By.xpath("//input[@type='password']"));
	Loginbutton =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	}

	
	public void usernameMethod() {
		username.sendKeys("8999264192");		
	}
	
	public void passwordMethod() {
		password.sendKeys("Saurabh@12345");
	}
	
	public void LoginbuttonMethod() {
		Loginbutton.click();
	}
}
