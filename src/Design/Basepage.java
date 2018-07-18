package Design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage {
	public WebDriver driver;
	public void click(WebElement element)
	{
		try {
		WebDriverWait  wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.elementToBeClickable(element));
		Reporter.log("pass:click");
		}
		catch(Exception e)
		{
			Reporter.log("fail:click");
			Assert.fail();
		}
	}

}
