package io.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	  
	public static Properties prop;
    public static FileInputStream fis;
    public static WebDriver driver;
	
	
	
	public BaseClass() {
		prop = new Properties();
		
		 
		try {
			
			 fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Hybrid900000\\src\\main\\java\\io\\ConfigLayer\\Info.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}		
		
		
		
		public static void initilization() {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
		   // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    //driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		    driver.get(prop.getProperty("url"));
		    driver.manage().window().maximize();
		    
		    
		    
		    
		    
			
		}
		
	}


