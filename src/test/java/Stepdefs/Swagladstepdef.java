package Stepdefs;

import Actions.SwaglagActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Swagladstepdef {
	
	SwaglagActions swag=new SwaglagActions(hooks.driver);
	
	
	@Given("user open the url {string}")
	public void user_open_the_url(String string) throws InterruptedException {
		Thread.sleep(3000);
		hooks.driver.get(string);
	    
	}

	@When("user enter the valid username {string}")
	public void user_enter_the_valid_username(String string) {
		swag.loginusername(string);
	   	}

	@When("user enter the valid password {string}")
	public void user_enter_the_valid_password(String string) {
		swag.loginpassword(string);
	   	}

	@When("user click the submit button")
	public void user_click_the_submit_button() {
		swag.Button();
	    	}

	@Then("user able to login sucessfully")
	public void user_able_to_login_sucessfully() {
		System.out.println(hooks.driver.getTitle());
		Assert.assertEquals("Swag Labs",hooks.driver.getTitle());
		
	    	}
	
	@When("user enter the invalid username {string}")
	public void user_enter_the_invalid_username(String string) {
		swag.loginusername(string);
	    	}

	@When("user enter the invalid password {string}")
	public void user_enter_the_invalid_password(String string) {
		swag.loginpassword(string);
	   
	}
	
		
	

	@Then("user see some error msg")
	public void user_see_some_error_msg() {
		System.out.println(swag.errormas());
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",swag.errormas());
		
		
	    	}

}
