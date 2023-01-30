package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass {

		@Test
		public void thirdTest() throws InterruptedException {
			
			SoftAssert soft = new SoftAssert();
			
			home.searchCourse("Core java for Selenium");
			soft.assertTrue(coreJava.getpageHeader().isDisplayed());
			coreJava.clickcoreJavaLink();
			
			soft.assertTrue(javaDemo.getpageHeader().isDisplayed());
			web.switchToFrame(0);
			javaDemo.clickplayButton();
			Thread.sleep(4000);
			javaDemo.clickpauseButton();
			javaDemo.clickAddToWishListButton();
			
			soft.assertAll();
		}
}
