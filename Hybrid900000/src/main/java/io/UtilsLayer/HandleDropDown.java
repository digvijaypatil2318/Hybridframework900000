package io.UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	
	 
	
	
	
	public void handleDropDown(WebElement Wb,String text) {
	   Select sel = new Select(Wb);
		sel.selectByValue(text);
	}
	
	
	
	public void countoptions(WebElement wb) {
		Select sel = new Select(wb);
		 List <WebElement>ls=sel.getOptions();
		 for(WebElement abc:ls)
		 {
			String a= abc.getText();
			System.out.println(a);
		 }
		
	}

}
