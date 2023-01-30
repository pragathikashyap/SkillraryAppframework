package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaDemoVideoPage {
	//Declaration
	@FindBy(xpath="//h1[text()='Core Java For Selenium Training']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playButton;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pauseButton;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement AddToWishListButton;


	//Initialization
	public CoreJavaDemoVideoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//Utilization
	
	public WebElement getpageHeader() {
		return pageHeader;
	}
	
	public void clickplayButton() {
		playButton.click();
	}
	
	public void clickpauseButton() {
		pauseButton.click();
	}
	
	public void clickAddToWishListButton() {
		AddToWishListButton.click();
	}
	
	}
