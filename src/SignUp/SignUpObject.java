package SignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import data.ExcelData_Creator;

public class SignUpObject {
	WebDriver driver;

	public SignUpObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	ExcelData_Creator edc = new ExcelData_Creator("");

	@FindBy(xpath = "//a[@href='/register?returnUrl=%2F']")
	WebElement register;

	public void registerClick() {
		register.click();
	}

	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement mgender;

	public void mgender() {
		mgender.click();
	}

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstName;

	public void firstNameInput(String fName) {
		firstName.sendKeys(fName);
	}

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastName;

	public void lastNameInput(String LName) {
		lastName.sendKeys(LName);
	}

	@FindBy(xpath = "//select[@name='DateOfBirthDay']")
	WebElement day;

	public void dayInput(String days) {
		day.sendKeys(days);
	}

	@FindBy(xpath = "//select[@name='DateOfBirthMonth']")
	WebElement month;

	public void monthInput(String months) {
		month.sendKeys(months);
	}

	@FindBy(xpath = "//select[@name='DateOfBirthYear']")
	WebElement year;

	public void years(String years) {
		year.sendKeys(years);
	}

	@FindBy(xpath = "//input[@type='email' and @id='Email']")
	WebElement email;

	public void emailClick(String emailI) {
		email.sendKeys(emailI);
	}

	@FindBy(xpath = "//input[@name='Company']")
	WebElement company;

	public void companyInput(String companyInfo) {
		company.sendKeys(companyInfo);
	}
											
	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;

	public void passwordInput(String passwordInput) {
		password.sendKeys(passwordInput);
	}

	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	WebElement confirmpassword;

	public void cPasswordInput(String c) {
		confirmpassword.sendKeys(c);
	}

	@FindBy(xpath = "//input[@name='register-button']")
	WebElement registerButton;

	public void registerButtonClick() {
		registerButton.click();
	}

		
}
