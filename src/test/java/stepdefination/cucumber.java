package stepdefination;

import org.testng.Assert;

import Browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber {
	@Given("open the browser")
	public void open_the_browser() {
		try
		{
			Browser. openBrowser();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	   
	}

	@When("Enter the {string}")
	public void enter_the(String string) {
		try
		{
			Browser.openUrl(string);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	    
	}

	@Then("Page is displayed")
	public void page_is_displayed() {
		try
		{
			String actualtitle=Browser.getTitle();
			Assert.assertEquals("Google", actualtitle);
		}
		catch(AssertionError e)
		{
			System.out.println(e);
		}
	    
	}

}
