package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {

	//Declaration
	
	@FindBy(xpath="//a[contains(.,'-ECommerce')]")
	private WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//span[@class='wrappers']/descendant::a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	@FindBy(name="addresstype")
	private WebElement categoriesDropdown;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//Initialization
	
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getpageHeader() {
		return pageHeader;
	}
	
	public void mouseHoverToCourseTab(WebDriverUtility Web) {
		Web.mouseHover(courseTab);
	}
	
	public void clickseleniumTrainingLink() {
		seleniumTrainingLink.click();
	}
	
	public void selectCategory(WebDriverUtility Web, int index) {
		Web.dropDownElement(index, categoriesDropdown);
	}
	
	public WebElement getContactUsLink() {
		return contactUsLink;
	}
	
	public void clickcontactUsLink() {
		contactUsLink.click();
	}
	
}
