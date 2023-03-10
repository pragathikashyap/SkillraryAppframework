package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPage.ContactUsPage;
import pomPage.CoreJavaDemoVideoPage;
import pomPage.CoreJavaSeleniumPage;
import pomPage.SeleniumTrainingPage;
import pomPage.SkillraryDemoAppPage;
import pomPage.SkillraryHomePage;
import pomPage.testingPage;

public class BaseClass {
	protected PropertiesFileUtility property;
	protected ExcelFileUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected SkillraryHomePage home;
	protected SkillraryDemoAppPage demoApp;
	protected ContactUsPage contact;
	protected SeleniumTrainingPage selenium;
	protected testingPage testing;
	protected CoreJavaSeleniumPage coreJava;
	protected CoreJavaDemoVideoPage javaDemo;
	
		//@BeforeSuite
		//@BeforeTest
		@BeforeClass
		public void classSetup() {
			 property= new PropertiesFileUtility();
			 excel = new ExcelFileUtility();
			 web = new WebDriverUtility();
			 
			 property.propertiesInitialization(IConstantPath.PROPERTY_FILE_PATH);
			 String browser = property.fetchProperty("browser");
			 String url=property.fetchProperty("url");
			 long time = Long.parseLong(property.fetchProperty("timeouts"));
			 
			driver = web.openApplication(browser, url, time);
			home = new SkillraryHomePage(driver);
			Assert.assertTrue(home.getlogo().isDisplayed());
		}
		
		@BeforeMethod
		public void methodSetup() {
			excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
			demoApp = new SkillraryDemoAppPage(driver);
			contact = new ContactUsPage(driver);
			selenium = new SeleniumTrainingPage(driver);
			testing=new testingPage(driver);
			coreJava= new CoreJavaSeleniumPage(driver);
			javaDemo= new CoreJavaDemoVideoPage(driver);
		}
		
		@AfterMethod
		public void methodTearDown() {
			excel.closeWorkbook();
		}
		
		@AfterClass
		public void classTearDown() {
			web.quitBrowser();
		}
		
		//@AfterTest
		//@AfterSuite
}
