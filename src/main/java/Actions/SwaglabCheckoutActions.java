package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import objects.Swaglabcheckoutobjects;

public class SwaglabCheckoutActions {
	
	Swaglabcheckoutobjects checkobj;
	
	public SwaglabCheckoutActions(WebDriver driver) {
		checkobj=PageFactory.initElements(driver, Swaglabcheckoutobjects.class);
		
	}
	
	
	public void login(String user,String pass) {
		checkobj.username.sendKeys(user);
		checkobj.password.sendKeys(pass);	
	}
	public void button() {
		checkobj.login.click();
		
	}
	public void Article() {
		checkobj.selectitem.click();
		
		
	}
	public void dispalynameandprice() {
		System.out.println(checkobj.selectitem.getText());
		System.out.println(checkobj.price.getText());
	
	}
	public void basket() {
		checkobj.addcart.click();
		
	}
	public void navigatecart() {
		checkobj.cart.click();
		
	}
	public void checkoutcontinue() {
		checkobj.checkout.click();
	}
	public void customeradress() {
		checkobj.fname.sendKeys("Sake");
		checkobj.lname.sendKeys("Obulapathi");
		checkobj.pincode.sendKeys("560064");
		
	}
	public void continueshoping() {
		checkobj.continuebutton.click();
		
	}
	public void finishbutton() {
		System.out.println(checkobj.finishing.getText());
		
		checkobj.finishing.click();
		
	}
	public void backtohome() {
		checkobj.back.click();
	}
	
	
	

}
