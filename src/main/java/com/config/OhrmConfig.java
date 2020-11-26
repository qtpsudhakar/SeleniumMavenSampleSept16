package com.config;

import com.report.ScreenshotPolicy;

public class OhrmConfig {

	public static final String APP_URL = "https://opensource-demo.orangehrmlive.com/";
	public static final boolean CREATE_BASE64 = true;
	public static final OpenBrowserFor OPENBROWSER = OpenBrowserFor.EVERYCLASS;
	public static final ScreenshotPolicy SCREEN_SHOT_POLICY = ScreenshotPolicy.TAKE_SCREENSHOTS_FOR_ONLY_FAIL;
	public static final String GRID_URL = "http://192.168.29.171:4444/wd/hub";
}
