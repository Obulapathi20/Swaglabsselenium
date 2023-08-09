package Stepdefs;

import org.junit.Assert;

import Actions.techlistAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class techliststepdef  {
	
	techlistAction ta=new techlistAction();
	
	
	@Given("user open the url")
	public void user_open_the_url() {
		techlistAction.driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
	   
	}

	@When("user get the data from tabel as rows")
	public void user_get_the_data_from_tabel() {
		ta.tabeldata();
	    
	}
	
	@When("user get the column data")
	public void user_get_the_column_data() {
		ta.tabeldata();
	   
	}


	@Then("user get the outcomes")
	public void user_get_the_outcomes() {
		
		//Assert.assertEquals(Amazon, s);
		
	    
	}

}
