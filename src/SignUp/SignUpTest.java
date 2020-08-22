package SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest {
	WebDriver driver;
	
	@BeforeMethod
		public void testSignUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "webDriver/chromedriver2.40.exe");
			driver = new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
				SignUpObject sign = new SignUpObject(driver);
				sign.registerC();
				driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
				Thread.sleep(1000);
	}		
				@Test(dataProvider="SignUpDatas",dataProviderClass=SignUpData.class, priority=1)
				public void registerData(String FirstName,String LastName,String  Days,String Month, String Year, String Email, String CompanyName, String Password, String ConfirmPassword) throws InterruptedException {
					SignUpObject signi = new SignUpObject(driver);
					signi.registerC();
					driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
					Thread.sleep(1000);
					signi.mgender();
					
					
					signi.fnameInput(FirstName);
					signi.lnameInput(LastName);
					signi.days(Days);
					driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
					signi.months(Month);
					signi.years(Year);
					signi.emailClick(Email);
					signi.companyInput(CompanyName);
					signi.passInput(Password);
					signi.confirm(ConfirmPassword);
					signi.registerClick();
					
				}
				
					@AfterMethod
					public void browserQuit() {
						driver.close();
					}
				
		}

