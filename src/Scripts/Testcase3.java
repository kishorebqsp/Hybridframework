package Scripts;

import org.testng.annotations.Test;

import Design.Basetest;
import Design.Data;
import POM.Loginpage;

public class Testcase3 extends Basetest {
	@Test
	public void invalidlogin()
	{
		String email = Data.excel(Excelpath,"Sheet2",1,0);
		String password = Data.excel(Excelpath,"Sheet2",1,1);
		Loginpage l=new Loginpage(driver);
		l.signbtn();
		l.emailaddresstb(email);
		l.passwordbtn(password);
		l.login();
	}

}
