package io.UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.BaseLayer.BaseClass;

public class screenshot extends BaseClass {
	
	
	public void getScreenShot() {
		TakesScreenshot screenshot= (TakesScreenshot)driver;
	File f=	screenshot.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(f, new File(System.getProperty("user.dir")+"\\Screenshot\\abc.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
