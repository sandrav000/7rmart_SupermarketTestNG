package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
		@Test(priority=1,groups= {"regression"})
	public void manageNewsMoreInfoMethod() throws IOException {
		String user = ExcelUtility.readStringData(1, 0, "LoginPage");
		String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

		    LoginPage loginpage = new LoginPage(driver);
		    loginpage.enterTheUsername(user);
		    loginpage.enterThePassword(pass);
		    loginpage.clickSignin();

		String text=ExcelUtility.readStringData(0,0,"ManageNews");
				
			ManageNewsPage managenewspage=new ManageNewsPage(driver);
			managenewspage.clickManageNewsMoreInfo();
			managenewspage.clickNewButtonInManageNewsMoreInfo();
			managenewspage.enterInputFieldInManageNewsMoreInfo(text);
			managenewspage.clickSaveButtonInmanageNewsMoreInfo();
				
			boolean alert=managenewspage.isAlertDisplayed();
			Assert.assertTrue(alert);
			
		}
		
	}