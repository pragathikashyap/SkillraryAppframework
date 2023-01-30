package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass {

		@Test
		public void firstTest() {
			SoftAssert soft = new SoftAssert();
			
			home.clickGearsTab();
			home.clickSkillRaryDemoAppLink();
			web.handleChildBrowser();
		soft.assertTrue(demoApp.getpageHeader().isDisplayed());
			demoApp.mouseHoverToCourseTab(web);
			demoApp.clickseleniumTrainingLink();
			soft.assertTrue(selenium.getpageHeader().isDisplayed());
			selenium.doubleClickplusButton(web);
			selenium.clickAddToCartButton();
			web.handleAlert();
			web.screenshot();
			soft.assertAll();
			
			
		}
}
