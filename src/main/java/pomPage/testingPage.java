package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testingPage {

		//Declaration
	
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id="java")
	private WebElement JavaImage;
	
	@FindBy(id="mycart")
	private WebElement CartArea;
	
	@FindBy(xpath=("//ul[@class='list-socialicons']/descendant::i[@class='fa fa-facebook']"))
	private WebElement FacebookIcon;
	
	//Initialization
	
	public testingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	}
	
	//Utilization
	
	public WebElement getpageHeader() {
		return pageHeader;
	}
	
	public WebElement getJavaImage() {
		return JavaImage;
	}
	
	public WebElement getCartArea() {
		return CartArea;
		
	}
	
	public WebElement getFacebookIcon() {
		return FacebookIcon;
	}
	
	public void clickFacebookIcon() {
		FacebookIcon.click();
	}

}
	
	
	
	
