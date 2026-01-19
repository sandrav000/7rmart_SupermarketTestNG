package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	LogoutPage logoutpage;
	ManageNewsPage managenewspage;

	@Test(priority = 1, groups = {
			"regression" }, description = "Verify admin user is able to add a new news item successfully")
	public void manageNewsMoreInfoMethod() throws IOException {
		String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//		    loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

		String text = ExcelUtility.readStringData(0, 0, "ManageNews");

//			ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage = logoutpage.clickManageNewsMoreInfo();
		managenewspage.clickNewButtonInManageNewsMoreInfo().enterInputFieldInManageNewsMoreInfo(text)
				.clickSaveButtonInmanageNewsMoreInfo();
//			managenewspage.enterInputFieldInManageNewsMoreInfo(text);
//			managenewspage.clickSaveButtonInmanageNewsMoreInfo();

		boolean alert = managenewspage.isAlertDisplayed();
		Assert.assertTrue(alert, Constant.MANAGENEWS_ERROR_MESSAGE);

	}

}