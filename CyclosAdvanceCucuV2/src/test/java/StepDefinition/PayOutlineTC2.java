package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Base.Base;
import com.ObjectRepository.PayUserOR;

import BusinessLogics.PayLogic;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayOutlineTC2 {

	public WebDriver driver;
	
	@Given("^Website launched after that business user is able to loggin with the authorized credentials$")
	public void website_launched_after_that_business_user_is_able_to_loggin_with_the_authorized_credentials()
	{
	
		Base base = new Base();
		base.baseSetupAndLogin();
		
		
			
		
	}


	@When("^Data details are User \"([^\"]*)\"  Amount \"([^\"]*)\" system is able to make the payment\\.$")
	public void data_details_are_User_quick_search_Amount_system_is_able_to_make_the_payment(String User, String Amount)
	{
	
		PayLogic Logic = new PayLogic();

		Logic.logicOutline(User, Amount);
	}



	


	@Then("^System is able to make the required payment to the users$")
	public void system_is_able_to_make_the_required_payment_to_the_users()
	{
	
		System.out.println("This @Then method is kept blank as the validate completed in @When method itself");

		Base base =new Base();
		base.tearDown();
		
	}


	
}
