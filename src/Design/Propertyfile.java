package Design;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile {
	public static String pfile(String pfpath,String key)
	{
		String s="";
		try {
			Properties p=new Properties();
			p.load(new FileInputStream(pfpath));
			 s = p.getProperty(key);
		}
		catch(Exception e)
		{	
		}
	return s;
	
	}
}
