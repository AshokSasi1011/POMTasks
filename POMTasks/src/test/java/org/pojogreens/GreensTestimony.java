package org.pojogreens;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensTestimony extends BaseClass{
	
	public GreensTestimony() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testimonyTab;
	@FindBy(xpath="//div[contains(text(),'I learned QTP')]")
	private WebElement lastReview;
	
	public WebElement getTestimonyTab() {
		return testimonyTab;
	}

	public WebElement getLastReview() {
		return lastReview;
	}
	
	
}
