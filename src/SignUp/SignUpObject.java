package SignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import data.ExcelData_Creator;

public class SignUpObject {
	WebDriver driver;
	
		public SignUpObject(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		ExcelData_Creator edc = new ExcelData_Creator("");
		
		@FindBy(xpath= "//a[@href='/register?returnUrl=%2F']")
		WebElement register;
		
			public void registerC() {
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
						
							public void days(String d) {
								day.sendKeys(d);
							}
							
							@FindBy(xpath= "//select[@name='DateOfBirthMonth']")
							WebElement month;
							
								public void months(String m) {
									month.sendKeys(m);
								}
								
								@FindBy(xpath="//select[@name='DateOfBirthYear']")
								WebElement year;
								
									public void years(String y) {
										year.sendKeys(y);
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
