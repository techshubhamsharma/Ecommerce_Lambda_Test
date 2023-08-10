package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.ProductCheckOut;
import PageObject.RegisterPage;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends BaseClass{
	@Before("@Sanity")
	public void setup() {
		
		readConfig = new ReadConfig();
		String browser = readConfig.getBrowser();
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;  
			
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		
		default:
			driver = null;
			break;
			
		}
		
		
	 	
	}
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		
	   registerPg = new RegisterPage(driver);
	   productCheckOut = new ProductCheckOut(driver);
	}

	@When("User Open URL {string}")
	public void user_open_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get(url);
	}
	
	@And("User hover mouse on element")
	public void user_hover_mouse_on_element() {
	    registerPg.elementHover();
	}
	
	
	@Then("User Search Register button")
	public void user_search_register_button() {
		registerPg.registerPg();
	}
	
	
	@And("User enter first name {string} and last name {string}")
	public void user_enter_first_name_and_last_name(String uFName, String uLName) {
		registerPg.userFName(uFName);
	    registerPg.userLName(uLName);
	}
	
	
	
	@And("User enter email {string} and Phone {string}")
	public void user_enter_email_and_phone(String uAddEmail, String uAddPhone) {
		//registerPg.uEmail(uAddEmail);
		registerPg.uEmail(generateEmailID() + uAddEmail);
		registerPg.uPhone(uAddPhone);
	}
	
	
	
	@And("User enter password {string} and confirm password {string}")
	public void user_enter_password_and_confirm_password(String uFPwd, String uCPwd) {
		registerPg.uPwd(uFPwd);
		registerPg.uPwdConfirm(uCPwd);
	}
	
	
	@And("Click on Privacy Policy button")
	public void click_on_privacy_policy_button() {
		registerPg.userPolicy();
	}
	
	
	@Then("Click on Continue Button")
	public void click_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		registerPg.uContinueBtn();
	}


// -------------Product CheckOut ---------------//
	
	
	@Then("User Enter Item {string} in the field of Search")
	public void user_enter_item_in_the_field_of_search(String enterSP) {
		productCheckOut.userSearchProduct(enterSP);
	}

	@Then("User click on Search Button")
	public void user_click_on_search_button() {
	    productCheckOut.userSearchButton();
	}

	@Then("User click on In Stock Items")
	public void user_click_on_in_stock_items() {
	    productCheckOut.userInStockCheck();
	}

	@Then("User Hover Mouse Cursor over items")
	public void user_hover_mouse_cursor_over_items() {
	    productCheckOut.userHoverMouseImg();
	}

	@Then("Click on Product Image")
	public void click_on_product_image() {
		productCheckOut.userCartButton();
	}
	
	@Then("User Select Size")
	public void user_select_size() throws InterruptedException {
	    productCheckOut.userSelectOptionRandom();
	}
	
	@Then("User Select size from Dropdown")
	public void user_select_size_from_dropdown() throws InterruptedException{
	  productCheckOut.userSelectOpts();
	}
	
	@Then("User click on Buy Button")
	public void user_click_on_buy_button() throws InterruptedException{
		productCheckOut.userClickBuyButton();
	}
	

	@Then("User Enter firstname {string} and lastname {string}")
	public void user_enter_firstname_and_lastname(String enterFN, String enterLN ) throws InterruptedException {
		productCheckOut.userPaymentFirstName(enterFN);
	    productCheckOut.userPaymentLastName(enterLN);
	}




	@Then("User Enter Company name {string}")
	public void user_enter_company_name(String enterCN) {
	    productCheckOut.userPaymentCompanyName(enterCN);
	}

	@Then("User Enter Address {string}")
	public void user_enter_address(String userEA) {
	    productCheckOut.userPaymentAddress(userEA);
	}

	@Then("User Enter City {string}")
	public void user_enter_city(String userEPC) {
	    productCheckOut.userPaymentCity(userEPC);
	}

	@Then("User Select Country")
	public void user_select_country() {
	    productCheckOut.userSelectCountryRandom();
	}

	@Then("User Select Region")
	public void user_select_region() throws InterruptedException {
	    productCheckOut.userSelectStateRandom();
	}
	
	@Then("User Expand Region Again")
	public void user_expand_region_again()  throws InterruptedException {
	    productCheckOut.userSelectStateOptions();
	}

	@Then("User Select Term and Conditions")
	public void user_select_term_and_conditions() {
	    productCheckOut.userSelectTermsConditions();
	}
	
	@Then("Click on Continue Always button")
	public void click_on_continue_always_button() throws InterruptedException {
	    productCheckOut.userClickContinueButton();
	}

	

	@Then("User Click on Confirm Order Button")
	public void user_click_on_confirm_order_button() throws InterruptedException {
	    productCheckOut.userClickConfirmButton2();
	}
	
	@After
	public void teardown(Scenario sc) {
		if(sc.isFailed()==true) {
			String fileWithPath = "C:\\Users\\Shubham\\eclipse-workspace\\TestEcommerceFramework\\Screenshot\\test.png";
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			File DestFile = new File(fileWithPath);
			
			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		driver.quit();
	}
	

}
