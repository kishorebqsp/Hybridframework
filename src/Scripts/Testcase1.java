package Scripts;

import org.testng.annotations.Test;

import Design.Basetest;
import Design.Data;
import POM.Homepage;
import POM.Loginpage;
import POM.Wishlistpage;

public class Testcase1 extends Basetest{
	@Test
	public void Validlogin()
	{
		String email = Data.excel(Excelpath,"Sheet1",1,0);
		String pwd = Data.excel(Excelpath,"Sheet1",1,1);
		String name = Data.excel(Excelpath,"Sheet1",1,2);
		Loginpage l=new Loginpage(driver);
		l.signbtn();
		l.emailaddresstb(email);
		l.passwordbtn(pwd);
		l.login();
		Homepage h=new Homepage(driver);
		h.wishlistbtn();
		Wishlistpage w=new Wishlistpage(driver);
		w.nametxtbox(name);
		w.savebtn();
		w.signoutbtn();
	}

}
