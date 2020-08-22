package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {
	WebDriver driver;
	
		public LoginObject(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath ="//a[@href='/login?returnUrl=%2F']")
		WebElement login;
		
			public void loginClick() {
				login.click();
			}
			
			@FindBy(xpath ="//input[@name='Email']")
			WebElement email;
			
				public void emailInput(String e) {
					email.sendKeys(e);
				}
				
				@FindBy(xpath= "//input[@name='Password']")
				WebElement pass;
				
					public void passInput(String p) {
						pass.sendKeys(p);
					}
					
					@FindBy(xpath="//input[@value='Log in']")
					WebElement log;
					
						public void logClick() {
							log.click();
						}
}
