package org.pojogreens;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensCareer extends BaseClass{
	
	public GreensCareer() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class='close'])[10]")
	private WebElement closeMsg;
	@FindBy(xpath="(//li[@id='menu-item-4141'])[2]")
	private WebElement careersTab;	
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[16]")
	private WebElement emailIdAtLast;
	
	public WebElement getCloseMsg() {
		return closeMsg;
	}
	
	public WebElement getCareersTab() {
		return careersTab;
	}

	public WebElement getEmailIdAtLast() {
		return emailIdAtLast;
	}
	
	
}
