package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;// declare webelements
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains(@class,'alert-danger')]")
	WebElement alertmessage;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// initElmets=static,initElements->initialize webelements
		// TODO Auto-generated constructor stub
	}

	public LoginPage enterTheUsername(String user) {
		username.sendKeys(user);
		return this;

	}

	public LoginPage enterThePassword(String pass) {
		password.sendKeys(pass);
		return this;

	}

	public LogoutPage clickSignin() {
		signin.click();
		return new LogoutPage(driver);

	}

	public boolean isHomePageDisplayed() {
		waitutility.waitForVisibilityOfElement(driver, dashboard);
		return dashboard.isDisplayed();

	}

	public boolean isAlertDisplayed() {
		waitutility.waitForVisibilityOfElement(driver, alertmessage);
		return alertmessage.isDisplayed();

	}
}
