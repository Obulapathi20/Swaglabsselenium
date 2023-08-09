package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Swaglabobjects {
	
	public @FindBy(id="user-name")
	WebElement username;
	public @FindBy(id="password")
	WebElement password;
	
	public @FindBy(id="login-button")
	WebElement loginbutton;
	
	public @FindBy(xpath="//*[@data-test='error']")
	WebElement errormsg;

}
