package com.mmt.stepdefinitions;

import com.mmt.pages.FlightSelectionPage;
import com.mmt.pages.PageManager;

import io.cucumber.java.en.When;

public class StepDefinition_FlightSelectionPage {

	FlightSelectionPage flightSelectionPage;
	
	@When("I view prices of first airline")
	public void i_view_prices_of_first_airline() {
		flightSelectionPage = PageManager.getInstance().getFlightSelectionPage();
		flightSelectionPage.viewPriceOfFirstFlight();
	}

	@When("I click on book now button")
	public void i_click_on_book_now_button() {
		flightSelectionPage.bookTheFlight();
	}
}
