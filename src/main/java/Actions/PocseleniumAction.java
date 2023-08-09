package Actions;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

import objects.Pocseleniumobject;

public class PocseleniumAction  {
	
	Pocseleniumobject pocobj;
	Actions act;
	
	public  PocseleniumAction(WebDriver driver) {
	
		 pocobj=PageFactory.initElements(driver,Pocseleniumobject.class);
			 act = new Actions(driver);

	
	}
	public void link() {
		pocobj.link.click();	
	}
	public void button() {
		pocobj.text.sendKeys("Obulapathi");
		
		//pocobj.button.click();	
	}
	public void sumbitbutton() {
		pocobj.button.click();	
	
	}
	public void doubliclick() {
		  act.doubleClick(pocobj.doubleclik).perform();
		  driver.switchTo().alert().accept();
			
	}
	
	public void radiobutton() {
		pocobj.male.click();	
	}
	public void checkbox() {
		pocobj.testing.click();
		
	}
	public void dropdown() {
		/*Select s=new Select(pocobj.dropdown);
		s.selectByIndex(3);*/
		pocobj.dropdown.click();
		
		
		
	}
	public void alert() {
		pocobj.alert.click();
		driver.switchTo().alert().accept();
		
	}
	public void confirmbutton() {
		pocobj.confirm.click();
		driver.switchTo().alert().dismiss();;
		//for validation text
		
	}
	public void draganddrop() {
		WebElement to=driver.findElement(By.xpath("//div[@id='targetDiv']"));
		act.dragAndDrop(pocobj.dragtext, to).build().perform();

	}
	

	

}
