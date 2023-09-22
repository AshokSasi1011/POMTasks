package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinRegister extends BaseClass{	

	
	public AdactinRegister() {
		PageFactory.initElements(driver, this);
	}	
	
	//Register page
	@FindBy(xpath="//input[@id='username']")
	private WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passWord;
	@FindBy(xpath="//input[@id='re_password']")
	private WebElement confPassWord;
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement fullName;
	@FindBy(xpath="//input[@id='email_add']")
	private WebElement email;
	@FindBy(xpath="//input[@id='tnc_box']")
	private WebElement checkBox;
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement newUser;
	
	//getters
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getConfPassWord() {
		return confPassWord;
	}
	public WebElement getFullName() {
		return fullName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getNewUser() {
		return newUser;
	}	

}
