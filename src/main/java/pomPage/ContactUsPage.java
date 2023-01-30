package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

		//Declaration
	
	@FindBy(xpath="//img[contains(@src,'contactus')]")
	private WebElement contactUsImage;
	
	@FindBy(name="name")
	private WebElement fullNameTF;
	
	@FindBy(name="sender")
	private WebElement emailTF;
	
	@FindBy(name="subject")
	private WebElement subjectTF;
	
	@FindBy(name="message")
	private WebElement messageArea;
	
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	//Initilization
	
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getHeaderImage() {
		return contactUsImage;
	}
	
	public void SetContactDetails(String name, String email,String subject,String message) {
		fullNameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageArea.sendKeys(message);
	}
	
	public void clicksendUsMailButton() {
		sendUsMailButton.click();
	}
	
}
