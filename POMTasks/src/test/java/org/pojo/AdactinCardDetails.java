package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinCardDetails extends BaseClass {
	
	public AdactinCardDetails() {
		PageFactory.initElements(driver, this);
	}
	
	//card details page
		@FindBy(id="first_name")
		private WebElement firstName;
		@FindBy(id="last_name")
		private WebElement lastName;
		@FindBy(id="address")
		private WebElement billingAddress;
		@FindBy(id="cc_num")
		private WebElement CCNo;
		@FindBy(id="cc_type")
		private WebElement CCType;
		@FindBy(id="cc_exp_month")
		private WebElement expMonth;
		@FindBy(id="cc_exp_year")
		private WebElement expYear;
		@FindBy(id="cc_cvv")
		private WebElement CVVNumber;
		@FindBy(id="book_now")
		private WebElement bookNow;
		
		//getters
		public WebElement getFirstName() {
			return firstName;
		}
		public WebElement getLastName() {
			return lastName;
		}
		public WebElement getBillingAddress() {
			return billingAddress;
		}
		public WebElement getCCNo() {
			return CCNo;
		}
		public WebElement getCCType() {
			return CCType;
		}
		public WebElement getExpMonth() {
			return expMonth;
		}
		public WebElement getExpYear() {
			return expYear;
		}
		public WebElement getCVVNumber() {
			return CVVNumber;
		}
		public WebElement getBookNow() {
			return bookNow;
		}
		

}
