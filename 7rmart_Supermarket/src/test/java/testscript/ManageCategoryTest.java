package testscript;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

	public class ManageCategoryTest extends Base{
			@Test(priority=1)
		public void manageCategoryMethod() throws IOException {
			String user = ExcelUtility.readStringData(1, 0, "LoginPage");
			String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

			    LoginPage loginpage = new LoginPage(driver);
			    loginpage.enterTheUsername(user);
			    loginpage.enterThePassword(pass);
			    loginpage.clickSignin();

			String category_text=ExcelUtility.readStringData(1,0,"ManageCategory");
					
			ManageCategoryPage managecategoryspage=new ManageCategoryPage(driver);
			managecategoryspage.clickManageCategoryMoreInfo();
			managecategoryspage.clickNewButtonInManageCategory();
			managecategoryspage.enterCategoryInCategoryField(category_text);
			managecategoryspage.selectFileUsingChooseFile();
			managecategoryspage.clickSaveButtonInmanageCategory();
			
					
//				boolean alert=managenewspage.isAlertDisplayed();
//				Assert.assertTrue(alert);
//				
			}
			
		}

