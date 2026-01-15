package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	LogoutPage logoutpage;
	ManageContactPage managecontactpage;

	@Test(priority = 1, groups = { "regression" },description = "Verify admin user is able to update manage contact details successfully")
	public void manageContactMethod() throws IOException {
		String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(user).enterThePassword(pass);
//			     loginpage.enterThePassword(pass);
		logoutpage = loginpage.clickSignin();

		String phone = ExcelUtility.readIntegerData(1, 0, "ManageContact");
		String email = ExcelUtility.readStringData(1, 1, "ManageContact");
		String address = ExcelUtility.readStringData(1, 2, "ManageContact");
		String deivery_time = ExcelUtility.readIntegerData(1, 3, "ManageContact");
		String deivery_charge = ExcelUtility.readIntegerData(1, 4, "ManageContact");

//				ManageContactPage managecontactpage=new ManageContactPage(driver);
		managecontactpage = logoutpage.clickManageContactMoreInfo();
		managecontactpage.clickActionInManageContact().enterPhoneNumberInmanageContactMethod(phone)
				.enterEmailInmanageContactMethod(email).enterAddressInmanageContactMethod(address).enterDeliveryTimeInmanageContactMethod(deivery_time).enterDeliveryChargeLimitInmanageContactMethod(deivery_charge)
				.clickManageContactUpdateButton();
//				managecontactpage.enterPhoneNumberInmanageContactMethod(phone);
//				managecontactpage.enterEmailInmanageContactMethod(email);
//				managecontactpage.enterAddressInmanageContactMethod(address);
//				managecontactpage.clickManageContactUpdateButton();

		boolean alert = managecontactpage.isAlertDisplayed();
		Assert.assertTrue(alert,Constant.MANAGECONTACT_ERROR_MESSAGE);

	}

}
