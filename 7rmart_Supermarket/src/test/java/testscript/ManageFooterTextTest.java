package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

	public class ManageFooterTextTest extends Base{
		@Test(priority=1)
		public void manageFooterTextMethod() throws IOException {
			 String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		     String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		     LoginPage loginpage = new LoginPage(driver);
		     loginpage.enterTheUsername(user);
		     loginpage.enterThePassword(pass);
		     loginpage.clickSignin();

			String address=ExcelUtility.readStringData(1,0,"ManageFooterText");
				
			ManageFooterTextPage managefootertextpage=new ManageFooterTextPage(driver);
			managefootertextpage.clickManageFooterTextMoreInfo();
			managefootertextpage.clickActionInManageFooter();
			managefootertextpage.enterAddressInmanageFooterMethod(address);
			managefootertextpage.clickManageFooterUpdateButton();;
				
			boolean alert=managefootertextpage.isAlertDisplayed();
			Assert.assertTrue(alert);
			
		}
		
	}
