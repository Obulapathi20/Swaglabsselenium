package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Swaglabcheckoutobjects {
	
	public @FindBy(id="user-name")
	WebElement username;
	public @FindBy(id="password")
	WebElement password;
	public @FindBy(id="login-button")
	WebElement login;
	public @FindBy(xpath="//div[@class='inventory_list']/div[4]")
	WebElement selectitem;
	public @FindBy(xpath="(//div[@class='inventory_item_price'])[4]")
	WebElement price;
	public @FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	WebElement addcart;
	public @FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	public @FindBy(id="checkout")
	WebElement checkout;
	public @FindBy(id="first-name")
	WebElement fname;
	public @FindBy(id="last-name")
	WebElement lname;
	public @FindBy(id="postal-code")
	WebElement pincode;
	public @FindBy(id="continue")
	WebElement continuebutton;
	public @FindBy(xpath="//button[@name='finish']")
	WebElement finishing;
	public @FindBy(id="back-to-products")
	WebElement back;


	
	

	

}
