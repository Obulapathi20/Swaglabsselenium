package Stepdefs;

import java.util.concurrent.TimeUnit;

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
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
			  	
		}
		  @After
		  public void endup() {
			 //driver.close();
			  driver.quit();
			  
		  }

}
