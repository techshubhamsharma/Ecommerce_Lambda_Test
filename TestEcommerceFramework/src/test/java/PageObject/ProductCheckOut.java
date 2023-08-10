package PageObject;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductCheckOut {
	
		public WebDriver ldriver;
		public WebDriverWait wait;
		
		public ProductCheckOut(WebDriver rdriver)
		{
			ldriver = rdriver;
			wait = new WebDriverWait(ldriver, Duration.ofSeconds(30));
			ldriver.manage().window().maximize();
			PageFactory.initElements(ldriver, this);
			
		}
		
		@FindBy(xpath="(//input[@placeholder='Search For Products'])[1]")
		WebElement searchProduct;
		
		public void userSearchProduct(String userSP) {
			searchProduct.sendKeys(userSP);
		}
		
		@FindBy(xpath="//button[normalize-space()='Search']")
		WebElement searchButton;
		
		public void userSearchButton() {
			
			searchButton.click();
		}
			
		
		@FindBy(xpath="(//label[@for='mz-fss-0--1'])[1]")
		WebElement inStockCheck;
		
		public void userInStockCheck() {
			inStockCheck.click();
		}
		
		@FindBy(xpath="(//img[@title='Apple Cinema 30&quot;'])[1]")
		WebElement hoverMouseImg;
		
		public void userHoverMouseImg() {
			Actions actions = new Actions(ldriver);
			actions.moveToElement(hoverMouseImg).build().perform();
			
		}
		
		
		
		@FindBy(xpath="//button[@class='btn btn-cart cart-42']")
		WebElement clkOnCartBtn;
		
		public void userCartButton() {
			
			clkOnCartBtn.click();
		}
		
		
		
		
		@FindBy(xpath="(//select[@id='input-option231-212958'])[1]")
		WebElement selectOptionsRandom;
		
		
		public void userSelectOptionRandom() throws InterruptedException {
			Thread.sleep(3000);
			selectOptionsRandom.click();
			
	        }
		
		@FindBy(xpath="//select[@id=\"input-option231-212958\"]//option[3]")
		WebElement selectOpts;
		
		public void userSelectOpts() throws InterruptedException {
			Thread.sleep(3000);
			selectOpts.click();
		}
		
		@FindBy(xpath="(//button[normalize-space()='Buy now'])[1]")
		WebElement clkBuyButton;
		
		public void userClickBuyButton() throws InterruptedException {
			Thread.sleep(3000);
			clkBuyButton.click();
			clkBuyButton.sendKeys(Keys.ENTER);
			
		}
		
	
		
		@FindBy(xpath="(//input[@id='input-payment-firstname'])[1]")
		WebElement paymentFirstName;
		
		public void userPaymentFirstName(String userPFN) throws InterruptedException {
			Thread.sleep(3000);
			paymentFirstName.sendKeys(userPFN);
		}
		
		@FindBy(id="input-payment-lastname")
		WebElement paymentLastName;
		
		public void userPaymentLastName(String userPLN) throws InterruptedException {
			Thread.sleep(3000);
			paymentLastName.sendKeys(userPLN);
		}
		
		@FindBy(id="input-payment-company")
		WebElement paymentCompanyName;
		
		public void userPaymentCompanyName(String userPCN) {
			
			paymentCompanyName.sendKeys(userPCN);
		}
		
		@FindBy(id="input-payment-address-1")
		WebElement paymentAddress;
		
		public void userPaymentAddress(String userPA) {
			
			paymentAddress.sendKeys(userPA);
		}
		
		@FindBy(id="input-payment-city")
		WebElement paymentCity;
		
		public void userPaymentCity(String userPC) {
			
			paymentCity.sendKeys(userPC);
		}
		
		@FindBy(id="input-payment-postcode")
		WebElement paymentPostCode;
		
		public void userPaymentPostCode(String userPPC) {
			
			paymentPostCode.sendKeys(userPPC);
		}
		
		@FindBy(xpath="//select[@id='input-payment-country']//option[40]")
		WebElement selectCountry;
		
		public void userSelectCountryRandom() {
			
			selectCountry.click();
			
		}
		
		
		@FindBy(xpath="(//select[@id='input-payment-zone'])[1]")
		WebElement selectState;
		
		public void userSelectStateRandom() throws InterruptedException {
			Thread.sleep(3000);
			selectState.click();
			
			
		}
		
		@FindBy(xpath="//select[@id='input-payment-zone']//option[3]")
		WebElement SelectStateOptions;
		
		public void userSelectStateOptions() throws InterruptedException {
			Thread.sleep(3000);
			SelectStateOptions.click();
		}
		
		@FindBy(xpath="//label[@for='input-agree']")
		WebElement selectTermsConditions;
		
		public void userSelectTermsConditions() {
			
			selectTermsConditions.click();
		}
		
		@FindBy(xpath="//button[@id='button-save']")
		WebElement clkContinueBtn2;
		
		public void userClickContinueButton() throws InterruptedException {
			Thread.sleep(3000);
			clkContinueBtn2.click();
		}
		
		@FindBy(xpath="//button[@id='button-confirm']")
		WebElement clkConfirmButton2;
		
		public void userClickConfirmButton2() throws InterruptedException {
			Thread.sleep(3000);
			
			clkConfirmButton2.click();
		}
		
		
		
}
