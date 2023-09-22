package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinConfirmPackage extends BaseClass{
	
	public AdactinConfirmPackage() {
		PageFactory.initElements(driver, this);
	}
	
	//confirm page radio button
	@FindBy(id="radiobutton_0")
	private WebElement confirmPackage;
	@FindBy(id="continue")
	private WebElement continueNext;
	
	public WebElement getConfirmPackage() {
		return confirmPackage;
	}
	public WebElement getContinueNext() {
		return continueNext;
	}	

}
