package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsPage {
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();

//	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement managenewsmoreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//textarea[@name='news']")
	WebElement textareafield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebutton;
	@FindBy(xpath = "//div[contains(@class,' alert-success')]")
	WebElement alert;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// initElmets=static,initElements->initialize webelements
		// TODO Auto-generated constructor stub
	}

//	public void clickManageNewsMoreInfo() {
//		waitutility.waitForElementToBeClickable(driver, managenewsmoreinfo);
//		managenewsmoreinfo.click();
//		
//	}

	public ManageNewsPage clickNewButtonInManageNewsMoreInfo() {
		waitutility.waitForElementToBeClickable(driver, newbutton);
		newbutton.click();
		return this;

	}

	public ManageNewsPage enterInputFieldInManageNewsMoreInfo(String text) {
		textareafield.sendKeys(text);
		return this;

	}

	public ManageNewsPage clickSaveButtonInmanageNewsMoreInfo() {
		savebutton.click();
		return this;

	}

	public boolean isAlertDisplayed() {
		waitutility.waitForVisibilityOfElement(driver, alert);
		return alert.isDisplayed();

	}
}