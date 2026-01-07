package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminusersmoreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement username;//declare webelements
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertypedropdown;
	@FindBy(xpath="//button[@type='submit' and @name='Create']")WebElement savebutton;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")WebElement alertsuccess;
//	@FindBy(xpath="//div[contains(@class,'alert-danger')] ")WebElement alertfailure;
	
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initElmets=static,initElements->initialize webelements
		// TODO Auto-generated constructor stub
	}

	public void clickAdminUsersMoreInfo() {
		adminusersmoreinfo.click();
		
	}
	public void clickNewButtonInAdminUsersPage() {
		newbutton.click();
		
	}
	public void enterTheUsernameOfAdminUsers(String uname) {
		username.sendKeys(uname);
		
	}
	public void enterThePasswordOfAdminUsers(String pwd) {
		password.sendKeys(pwd);
		
	}
	public void selectDropdownOfAdminUsers() {
		pageutility.selectByVisibleTextMethod(usertypedropdown, "Partner");
		
//		Select select=new Select(usertypedropdown);
//		select.selectByVisibleText("Partner");
//		
	}
	public void clickSaveButtonInAdminUsers() {
		savebutton.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", savebutton);

		
	}
	
	public boolean isSuccessAlertDisplayed() {
		return alertsuccess.isDisplayed();
		
	}
	
}
	

	


