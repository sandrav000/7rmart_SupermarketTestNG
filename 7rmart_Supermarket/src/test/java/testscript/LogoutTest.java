package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base{
	@Test(priority=1)
	public void logoutMethod() throws IOException {
		String user=ExcelUtility.readStringData(1,0,"LoginPage");
		String pass=ExcelUtility.readStringData(1,1,"LoginPage");
						
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterTheUsername(user);
			loginpage.enterThePassword(pass);
			loginpage.clickSignin();
			
	
			LogoutPage logoutpage=new LogoutPage(driver);
			logoutpage.adminClick();
			logoutpage.logoutClick();
								
			boolean login_page=logoutpage.isLoginPageDisplayed();
			Assert.assertTrue(login_page);
			
		}
		

	}

