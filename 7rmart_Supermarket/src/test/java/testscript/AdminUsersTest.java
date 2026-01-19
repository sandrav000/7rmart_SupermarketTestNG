package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constant.Constant;
import pages.AdminUsersPage;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	LogoutPage logoutpage;
	AdminUsersPage adminuserspage;

	@Test(priority = 1, retryAnalyzer = retry.Retry.class, description = "Verify admin is able to add a new user or view already existing user alert")
	public void adminUsersMethod() throws IOException {
		String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//			     loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

//			 String uname = ExcelUtility.readStringData(1, 0, "AdminUsers");
//			 String pwd = ExcelUtility.readStringData(1, 1, "AdminUsers");

		FakerUtility fakerutility = new FakerUtility();// FakerUtility or RandomUtility
		String uname = fakerutility.creatARandomFirstName();
		String pwd = fakerutility.creatARandomFirstName();

//			    AdminUsersPage adminuserspage=new AdminUsersPage(driver);
		adminuserspage = logoutpage.clickAdminUsersMoreInfo();
		adminuserspage.clickNewButtonInAdminUsersPage().enterTheUsernameOfAdminUsers(uname)
				.enterThePasswordOfAdminUsers(pwd).selectDropdownOfAdminUsers().clickSaveButtonInAdminUsers();
//			    adminuserspage.enterTheUsernameOfAdminUsers(uname);
//			    adminuserspage.enterThePasswordOfAdminUsers(pwd);
//			    adminuserspage.selectDropdownOfAdminUsers();
//			    adminuserspage.clickSaveButtonInAdminUsers();

		boolean alert = adminuserspage.isSuccessAlertDisplayed();
		Assert.assertTrue(alert, Constant.ADMINUSERS_ERROR_MESSAGE);

	}
}
