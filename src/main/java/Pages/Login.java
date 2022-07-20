package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Browser.Browser;

public class Login extends Browser 
{
	public static void EnterTheUsername(String user)
	{
		driver.findElement(By.id("user-name")).sendKeys(user);
	}
	public static void EnterThePassword(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	public static void ClickTheLoginButton()
	{
		driver.findElement(By.id("login-button")).click();
	}
	public static void NavigateTheProduct() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0.350)", "");
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)","");
		Thread.sleep(1000);
	}
}
