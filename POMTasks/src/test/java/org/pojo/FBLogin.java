package org.pojo;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogin extends BaseClass{
	
	public FBLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(id="pass")
	private WebElement passWord;
	@FindBy(name="login")
	private WebElement clickLogin;
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getClickLogin() {
		return clickLogin;
	}
}
