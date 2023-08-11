package Stepdefs;

import Actions.SwaglabCheckoutActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import Actions.SwaglabCheckoutActions;

public class Swaglabcheckout {
	
	SwaglabCheckoutActions swagAction=new SwaglabCheckoutActions(hooks.driver);
	
	@Given("user open the application {string}")
	public void user_open_the_application(String s) {
		hooks.driver.get(s);
		
	    	}

	@When("user enter username and password as {string} and {string}")
	public void user_enter_username_and_password_as_and(String string1, String string2) {
		swagAction.login(string1,string2);
		
	    	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		swagAction.button();
		
	    
	}

	@Then("user select the item in the available items")
	public void user_select_the_item_in_the_available_items() {
		swagAction.Article();
	   	}

	@Then("user get namd and price of selected item")
	public void user_get_namd_and_price_of_selected_item() {
		swagAction.dispalynameandprice();
	    	}

	@Then("user click on add to cart btn")
	public void user_click_on_add_to_cart_btn() {
		swagAction.basket();
		
	   	}

	@Then("user navigate to cart")
	public void user_navigate_to_cart() {
		swagAction.navigatecart();
	    	}

	@Then("user continue to checkout the item")
	public void user_continue_to_checkout_the_item() {
		swagAction.checkoutcontinue();
	    	}

	@Then("user fill the details for delivery")
	public void user_fill_the_details_for_delivery() {
		swagAction.customeradress();
		swagAction.continueshoping();

	    	}

	@Then("user verfiy the confirmation message")
	public void user_verfiy_the_confirmation_message()  {
		//Thread.sleep(3000);
		//System.out.println();
		swagAction.finishbutton();
		
		
	    	}

	@Then("user click on back to home button")
	public void user_click_on_back_to_home_button() {
		swagAction.backtohome();
	    	}


}
