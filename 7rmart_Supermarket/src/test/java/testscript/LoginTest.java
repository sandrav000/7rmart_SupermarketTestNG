package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	LogoutPage logoutpage;

	@Test(priority = 1, description = "Verify the user is able to Login with valid credentials")
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {
//		String user="admin";
//		String pass="admin";
		String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//		loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

		boolean homepage = loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage, Constant.LOGIN_VALIDCREDENTIALS);

	}

	@Test(priority = 2, description = "Verify the user is able to login with valid username and invalid password")
	public void verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException {
//		String user="admin";
//		String pass="admin@123";

		String user = ExcelUtility.readStringData(2, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(2, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//		loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert, Constant.LOGIN_VALID_USERNAME_INVALID_PASSWORD);
	}

	@Test(priority = 3, description = "Verify the user is able to login with invalid username and valid password")
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() throws IOException {
//		String user="admin#1234";
//		String pass="admin";
		String user = ExcelUtility.readStringData(3, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(3, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//		loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert, Constant.LOGIN_INVALID_USERNAME_VALID_PASSWORD);
	}

	@Test(priority = 4, description = "Verify the user is able to login using invalid username and invalid password")
	public void verifyTheUserIsAbleToLoginUsingInValidCredentials() throws IOException {
//		String user="ad@123";
//		String pass="ad#123";
		String user = ExcelUtility.readStringData(4, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(4, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//		loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert, Constant.LOGIN_INVALID_CREDENTIALS);

	}

}
