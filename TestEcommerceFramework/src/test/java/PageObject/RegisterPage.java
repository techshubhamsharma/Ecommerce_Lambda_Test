package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
		
	WebDriver ldriver;
	
	public RegisterPage(WebDriver rDriver) {
		
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	
	@FindBy(xpath="//a[@role='button']//span[@class='title'][normalize-space()='My account']")
	WebElement elementToHover;
	
	@FindBy(xpath="//span[normalize-space()='Register']")
	WebElement registerClick;
	
	@FindBy(id="input-firstname")
	WebElement firstName;
	
	@FindBy(id="input-lastname")
	WebElement lastName;
	
	@FindBy(id="input-email")
	WebElement userEmail;
	
	@FindBy(id="input-telephone")
	WebElement userPhone;
	
	@FindBy(id="input-password")
	WebElement userPassword;
	
	@FindBy(id="input-confirm")
	WebElement confirmPassword;
	
	
	@FindBy(xpath="//label[@for='input-agree']")
	WebElement confirmPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueButton;
	
	
	public void elementHover() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(elementToHover).build().perform();
		
	}
	
	public void registerPg() {
		registerClick.click();
		
	}
	
	
	public void userFName(String addFirstName) {
		firstName.sendKeys(addFirstName);
		
	}
	
	public void userLName(String addLastName) {
		lastName.sendKeys(addLastName);
		
	}
	
	public void uEmail(String addUserEmail) {
		userEmail.sendKeys(addUserEmail);
		
	}
	
	public void uPhone(String addUserPhone) {
		userPhone.sendKeys(addUserPhone);
		
	}
	
	public void uPwd(String addUserPassword) {
		userPassword.sendKeys(addUserPassword);
		
	}
	
	public void uPwdConfirm(String addUserPasswordConfirm) {
		confirmPassword.sendKeys(addUserPasswordConfirm);
		
	}
	
	public void userPolicy() {
		confirmPolicy.click();
		
	}
	
	
	public void uContinueBtn() {
		continueButton.click();
		
	}
	
	
	
	
}
