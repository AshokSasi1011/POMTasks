package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends BaseClass{
	
	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
	
	//Login page
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	@FindBy(id="login")	
	private WebElement loginUser;
	
	//getters	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginUser() {
		return loginUser;
	}

}
