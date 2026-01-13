package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	WaitUtility waitutility = new WaitUtility();

//	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminusersmoreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;// declare webelements
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement usertypedropdown;
	@FindBy(xpath = "//button[@type='submit' and @name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[contains(@class,'alert-success')]")
	WebElement alertsuccess;


	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// initElmets=static,initElements->initialize webelements
		// TODO Auto-generated constructor stub
	}

//	public void clickAdminUsersMoreInfo() {
//		adminusersmoreinfo.click();
//		
//	}
	public AdminUsersPage clickNewButtonInAdminUsersPage() {
		newbutton.click();
		return this;

	}

	public AdminUsersPage enterTheUsernameOfAdminUsers(String uname) {
		username.sendKeys(uname);
		return this;

	}

	public AdminUsersPage enterThePasswordOfAdminUsers(String pwd) {
		password.sendKeys(pwd);
		return this;

	}

	public AdminUsersPage selectDropdownOfAdminUsers() {
		pageutility.selectByVisibleTextMethod(usertypedropdown, "Partner");
		return this;

//		Select select=new Select(usertypedropdown);
//		select.selectByVisibleText("Partner");
//		
	}

	public AdminUsersPage clickSaveButtonInAdminUsers() {
		waitutility.waitForElementToBeClickable(driver, savebutton);
		savebutton.click();
		return this;
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", savebutton);

	}

	public boolean isSuccessAlertDisplayed() {
		return alertsuccess.isDisplayed();

	}

}
