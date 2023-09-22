package org.pojogreens;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensSeleniumCourseCont extends BaseClass{
	
	public GreensSeleniumCourseCont() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement seleniumCourseCont;
	@FindBy(xpath="(//p[contains(text(),'Velmurugan Prabhakar')])[1]")
	private WebElement firstReview;	
	
	public WebElement getSeleniumCourseCont() {
		return seleniumCourseCont;
	}
	public WebElement getFirstReview() {
		return firstReview;
	}
	

}
