package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Design.Basepage;

public class Dresspage extends Basepage {
	@FindBy(linkText="Printed Dress")
	private WebElement dress;
	
	public Dresspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void dressselected()
	{
		dress.click();
	}
	

}
