package com.mmt.testdata.excel.pojo;

import java.util.HashMap;

import lombok.Getter;

@Getter
public class ReviewBookingPageData {

	private String reviewBooking;
	
	public ReviewBookingPageData(HashMap<String, String> data) {
		reviewBooking = data.get("ReviewBooking");
	}
}
