package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaSeleniumPage {

		//Declaration
	@FindBy(xpath="//h2[text()='core java for selenium']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement coreJavaLink;
	
	//Initialization
	public CoreJavaSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getpageHeader() {
		return pageHeader;
	}
	
	public void clickcoreJavaLink() {
		coreJavaLink.click();
	}
}
