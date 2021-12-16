package io.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.BaseLayer.BaseClass;
import io.PageLayer.LoginPage;
import io.UtilsLayer.ExcelReader;
import io.UtilsLayer.screenshot;

public class LoginPageTest extends BaseClass {
	LoginPage obj;

	@BeforeMethod
	public void setUp() {
		BaseClass.initilization();
	}

	@Test   //(dataProvider = "Instagram") String username, String password
	public void validateLoginFunctionality() {
		obj = new LoginPage();
		obj.typeUserName(prop.getProperty("username"));
		obj.typePassword(prop.getProperty("password"));
		obj.loginBtnClick();
		// obj.loginBtnClick();
		
		screenshot obj = new screenshot();
		obj.getScreenShot();
	}

	/*@DataProvider(name = "Instagram")
	public Object[][] readdataFromExcel() {

		ExcelReader excelObj = new ExcelReader(
				"C:\\Users\\DELL\\eclipse-workspace\\Hybrid900000\\src\\main\\java\\io\\TestDataLayer\\instaSheet.xlsx");
		// System.getProperty("user.dir"+"/src/main/java/io/TestDataLayer/instaSheet.xlsx"));

		String data[][] = excelObj.getData(0);

		return data;
	}
*/
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
