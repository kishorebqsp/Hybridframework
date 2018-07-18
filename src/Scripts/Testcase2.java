package Scripts;

import org.testng.annotations.Test;

import Design.Basetest;
import Design.Propertyfile;
import POM.Cartpage;
import POM.Dresspage;
import POM.Homepage;
import POM.Loginpage;
import POM.Wishlistpage;

public class Testcase2 extends Basetest {
	@Test
	public void product() throws InterruptedException
	{
		String emailaddress = Propertyfile.pfile(propertyfilepath,"email");
		String password = Propertyfile.pfile(propertyfilepath,"password");
		String name = Propertyfile.pfile(propertyfilepath,"name");
		Loginpage l=new Loginpage(driver);
		l.signbtn();
		l.emailaddresstb(emailaddress);
		l.passwordbtn(password);
		l.login();
		Homepage h=new Homepage(driver);
		h.serachtb(name);
		h.serachbtn();
		Dresspage d=new Dresspage(driver);
		d.dressselected();
		Cartpage c=new Cartpage(driver);
		c.addtocart();
		Thread.sleep(3000);
		c.closebtn();
		Wishlistpage w=new Wishlistpage(driver);
		w.signoutbtn();
	}

}
