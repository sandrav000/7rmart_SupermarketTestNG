package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test(priority=1)
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {
//		String user="admin";
//		String pass="admin";
		String user=ExcelUtility.readStringData(1,0,"LoginPage");
		String pass=ExcelUtility.readStringData(1,1,"LoginPage");
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(pass);
		loginpage.clickSignin();
		
		boolean homepage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage);
		
	}
	@Test(priority=2)
	public void verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException {
//		String user="admin";
//		String pass="admin@123";
		
		String user=ExcelUtility.readStringData(2,0,"LoginPage");
		String pass=ExcelUtility.readStringData(2,1,"LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(pass);
		loginpage.clickSignin();
		
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	@Test(priority=3)
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() throws IOException {
//		String user="admin#1234";
//		String pass="admin";
		String user=ExcelUtility.readStringData(3,0,"LoginPage");
		String pass=ExcelUtility.readStringData(3,1,"LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(pass);
		loginpage.clickSignin();
		
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	@Test(priority=4)
	public void verifyTheUserIsAbleToLoginUsingInValidCredentials() throws IOException {
//		String user="ad@123";
//		String pass="ad#123";
		String user=ExcelUtility.readStringData(4,0,"LoginPage");
		String pass=ExcelUtility.readStringData(4,1,"LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(user);
		loginpage.enterThePassword(pass);
		loginpage.clickSignin();
		
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
		
	}

}
