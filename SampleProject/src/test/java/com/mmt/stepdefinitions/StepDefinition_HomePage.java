package com.mmt.stepdefinitions;

import static com.mmt.support.FrameworkConstants.getHomepage;

import java.util.List;
import java.util.Map;

import com.mmt.config.utils.ConfigProperties;
import com.mmt.config.utils.PropertyUtils;
import com.mmt.drivers.DriverManager;
import com.mmt.drivers.Drivers;
import com.mmt.pages.HomePage;
import com.mmt.pages.PageManager;
import com.mmt.testdata.excel.ExcelUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition_HomePage {

	HomePage homePage;
	
	
	@Before
	public void setup() {
		Drivers.initializeDriver();
	}
	
	@After
	public void tearDown() {		
		Drivers.quitDrivers();
	}
	
	//The URL of MakeMyTrip website is retrieved from the properties file
	@Given("I navigate to the MakemyTrip Website")
	public void i_navigate_to() {
		String makemytripUrl = PropertyUtils.get(ConfigProperties.URL);
	    DriverManager.getDriver().get(makemytripUrl);
	}

	@When("I click on flights")
	public void i_click_on_flights() {
	    homePage = PageManager.getInstance().getHomePage();
	    homePage.selectFlight();
	}

	@When("I select One Way Trip")
	public void i_select_one_way_trip() {
	    homePage.selectOneWayTrip();
	}

	//This data is fetched from Cucumber datatable
	@When("I choose <source> and <destination> location")
	public void i_choose_source_and_destination_location(List<Map<String, String>> location) {
	    String source = location.get(0).get("source");
	    String dest = location.get(0).get("destination");
	    	    
	    homePage.chooseSourceAndDestinationCities(source, dest);
	}

	//Fetching the testdata from Excel - demonstrating the usage of excel to maintain testdata
	@When("I choose departure date")
	public void i_choose_departure_date() throws InterruptedException {
	    homePage.choosedate(ExcelUtil.readDataFromExcel(getHomepage()));
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
	    homePage.clickOnSearch();
	}

	
}
