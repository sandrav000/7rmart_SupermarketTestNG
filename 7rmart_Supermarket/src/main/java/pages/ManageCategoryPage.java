package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	WaitUtility waitutility = new WaitUtility();

//		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")WebElement managecategorymoreinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='category']")
	WebElement category;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement discount;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement choosefile;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement savebutton;
	@FindBy(xpath = "//div[contains(@class,'alert-success')]")
	WebElement alert_success;
	@FindBy(xpath = "//div[contains(@class,'alert-danger')]")
	WebElement alert_alreadyexist;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// initElmets=static,initElements->initialize webelements
		// TODO Auto-generated constructor stub
	}

//		public void clickManageCategoryMoreInfo() {
//			pageutility.javascriptExecutorClickMethod(driver, managecategorymoreinfo);
//			managecategorymoreinfo.click();

//		}
	public ManageCategoryPage clickNewButtonInManageCategory() {
		waitutility.waitForElementToBeClickable(driver, newbutton);
		newbutton.click();
		return this;

	}

	public ManageCategoryPage enterCategoryInCategoryField(String category_text) {
		category.sendKeys(category_text);
		return this;

	}

	public ManageCategoryPage clickSelectGroupsInManageCategory() {
		discount.click();
		return this;

	}

	public ManageCategoryPage selectFileUsingChooseFile() {
		fileuploadutility.fileUploadUsingsendKeys(choosefile, Constant.APPLE);
		return this;

	}

	public ManageCategoryPage clickSaveButtonInmanageCategory() {
		pageutility.javaScriptExecutorScrollToBottom(driver);
		pageutility.javascriptExecutorClickMethod(driver, savebutton);
		return this;
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", savebutton);
//			savebutton.click();

	}

	public boolean isAlertDisplayed() {
		try {
			if (alert_success.isDisplayed()) {
				return true;
			}
		} catch (Exception ignored) {

		}

		try {
			if (alert_alreadyexist.isDisplayed()) {
				return true;

			}
		} catch (Exception ignored) {

		}
		return false;

	}

}
