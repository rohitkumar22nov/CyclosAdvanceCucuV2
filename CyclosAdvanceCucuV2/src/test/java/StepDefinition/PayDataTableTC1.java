package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Base.Base;


import BusinessLogics.PayLogic;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayDataTableTC1 {
	
	public WebDriver driver;
	
	@Given("^Required website is launches also the business user is able to loggin with the authorized credentials$")
	public void required_website_is_launches_also_the_business_user_is_able_to_loggin_with_the_authorized_credentials() 
	
	{
	
		Base base = new Base();
		base.baseSetupAndLogin();
		
		
	}

	@When("^Below are the payment details like payee and amount$")
	public void below_are_the_payment_details_like_payee_and_amount(DataTable dt)
	{
	   	PayLogic Logic = new PayLogic();
		Logic.LogicPayUser(dt);
		
	}

	@Then("^System is able to make the payments to desired user with specified amount$")
	public void system_is_able_to_make_the_payments_to_desired_user_with_specified_amount()
	{
	
		System.out.println("Then function/method is kept blank as the validation got performed in When function/method itself");
		
		
		Base base =new Base();
		base.tearDown();
		
	}


	

}
