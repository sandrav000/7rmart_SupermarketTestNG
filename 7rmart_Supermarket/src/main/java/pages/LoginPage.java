package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage  {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")WebElement username;//declare webelements
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[contains(@class,'alert-danger')]")WebElement alertmessage;

	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initElmets=static,initElements->initialize webelements
		// TODO Auto-generated constructor stub
	}
	public void enterTheUsername(String user) { 
		username.sendKeys(user);
		
		
	}
	public void enterThePassword(String pass) {
		password.sendKeys(pass);
		
	}
	public void clickSignin() {
		signin.click();
		
	}
	
	
	public boolean isHomePageDisplayed() {
		return dashboard.isDisplayed();
		
	}
	public boolean isAlertDisplayed() {
		return alertmessage.isDisplayed();
		
	}
}
