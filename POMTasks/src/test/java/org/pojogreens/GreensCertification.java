package org.pojogreens;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensCertification extends BaseClass {
	
	public GreensCertification() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certifications;
	@FindBy(xpath="//button[@class='close']")
	private WebElement closeMsg;
	
	public WebElement getCertifications() {
		return certifications;
	}
	
	public WebElement getCloseMsg() {
		return closeMsg;
	}

}
