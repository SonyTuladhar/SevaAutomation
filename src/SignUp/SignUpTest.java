package SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpTest {
	WebDriver driver;
	
	@Test
		public void testSignUp() {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver2.40.exe");
			driver = new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
				SignUpObject sign = new SignUpObject(driver);
				sign.registerC();
				driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
				sign.mgender();
				sign.fnameInput("First Name");
				sign.lnameInput("Last Name");
				sign.days();
				sign.months();
				sign.years();
				sign.emailClick("");
				sign.companyInput("Company name");
				sign.passInput("7669");
				sign.confirm("7663");
				sign.registerClick();
		}
}
