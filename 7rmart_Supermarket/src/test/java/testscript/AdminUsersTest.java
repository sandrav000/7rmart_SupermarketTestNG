package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base{
	@Test(priority=1,retryAnalyzer=retry.Retry.class)
	public void adminUsersMethod() throws IOException {
			String user = ExcelUtility.readStringData(1, 0, "LoginPage");
			String pass = ExcelUtility.readStringData(1, 1, "LoginPage");

			     LoginPage loginpage = new LoginPage(driver);
			     loginpage.enterTheUsername(user);
			     loginpage.enterThePassword(pass);
			     loginpage.clickSignin();

//			 String uname = ExcelUtility.readStringData(1, 0, "AdminUsers");
//			 String pwd = ExcelUtility.readStringData(1, 1, "AdminUsers");
			    
			    FakerUtility fakerutility=new FakerUtility();//FakerUtility or RandomUtility
				String uname=fakerutility.creatARandomFirstName();
				String pwd=fakerutility.creatARandomFirstName();
				
			    AdminUsersPage adminuserspage=new AdminUsersPage(driver);
			    adminuserspage.clickAdminUsersMoreInfo();
			    adminuserspage.clickNewButtonInAdminUsersPage();
			    adminuserspage.enterTheUsernameOfAdminUsers(uname);
			    adminuserspage.enterThePasswordOfAdminUsers(pwd);
			    adminuserspage.selectDropdownOfAdminUsers();
			    adminuserspage.clickSaveButtonInAdminUsers();
			    
			    boolean alert=adminuserspage.isSuccessAlertDisplayed();
				Assert.assertTrue(alert);		    

				
	}
}	
				
			


