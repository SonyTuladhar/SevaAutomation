package SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest {
	private WebDriver driver;

	@BeforeMethod
	public void testSignUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "webDriver/chromedriver2.40.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		SignUpObject sign = new SignUpObject(driver);
		sign.registerClick();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	}		
	
	@Test(dataProvider="SignUpDatas",dataProviderClass=SignUpData.class, priority=1)
	public void registerData(String FirstName,String LastName,String  Days,String Month, String Year, String Email, String CompanyName, String Password, String ConfirmPassword) throws InterruptedException {
		SignUpObject signUpObj = new SignUpObject(driver);
		signUpObj.registerClick();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		Thread.sleep(1000);
		signUpObj.mgender();

		signUpObj.firstNameInput(FirstName);
		signUpObj.lastNameInput(LastName);
		signUpObj.dayInput(Days);
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		signUpObj.monthInput(Month);
		signUpObj.years(Year);
		signUpObj.emailClick(Email);
		signUpObj.companyInput(CompanyName);
		signUpObj.passwordInput(Password);
		signUpObj.cPasswordInput(ConfirmPassword);
		signUpObj.registerButtonClick();

	}

	@AfterMethod
	public void browserQuit() {
		driver.close();
	}

}

