package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	LogoutPage logoutpage;
	ManageFooterTextPage managefootertextpage;

	@Test(priority = 1,description = "Verify admin user is able to update footer text successfully")
	public void manageFooterTextMethod() throws IOException {
		String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//		     loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

		String address = ExcelUtility.readStringData(1, 0, "ManageFooterText");

//			ManageFooterTextPage managefootertextpage=new ManageFooterTextPage(driver);
		managefootertextpage = logoutpage.clickManageFooterTextMoreInfo();
		managefootertextpage.clickActionInManageFooter().enterAddressInmanageFooterMethod(address)
				.clickManageFooterUpdateButton();
//			managefootertextpage.enterAddressInmanageFooterMethod(address);
//			managefootertextpage.clickManageFooterUpdateButton();
//				
		boolean alert = managefootertextpage.isAlertDisplayed();
		Assert.assertTrue(alert,Constant.MANAGEFOOTERTEXT_ERROR_MESSAGE);

	}

}
