package com.mmt.stepdefinitions;

import org.junit.Assert;
import static com.mmt.support.FrameworkConstants.getReviewbookingpage;

import java.util.HashMap;

import com.mmt.pages.PageManager;
import com.mmt.pages.ReviewBookingPage;
import com.mmt.testdata.excel.ExcelUtil;
import com.mmt.testdata.excel.pojo.ReviewBookingPageData;

import io.cucumber.java.en.Then;

public class StepDefinition_ReviewBookingPage {

	ReviewBookingPage reviewBookingPage;

	//Fetching the testdata from Excel - demonstrating the usage of excel to maintain testdata
	@Then("I should see the booking page being opened")
	public void i_should_see_the_booking_page_being_opened() {
		reviewBookingPage = PageManager.getInstance().getReviewBookingPage();
		
		HashMap<String, String> expectedData = ExcelUtil.readDataFromExcel(getReviewbookingpage()); 
		ReviewBookingPageData rp = new ReviewBookingPageData(expectedData);
		
		Assert.assertEquals(rp.getReviewBooking(), reviewBookingPage.reviewBookingTextPresent());
	}
}
