package Design;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {
	public static String excel(String path,String 
			sheet,int row,int cell)
	{
		String s="";
		try {
		FileInputStream f=new FileInputStream(path);
		Workbook w = WorkbookFactory.create(f);
		 s = w.getSheet(sheet).getRow(row).getCell(cell).
				 getStringCellValue();
}
		catch(Exception e)
		{	
		}
		return s;
}

}
