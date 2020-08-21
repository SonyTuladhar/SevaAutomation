package SignUp;

import org.testng.annotations.DataProvider;

import data.ExcelData_Creator;

public class SignUpData {
	
		@DataProvider(name= "SignUpDatas")
		
	    public static Object[][] SignUpDatas() throws Exception {
	        String xlFilePath = "./excel/RegisterData.xlsx";
	        String sheetName = "Register";

	  //      ExcelFileParser efp = new ExcelFileParser(xlFilePath);     

	    ExcelData_Creator edc=new ExcelData_Creator(xlFilePath);
	        @SuppressWarnings("static-access")
			Object[][] mydata = edc.getTestData(xlFilePath, sheetName);
	        return mydata;
	    }

		
}
