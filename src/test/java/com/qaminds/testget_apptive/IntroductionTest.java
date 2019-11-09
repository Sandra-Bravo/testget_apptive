package com.qaminds.testget_apptive;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaminds.pages.IntroductionPage;

public class IntroductionTest extends BaseTest {
	
	@Test
	public void validationTitleIntroduction() {
		//System.out.println("get inside validationTitle"+ myDriver);
		System.out.println("muestrame que sirves"+ getProperty("get_apptive"));
		System.out.println("get inside validationTitle" + myDriver);
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		Assert.assertTrue(introductionPage.getTitleIntroduction());
		
	}

}
