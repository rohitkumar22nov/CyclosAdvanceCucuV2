package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Base.Base;

import BusinessLogics.PayLogic;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayCSVDataTC3 
{

	public WebDriver driver;
	
	
	@Given("^Launching the Cyclos website after that using the account id with passowrd to gain access to proceed further$")
	public void launching_the_Cyclos_website_after_that_using_the_account_id_with_passowrd_to_gain_access_to_proceed_further()
	{

		Base base = new Base();
		base.baseSetupAndLogin();
		
	}

	@When("^Data is being fetched from \"([^\"]*)\"$")
	public void data_is_being_fetched_from(String path) throws IOException
	{
	
		PayLogic pay = new PayLogic();
		
		pay.csvDataReading(path);
		
	}

	@Then("^Payment is being made by the system$")
	public void payment_is_being_made_by_the_system()
	{
		
		System.out.println("This @Then method is kept blank as the validate completed in @When method itself");

		Base base =new Base();
		base.tearDown();

		
		
	}

	

}
