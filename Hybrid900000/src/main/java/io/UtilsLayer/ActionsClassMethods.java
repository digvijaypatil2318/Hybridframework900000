package io.UtilsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.BaseLayer.BaseClass;

public class ActionsClassMethods extends BaseClass {
	Actions act;
	

	public void clickByActions(WebElement wb) {
		Actions act = new Actions(driver);
		act.click(wb).build().perform();	
	}
	
	
	public void doubleClick(WebElement wb) {
		act=new Actions(driver);
		act.doubleClick(wb).build().perform();
	}
	
	
	public void pageDownn() {
		
	}

}
