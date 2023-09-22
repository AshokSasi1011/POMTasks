package org.pojogreens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon {
	
	@FindBy(xpath="(//div[contains(text(),'Bhawna Collection')])[1]")
	private WebElement mobilesTab;
	@FindBy(xpath="//span[text()='add to cart']")
	private WebElement simCards;
	public WebElement getMobilesTab() {
		return mobilesTab;
	}
	public WebElement getSimCards() {
		return simCards;
	}

	
	
	

}
