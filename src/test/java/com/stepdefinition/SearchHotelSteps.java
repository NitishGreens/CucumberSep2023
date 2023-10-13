package com.stepdefinition;

import com.libglobal.BaseClass;
import com.pages.AdactinSearchHotelPage;

import io.cucumber.java.en.*;

public class SearchHotelSteps extends BaseClass {

	@When("User select {string},{string},{string},{string},{string} and {string}")
	public void user_select_and(String location, String hotel, String roomType, String numberOfRooms,
			String adultsPerRoom, String childPerRoom) {
		AdactinSearchHotelPage searchHotelPage = new AdactinSearchHotelPage();
		selectOptionByText(searchHotelPage.getDdnLocation(), location);
		selectOptionByText(searchHotelPage.getDdnHotels(), hotel);
		selectOptionByText(searchHotelPage.getDdnRoomType(), roomType);
		selectOptionByText(searchHotelPage.getDdnNumberOfRooms(), numberOfRooms);
		selectOptionByText(searchHotelPage.getDdnAdultsPerRoom(), adultsPerRoom);
		selectOptionByText(searchHotelPage.getDdnChildrenPerRoom(), childPerRoom);

	}

	@When("User click on search Button")
	public void user_click_on_search_Button() {
		AdactinSearchHotelPage searchHotelPage = new AdactinSearchHotelPage();
		elementClick(searchHotelPage.getBtnSearch());
	}

}
