package SignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpObject {
	WebDriver driver;
	
		public SignUpObject(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		@FindBy(xpath= "//a[@href='/register?returnUrl=%2F']")
		WebElement register;
		
			public void register() {
				register.click();
			}
			
			@FindBy(xpath= "//input[@id='gender-male']")
			WebElement mgender;
			
				public void mgender() {
					mgender.click();
				}
				
				@FindBy(xpath= "//input[@id='FirstName']")
				WebElement fname;
				
					public void fnameInput(String name) {
						fname.sendKeys(name);
					}
					
					@FindBy(xpath= "//input[@id='LastName']")
					WebElement lname;
					
						public void lnameInput(String name2) {
							lname.sendKeys(name2);
						}
						
						@FindBy(xpath= "//select[@name='DateOfBirthDay']")
						WebElement day;
						
							public void days() {
								day.click();
							}
							
							@FindBy(xpath= "//select[@name='DateOfBirthMonth']")
							WebElement month;
							
								public void months() {
									month.click();
								}
								
								@FindBy(xpath="//select[@name='DateOfBirthYear']")
								WebElement year;
								
									public void years() {
										year.click();
									}
									
									@FindBy(xpath="//input[@type='email' and @id='Email']")
									WebElement email;
									
										public void emailClick(String e) {
											email.sendKeys(e);
										}
										
										@FindBy(xpath="//input[@name='Company']")
										WebElement company;
										
											public void companyInput(String c) {
												company.sendKeys(c);
											}
											
											@FindBy(xpath="//input[@name='Password']")
											WebElement password;
											
												public void passInput(String p) {
													password.sendKeys(p);
												}
												
												@FindBy(xpath="//input[@name='ConfirmPassword']")
												WebElement cpassword;
												
													public void confirm(String c) {
														cpassword.sendKeys(c);
													}
													
													@FindBy(xpath="//input[@name='register-button']")
													WebElement registerBut;
													
														public void registerClick() {
															registerBut.click();
														}

		
}
