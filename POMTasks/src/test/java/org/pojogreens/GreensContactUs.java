package org.pojogreens;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensContactUs extends BaseClass{
	
	public GreensContactUs() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Contact Us'])[1]")
	private WebElement contactUs;
	@FindBy(xpath="(//button[@class='close'])[2]")
	private WebElement closeMsg;
	@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
	private WebElement chennaiBranches;
	@FindBy(xpath="//p[contains(text(),'Copyright © 2023')]")
	private WebElement allRights;
	
	
	public WebElement getContactUs() {
		return contactUs;
	}
	public WebElement getChennaiBranches() {
		return chennaiBranches;
	}
	public WebElement getCloseMsg() {
		return closeMsg;
	}
	public WebElement getAllRights() {
		return allRights;
	}
	

}
