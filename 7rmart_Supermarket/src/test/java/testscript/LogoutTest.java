package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	LogoutPage logoutpage;
	@Test(priority = 1,description="Verify admin user is able to logout successfully")
	public void logoutMethod() throws IOException {
		String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//		loginpage.enterThePassword(pass);
		logoutpage=loginpage.clickSignin();

		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.adminClick();
		logoutpage.logoutClick();

		boolean login_page = logoutpage.isLoginPageDisplayed();
		Assert.assertTrue(login_page,Constant.LOGOUT_ERROR_MESSAGE);

	}

}
