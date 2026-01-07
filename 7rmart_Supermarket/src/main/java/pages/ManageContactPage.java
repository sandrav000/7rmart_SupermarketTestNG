package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManageContactPage  {
	public WebDriver driver;
	        @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")WebElement managecontactmoreinfo;
	        @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")WebElement action;
			@FindBy(xpath="//input[@id='phone']")WebElement phonefield;
			@FindBy(xpath="//input[@id='email']")WebElement emailfield;
			@FindBy(xpath="//textarea[@id='content' and @name='address']")WebElement addressfield;
			@FindBy(xpath="//textarea[@name='del_time']")WebElement deliverytimefield;
			@FindBy(xpath="//input[@id='del_limit']")WebElement deliverychargelimitfield;
			
			@FindBy(xpath="//button[@type='submit']")WebElement update;
			@FindBy(xpath="//div[contains(@class,'alert alert-success')]")WebElement alert;
			
									
			public ManageContactPage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);//initElmets=static,initElements->initialize webelements
				// TODO Auto-generated constructor stub
			}

			public void clickManageContactMoreInfo() {
				managecontactmoreinfo.click();
				
			}
			public void clickActionInManageContact() {
				action.click();
				
			}
			public void enterPhoneNumberInmanageContactMethod(String phone) {
				phonefield.clear();
				phonefield.sendKeys(phone);
				
				
			}
			public void enterAddressInmanageContactMethod(String address) {
				addressfield.clear();
				addressfield.sendKeys(address);
				
				
			}
			public void enterEmailInmanageContactMethod(String email) {
				emailfield.clear();
				emailfield.sendKeys(email);
				
				
			}
			public void clickManageContactUpdateButton() {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", update);
//				update.click();
				
			}
			
			public boolean isAlertDisplayed() {
				return alert.isDisplayed();
				
			}
	}

