package org.pojogreens;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensHomePage extends BaseClass {
	
	public GreensHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='close']")
	private WebElement closeMsg;
	@FindBy(xpath="//h1[contains(text(),'No 1 Software Training')]")		
	private WebElement printNo1;
	
	public WebElement getCloseMsg() {
		return closeMsg;
	}
	public WebElement getPrintNo1() {
		return printNo1;
	}
	

}
