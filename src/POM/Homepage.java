package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Design.Basepage;

public class Homepage extends Basepage{
	@FindBy(xpath="//span[.='My wishlists']")
	private WebElement whislist;
	@FindBy(id="search_query_top")
	private WebElement search;
	@FindBy(name="submit_search")
	private WebElement serachb;
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void wishlistbtn()
	{
		whislist.click();
	}
	public void serachtb(String name)
	{
		search.sendKeys(name);
	}
public void serachbtn()
{
	serachb.click();
}
}
