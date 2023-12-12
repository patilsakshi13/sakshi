package Com_Test_Utility;


import java.util.ArrayList;

import Com_Web_XlxsReader.Xls_Reader;

public class TestUtility {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDatafromExcel()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		reader = new Xls_Reader("C:\\Users\\HP\\eclipse-core java\\Testing\\Feasher_Project\\src\\test\\java\\Com_ExcelFile\\LumaFramefork.xlsx");
	
	for(int rownum=2; rownum<=reader.getRowCount("AccountCreation");rownum++)
	{
		String fname = reader.getCellData("AccountCreation", "FirstName", rownum);
		String lname = reader.getCellData("AccountCreation", "LastName", rownum);
		String ema = reader.getCellData("AccountCreation", "Email", rownum);
		String psword = reader.getCellData("AccountCreation", "Password", rownum);
		String cpsw = reader.getCellData("AccountCreation", "ConformPassword", rownum);
	
		
		Object ob[] = {fname,lname,ema,psword,cpsw};
		mydata.add(ob);
		
	}
	return mydata;
	}
	
//	public static ArrayList<Object[]> Signin()
//	{
//		ArrayList<Object[]> mydata1 = new ArrayList<Object[]>();
//		reader = new Xls_Reader("C:\\Users\\HP\\eclipse-core java\\Testing\\Feasher_Project\\src\\test\\java\\Com_ExcelFile\\LumaFramefork.xlsx");
//
//		for(int rownum=2; rownum<=reader.getRowCount("SignIn");rownum++)
//		{
//			String em1 = reader.getCellData("SignIn", "FirstName", rownum);
//			String pss1 = reader.getCellData("SignIn", "LastName", rownum);
//			
//			Object ob1[] = {em1,pss1};
//			mydata1.add(ob1);
//			
//		}
//		
//		return mydata1;
//	}
	
}
