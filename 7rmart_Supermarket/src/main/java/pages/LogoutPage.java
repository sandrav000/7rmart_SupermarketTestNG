package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LogoutPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	WaitUtility waitutility = new WaitUtility();

	@FindBy(xpath = "//a[@class='nav-link' and @data-toggle='dropdown']")
	WebElement admin;// declare webelements
	@FindBy(xpath = "//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']")
	WebElement logout;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement adminusersmoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")
	WebElement managecategorymoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")
	WebElement managecontactmoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
	WebElement managefootertextmoreinfo;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement managenewsmoreinfo;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// initElmets=static,initElements->initialize webelements
		// TODO Auto-generated constructor stub
	}

	public AdminUsersPage clickAdminUsersMoreInfo() {
		adminusersmoreinfo.click();
		return new AdminUsersPage(driver);

	}

	public ManageCategoryPage clickManageCategoryMoreInfo() {
		pageutility.javascriptExecutorClickMethod(driver, managecategorymoreinfo);
//			managecategorymoreinfo.click();
		return new ManageCategoryPage(driver);

	}

	public ManageContactPage clickManageContactMoreInfo() {
		managecontactmoreinfo.click();
		return new ManageContactPage(driver);

	}

	public ManageFooterTextPage clickManageFooterTextMoreInfo() {
		managefootertextmoreinfo.click();
		return new ManageFooterTextPage(driver);

	}

	public ManageNewsPage clickManageNewsMoreInfo() {
		waitutility.waitForElementToBeClickable(driver, managenewsmoreinfo);
		managenewsmoreinfo.click();
		return new ManageNewsPage(driver);

	}

	public void adminClick() {
		admin.click();

	}

	public void logoutClick() {
		logout.click();

	}

	public boolean isLoginPageDisplayed() {
		return signin.isDisplayed();

	}

}
