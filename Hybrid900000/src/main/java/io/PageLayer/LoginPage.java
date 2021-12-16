package io.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.BaseLayer.BaseClass;
import io.UtilsLayer.ActionsClassMethods;

public class LoginPage extends BaseClass {	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	
	
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void typeUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void typePassword(String pass) {
		password.sendKeys(pass);
	}
	
	
	public void loginBtnClick() {
		//loginbtn.click();
		ActionsClassMethods obj=new ActionsClassMethods();
		obj.clickByActions(loginbtn);
	}
}
