package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeMethod
		public void testLogin() {
			System.setProperty("webdriver.chrome.driver", "webDriver/chromedriver2.40.exe");
			driver = new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
				LoginObject log = new LoginObject(driver);
				log.loginClick();
				driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
				
		}
	
	@Test(dataProvider="LoginDatas",dataProviderClass=LoginData.class,priority=1)
		public void loginData(String Emails,String Password) {
			LoginObject login = new LoginObject(driver);
			login.emailInput(Emails);
			login.passInput(Password);
			login.logClick();
	}
}
