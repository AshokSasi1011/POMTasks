package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPrintOrderNo extends BaseClass{
	
	public AdactinPrintOrderNo () {
		PageFactory.initElements(driver, this);
	}
	
	//printing order number
	@FindBy(id="order_no")
	private WebElement orderNumber;

	public WebElement getOrderNumber() {
		return orderNumber;
	}

}
