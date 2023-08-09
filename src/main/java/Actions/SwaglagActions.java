package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import objects.Swaglabobjects;



public class SwaglagActions {
	Swaglabobjects swagobj;
	
	public SwaglagActions(WebDriver driver) {
		swagobj=PageFactory.initElements(driver,Swaglabobjects.class);
	
	}
	
	public void loginusername(String s) {
		swagobj.username.sendKeys(s);
			
	}
	public void loginpassword(String pass) {
		swagobj.password.sendKeys(pass);
		
	}
	public void Button() {
		swagobj.loginbutton.click();
		
	}
	public String errormas() {
		String msg=swagobj.errormsg.getText();
		return msg;
	}
	
	
	

}
