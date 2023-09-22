package org.pojogreens;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensCourseTab extends BaseClass{
	
	public GreensCourseTab() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement courseTab;
	@FindBy(xpath="(//button[@class='close'])[4]")
	private WebElement closeMsg;
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement javaTrngButton;	
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement coreJavaTrngButton;
	@FindBy(xpath="//p[contains(text(),'I was looking')]")
	private WebElement anithaReview;
	
	public WebElement getCourseTab() {
		return courseTab;
	}
	public WebElement getJavaTrngButton() {
		return javaTrngButton;
	}
	public WebElement getCoreJavaTrngButton() {
		return coreJavaTrngButton;
	}
	public WebElement getAnithaReview() {
		return anithaReview;
	}
	public WebElement getCloseMsg() {
		return closeMsg;
	}

}
