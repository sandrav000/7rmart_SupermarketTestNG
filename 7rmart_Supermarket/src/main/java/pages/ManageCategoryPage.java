package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;


public class ManageCategoryPage  {
		public WebDriver driver;
		PageUtility pageutility=new PageUtility();
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		
		
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")WebElement managecategorymoreinfo;
		@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
		@FindBy(xpath="//input[@id='category']")WebElement category;
		@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
		@FindBy(xpath="//button[text()='Save']")WebElement savebutton;
		@FindBy(xpath="//div[contains(@class,' alert-success')]")WebElement alert;
		
		
		public ManageCategoryPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);//initElmets=static,initElements->initialize webelements
			// TODO Auto-generated constructor stub
		}

		public void clickManageCategoryMoreInfo() {
			pageutility.javascriptExecutorClickMethod(driver, managecategorymoreinfo);
//			managecategorymoreinfo.click();
			
		}
		public void clickNewButtonInManageCategory() {
			newbutton.click();
			
		}
		public void enterCategoryInCategoryField(String category_text) {
			category.sendKeys(category_text);
			
		}
		public void selectFileUsingChooseFile() {
			fileuploadutility.fileUploadUsingsendKeys(choosefile,Constant.APPLE);
			
		}
		
		public void clickSaveButtonInmanageCategory() {
			pageutility.javaScriptExecutorScrollToBottom(driver);
			pageutility.javascriptExecutorClickMethod(driver, savebutton);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", savebutton);
//			savebutton.click();
			
		}
		
		public boolean isAlertDisplayed() {
			return alert.isDisplayed();
			
		}
	}

