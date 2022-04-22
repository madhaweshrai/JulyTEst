package maddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C1 {

	WebDriver driver;
	@Test
	public void launch()
	{
		
		By search= By.name("q");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(C2.doGet());
		C2 obj=new C2(driver);
		C2.doFind(search).sendKeys("maddy");
	}
}
