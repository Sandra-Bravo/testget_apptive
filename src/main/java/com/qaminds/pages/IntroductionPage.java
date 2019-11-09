package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage {
	
	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String titleIntroductionId = "section_label";
	
	public boolean getTitleIntroduction() {
		System.out.println("get in titleIntroduction");
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductionId);
		System.out.println("get in titleIntroduction2");
		return titleIntroduction.isDisplayed();
	}

}
