package com.mmt.support;

public class FrameworkConstants {

	private static final String CHROMEDRIVER = System.getProperty("user.dir")+ "/src/test/resources/drivers/ChromeDriver 90.0.4430.24.exe";
	private static final String CONFIGPROPERTIES = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
	private static final String TESTDATA = System.getProperty("user.dir")+"/src/test/resources/data/testdata.xlsx";
	
	private static final int EXPLICITWAIT = 35;
	private static final int IMPLICITWAIT = 25;

	private static final String REVIEWBOOKINGPAGE = "ReviewBookingPage";
	private static final String HOMEPAGE = "HomePage";
	
	public static String getChromedriver() {
		return CHROMEDRIVER;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static int getImplicitwait() {
		return IMPLICITWAIT;
	}

	public static String getConfigproperties() {
		return CONFIGPROPERTIES;
	}

	public static String getTestdata() {
		return TESTDATA;
	}

	public static String getReviewbookingpage() {
		return REVIEWBOOKINGPAGE;
	}

	public static String getHomepage() {
		return HOMEPAGE;
	}	
}
