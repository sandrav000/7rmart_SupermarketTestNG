package constant;

public class Constant {
	public static final String TESTDATAFILE = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx";
	public static final String APPLE = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\pexels-mali-102104.jpg";
	public static final String LOGIN_VALIDCREDENTIALS = "Correct username and password entered, but home page did not navigate.";
	public static final String LOGIN_VALID_USERNAME_INVALID_PASSWORD = "Valid username with invalid password did not show the expected alert.";
	public static final String LOGIN_INVALID_USERNAME_VALID_PASSWORD = "Invalid username with valid password did not show the expected alert.";
	public static final String LOGIN_INVALID_CREDENTIALS = "Invalid username and invalid password did not show the expected alert.";
	public static final String ADMINUSERS_ERROR_MESSAGE = "Admin user was not added and no success alert displayed.";
	public static final String LOGOUT_ERROR_MESSAGE = "Logout failed: Login page is not displayed after logout.";
	public static final String MANAGECATEGORY_ERROR_MESSAGE = "Category was not added and no success or existing category message was displayed.";
	public static final String MANAGECONTACT_ERROR_MESSAGE = "Manage Contact update failed: Success alert not displayed.";
	public static final String MANAGEFOOTERTEXT_ERROR_MESSAGE = "Footer text update failed: Success alert not displayed.";
	public static final String MANAGENEWS_ERROR_MESSAGE = "Adding news failed: Success alert not displayed.";
	public static final String CONFIGFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";	
}

