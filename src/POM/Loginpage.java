package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Design.Basepage;

public class Loginpage extends Basepage{
	@FindBy(linkText="Sign in")
	private WebElement signin;
	@FindBy(id="email")
	private WebElement emailaddress;
	@FindBy(id="passwd")
	private WebElement passwordtb;
	@FindBy(id="SubmitLogin")
	private WebElement loginbtn;
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void signbtn()
	{
		signin.click();
	}
	public void emailaddresstb(String username)
	{
		emailaddress.sendKeys(username);
	}
public void passwordbtn(String password)
{
	passwordtb.sendKeys(password);
}
public void login()
{
	loginbtn.click();
}
}
