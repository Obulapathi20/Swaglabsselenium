package Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import Actions.PocseleniumAction;
//import Actions.pocswaglabAction;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	public static WebDriver driver;

	
	  @Before
		public void setup() {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
			  	
		}
		  @After
		  public void endup() {
			 driver.close();
			  
		  }

}
