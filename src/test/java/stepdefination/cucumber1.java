package stepdefination;

import Browser.Browser;
import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber1 {
	@Given("User on the webpage {string}")
	public void user_on_the_webpage(String string) {
	  try
	  {
		  Browser.openBrowser();
		  Browser.openUrl(string);
	  }
	  catch(Exception e)
	  {
		  System.out.println("error message");
	  }
	}

	@And("User passes the {string}")
	public void user_passes_the(String string) {
		try
		{
			Login.EnterTheUsername(string);
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	   
	}

	@And("User enters the {string}")
	public void user_enters_the(String string) {
		try
		{
			Login.EnterThePassword(string);
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	   
	}

	@When("Click on the loginButton")
	public void click_on_the_login_button() {
		try
		{
			Login.ClickTheLoginButton();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	   
	}

	@Then("User is navigate to product baclog page.")
	public void user_is_navigate_to_product_baclog_page() {
		try
		{
			Login. NavigateTheProduct();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	    
	}
}




