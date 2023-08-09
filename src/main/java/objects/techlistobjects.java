package objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class techlistobjects {
	
	public @FindBy(xpath="//tbody[@style='box-sizing:inherit']/tr")
	List<WebElement>  tablerow;
	public @FindBy(xpath="//tbody[@style='box-sizing:inherit']/tr/th")
	List<WebElement> tablecol;
	
}
