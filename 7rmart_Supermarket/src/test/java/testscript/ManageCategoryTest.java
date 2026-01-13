package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	LogoutPage logoutpage;
	ManageCategoryPage managecategorypage;

	@Test(priority = 1,description = "Verify admin user is able to add a new category or view already existing category message")
	public void manageCategoryMethod() throws IOException {
		String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//			    loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

		String category_text = ExcelUtility.readStringData(1, 0, "ManageCategory");

//			ManageCategoryPage managecategoryspage=new ManageCategoryPage(driver);
		managecategorypage = logoutpage.clickManageCategoryMoreInfo();
		managecategorypage.clickNewButtonInManageCategory().enterCategoryInCategoryField(category_text)
				.clickSelectGroupsInManageCategory().selectFileUsingChooseFile().clickSaveButtonInmanageCategory();

//			managecategoryspage.enterCategoryInCategoryField(category_text);
//		    managecategoryspage.clickSelectGroupsInManageCategory();
//          managecategoryspage.selectFileUsingChooseFile();
//			managecategoryspage.clickSaveButtonInmanageCategory();

			boolean alert=managecategorypage.isAlertDisplayed();
			Assert.assertTrue(alert,Constant.MANAGECATEGORY_ERROR_MESSAGE);
		
	}
}
