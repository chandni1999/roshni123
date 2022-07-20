package Pages;

import org.openqa.selenium.By;

import Browser.Browser;

public class Login_ProdBackLog extends Browser
{
	public static void OpenUrl(String a)
	{
		try
		{
			Browser.openBrowser();
			Browser.openUrl(a);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void UserId(String userid)
	{
		try
		{
			Login.EnterTheUsername(userid);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void PassId(String passid)
	{
		try
		{
		Login.EnterThePassword(passid);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void LogInBtn()
	{
		try
		{
			Login.ClickTheLoginButton();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void NextPg() throws InterruptedException
	{
		try
		{
			Login.NavigateTheProduct();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Suser(String uid)
	{
		try
		{
			Login.EnterTheUsername(uid);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Spass(String pass)
	{
		try
		{
			Login.EnterThePassword(pass);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Login_Button()
	{
		try
		{
			Login.ClickTheLoginButton();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String ProdDetails() throws InterruptedException
	{
		String text = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
		System.out.println(text);
		return text;
	}
	
}



