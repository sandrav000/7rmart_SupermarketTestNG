package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	public WebDriver driver;

//		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement managefootertextmoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")
	WebElement action;
	@FindBy(xpath = "//textarea[@id='content']")
	WebElement addressfield;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailfield;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonefield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;
	@FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
	WebElement alert;

	public ManageFooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// initElmets=static,initElements->initialize webelements
		// TODO Auto-generated constructor stub
	}

//		public void clickManageFooterTextMoreInfo() {
//			managefootertextmoreinfo.click();
//			
//		}
	public ManageFooterTextPage clickActionInManageFooter() {
		action.click();
		return this;

	}

	public ManageFooterTextPage enterAddressInmanageFooterMethod(String address) {
		addressfield.clear();
		addressfield.sendKeys(address);
		return this;

	}

	public ManageFooterTextPage enterEmailInmanageFooterMethod(String email) {
		emailfield.clear();
		emailfield.sendKeys(email);
		return this;

	}

	public ManageFooterTextPage enterPhoneInmanageFooterMethod(String phone) {
		phonefield.clear();
		phonefield.sendKeys(phone);
		return this;

	}

	public ManageFooterTextPage clickManageFooterUpdateButton() {
		update.click();
		return this;

	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();

	}
}
