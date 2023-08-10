package StepDefinition;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.ProductCheckOut;
import PageObject.RegisterPage;
import Utilities.ReadConfig;

public class BaseClass {
	public WebDriver driver;
	public RegisterPage registerPg;
	public ProductCheckOut productCheckOut;
	public ReadConfig readConfig;
	
	public String generateEmailID() {
		
		return(RandomStringUtils.randomAlphabetic(5));
	}
}
