package io.TestLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.UtilsLayer.ExcelReader;

public class ExcelReaderTest {

	@Test(dataProvider="Instagram")
	public void loginfunctionality(String username,String password) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(4000);
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	File f=	ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\DELL\\eclipse-workspace\\Hybrid900000\\Screenshot\\abc.png"));
	
}

	@DataProvider(name = "Instagram")
	public Object[][] testData() {
		ExcelReader obj = new ExcelReader(
				"C:\\Users\\DELL\\eclipse-workspace\\Hybrid900000\\src\\main\\java\\io\\TestDataLayer\\instaSheet.xlsx");
		int rows = obj.rowCount(0);
		Object[][] data = obj.getData(0);
		return data;

	}
}
