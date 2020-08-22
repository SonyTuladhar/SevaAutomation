package Login;

import org.testng.annotations.DataProvider;

import data.ExcelData_Creator;

public class LoginData {
	@DataProvider(name= "LoginDatas")
	
    public static Object[][] SignUpDatas() throws Exception {
        String xlFilePath = "./excel/LoginData.xlsx";
        String sheetName = "Login";

  //      ExcelFileParser efp = new ExcelFileParser(xlFilePath);     

    ExcelData_Creator edc=new ExcelData_Creator(xlFilePath);
        @SuppressWarnings("static-access")
		Object[][] mydata = edc.getTestData(xlFilePath, sheetName);
        return mydata;
    }

}
