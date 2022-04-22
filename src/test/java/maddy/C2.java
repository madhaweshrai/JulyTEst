package maddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C2 {

	private static WebDriver dr;
	C2(WebDriver dr){
		
		this.dr=dr;
	}
	public static String doGet()
	{
		
		String url="https://www.google.com/";
		return url;
	}
	
	public static WebElement doFind(By locator)
	{
		return dr.findElement(locator);
	}
}
