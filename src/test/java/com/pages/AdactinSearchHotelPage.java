package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.BaseClass;

public class AdactinSearchHotelPage extends BaseClass {

	public AdactinSearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement ddnLocation;

	@FindBy(id = "hotels")
	private WebElement ddnHotels;

	@FindBy(id = "room_type")
	private WebElement ddnRoomType;

	@FindBy(id = "room_nos")
	private WebElement ddnNumberOfRooms;

	@FindBy(id = "adult_room")
	private WebElement ddnAdultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement ddnChildrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement btnSearch;

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public WebElement getDdnHotels() {
		return ddnHotels;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getDdnNumberOfRooms() {
		return ddnNumberOfRooms;
	}

	public WebElement getDdnAdultsPerRoom() {
		return ddnAdultsPerRoom;
	}

	public WebElement getDdnChildrenPerRoom() {
		return ddnChildrenPerRoom;
	}

}
