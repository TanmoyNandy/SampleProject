package com.mmt.testdata.excel.pojo;

import java.util.HashMap;
import lombok.Getter;

@Getter
public class HomePageData {

	private String departureDate;
	
	public HomePageData(HashMap<String, String> data) {
		departureDate = data.get("DepartureDate");
	}
}
