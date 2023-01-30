package testScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FourthTest extends BaseClass {
		
	@Test
	public void fourthTest() {
		
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillRaryDemoAppLink();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getpageHeader().isDisplayed());
		web.scrollTillElement(demoApp.getContactUsLink());
		demoApp.clickcontactUsLink();
		
		soft.assertTrue(contact.getHeaderImage().isDisplayed());
		
		List<String> list = excel.fetchDataFromExcel("TestData");
		contact.SetContactDetails(list.get(0), list.get(1),list.get(2),list.get(3));
		contact.clicksendUsMailButton();
	}
}
