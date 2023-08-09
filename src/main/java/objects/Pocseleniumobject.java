package objects;

//import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pocseleniumobject {
	
	public @FindBy(xpath="//a[@href='http://www.artoftesting.com/sampleSiteForSelenium.html']")
	WebElement  link;
	public @FindBy(id="fname")
	WebElement text;
	public @FindBy(id="idOfButton")
	WebElement button;
	public @FindBy(id="dblClkBtn")
	WebElement doubleclik;
	public @FindBy(id="male")
	WebElement male;
	public @FindBy(xpath="//input[@class='Automation']")
	WebElement testing;
	public @FindBy(xpath="//select[@id='testingDropdown']/option[2]")
	WebElement dropdown;
	public @FindBy(xpath="//button[@onclick='generateAlertBox()']")
	WebElement alert;
	public @FindBy(xpath="//button[@onclick='generateConfirmBox()']")
	WebElement confirm;
	public @FindBy(xpath="//img[@decoding='async']")
	WebElement dragtext;
	

}
