package Stepdefs;

import Actions.PocseleniumAction;
//import Hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pocselenium {
	
	PocseleniumAction poc=new PocseleniumAction(hooks.driver);
	
	@Given("user open the Url {string}")
	public void user_open_the_url(String s) {
		hooks.driver.get(s);
		
		
	 }

	@Given("user clikc the link under the sample text")
	public void user_clikc_the_link_under_the_sample_text() {
		poc.link();
	   
	}

	@Given("user enter the some text in textbox")
	public void user_enter_the_some_text_in_textbox(){
		poc.button();
		
	   
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		poc.sumbitbutton();

	}

	@When("user double-click on alert button")
	public void user_double_click_on_alert_button() {
		poc.doubliclick();
	    
	}

	@When("the alert is open click ok on it")
	public void the_alert_is_open_click_ok_on_it() {
		hooks.driver.switchTo().alert().accept();

		
	   
	}

	@When("user click  any one radio button")
	public void user_click_any_one_radio_button() {
		poc.radiobutton();
	   
	}

	@When("user click on any one of checkboxs")
	public void user_click_on_any_one_of_checkboxs() {
		poc.checkbox();
	   
	}

	@When("user go to the dropdown")
	public void user_go_to_the_dropdown() {
		System.out.println("user enter the dropdown option");
	   
	}

	@When("user select any one option on dropdown")
	public void user_select_any_one_option_on_dropdown() {
		poc.dropdown();
	   
	}

	@When("user click on generate alert box alert will open click on ok")
	public void user_click_on_generate_alert_box_alert_will_open_click_on_ok() {
		poc.alert();
	    
	}

	@When("user click on generateconfirm button on the page")
	public void user_click_on_generateconfirm_button_on_the_page() {
		poc.confirmbutton();
	   
	}

	@Then("user validate the result")
	public void user_validate_the_result() {
		System.out.println("you clicked Cancel");
	   
	}

	@When("user go to draganddrop perfrom the action")
	public void user_go_to_draganddrop_perfrom_the_action() {
		poc.draganddrop();
	   
	}

	@Then("user validate the outcomes")
	public void user_validate_the_outcomes() {
		System.out.println("task completed");
	    
	}


}
