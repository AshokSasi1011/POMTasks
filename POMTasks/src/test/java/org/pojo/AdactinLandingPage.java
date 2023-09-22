package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLandingPage extends BaseClass {
	
	public AdactinLandingPage() {
		PageFactory.initElements(driver, this);
	}
	//Landing page
	@FindBy(id="location")
	private WebElement selectLocation;
	@FindBy(id="hotels")
	private WebElement selectHotel;
	@FindBy(id="room_type")
	private WebElement selectRoomType;
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	@FindBy(id="Submit")
	private WebElement searchButton;
	
	//getters
	
	public WebElement getSelectLocation() {
		return selectLocation;
	}
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getSelectRoomType() {
		return selectRoomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}

}
