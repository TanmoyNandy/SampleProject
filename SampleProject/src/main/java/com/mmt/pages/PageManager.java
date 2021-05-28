package com.mmt.pages;

/*
 * This is an implementation of Singleton design pattern
 * This class will create an instance of a class only if it does not exist
 * This will ensure uncessary creation of multiple objects and incorrect pointing to objects at runtime 
 */
public class PageManager {

	//private constructor to prevent creation of object of this class (PageManager)
	private PageManager() {}
	
	private static PageManager pageManager;
	
	HomePage homePage;
	ReviewBookingPage reviewBookingPage;
	FlightSelectionPage flightSelectionPage;
	
	public static PageManager getInstance() {
		return (pageManager==null) ? new PageManager() : pageManager; 
	}
	
	public HomePage getHomePage() {
		return (homePage == null) ? new HomePage() : homePage;
	}
	
	public FlightSelectionPage getFlightSelectionPage() {
		return (flightSelectionPage == null) ? new FlightSelectionPage() : flightSelectionPage;
	}
	
	public ReviewBookingPage getReviewBookingPage() {
		return (reviewBookingPage == null) ? new ReviewBookingPage() : reviewBookingPage;
	}
}
