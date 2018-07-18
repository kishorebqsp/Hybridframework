package Design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
System.setProperty(chromekey,chromevalue);
driver=new ChromeDriver();
String u = Propertyfile.pfile(propertyfilepath,"url");
driver.get(u);
	}
@AfterMethod
public void closeapp()
{
	driver.close();
}

	
}
