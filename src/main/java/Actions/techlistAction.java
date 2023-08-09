package Actions;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import objects.techlistobjects;


public class techlistAction  {
	public static WebDriver driver;
	
	 techlistobjects techobj=PageFactory.initElements(driver,techlistobjects.class);
	 
	 public void tabeldata() {
		int  row=techobj.tablerow.size();
		int col=techobj.tablecol.size();
		 System.out.println(row);
		 System.out.println(col);
		
		/*for(int i=2;i<=row;i++) {
			for (int j=i;j<=col;j++) {
				String s=driver.findElement(By.xpath("//tbody[@style='box-sizing:inherit']/tr[" + i +"]/td[" + j +"]")).getText();
				
			}*/
			

		}
	
		 
		 
	 }


