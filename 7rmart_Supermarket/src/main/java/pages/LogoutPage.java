package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage  {
		public WebDriver driver;
		
		@FindBy(xpath="//a[@class='nav-link' and @data-toggle='dropdown']")WebElement admin;//declare webelements
		@FindBy(xpath="//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
		@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
		
		
		public LogoutPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);//initElmets=static,initElements->initialize webelements
			// TODO Auto-generated constructor stub
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


