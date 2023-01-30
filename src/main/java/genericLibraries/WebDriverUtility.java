package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * This class contains reusable method to perform all web driver actions
 * @author HP
 *
 */
public class WebDriverUtility {
	WebDriver driver;
	
	/**
	 * this method is used to launch browser and navigate to application
	 * @param browser
	 * @param url
	 * @param time
	 * @return
	 */
	
	public WebDriver openApplication(String browser, String url, long time) {
	
		switch(browser) {
		
		case "chrome" : driver = new ChromeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		default : System.out.println("invalid browser information"); break;
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		return driver;
		
		/**
		 * this method is used to mouse hover on certain element
		 */
	}
	public void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * this method is used to double click on particular element
	 * @param element
	 */
	
	public void doubleClickOnElement(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	/**
	 * this method is used to drag and drop an element to required location
	 * @param source
	 * @param target
	 */
	
	public void dragAndDropElement(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
	}
	
	/**
	 * this method is used to select an element from dropdown using index
	 * @param index
	 * @param element
	 */
	
	public void dropDownElement(int index, WebElement element) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * this method is used to select an element from dropdown using value
	 * @param value
	 * @param element
	 */
	public void dropDown(int value, WebElement element) {
		Select s = new Select(element);
		s.selectByIndex(value);
	}
	
	/**
	 * this method handles child browser pop up
	 */
	
	public void handleChildBrowser() {
		Set<String> windows = driver.getWindowHandles();
		for(String id : windows) {
			driver.switchTo().window(id);
		}
	}
	
	/**
	 * this method is used to switch to a frame based on frame index
	 */
	
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * this method is used to switch back to from frame
	 */
	
	
	public void switchBackFromFrame() {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * this method handles alert pop up
	 * @param element
	 */
	
	
	public void handleAlert() {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * this method is used to scroll till particular element on web page
	 * @param path
	 */
	
	public void scrollTillElement(Object element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	/**
	 * this methods is used to fetch the screen shot of particular web page
	 */
	
	
	public void screenshot() {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Scrrenshot/"+ driver.getTitle()+ ".png");
		try {
			FileUtils.copyFile(src, dest);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * this method is used to close the current browser
	 */
	
	public void closeCurrentWindow() {
		driver.close();
	}
	/**
	 * this method is used to quit the browser
	 */
	
	public void quitBrowser() {
		driver.quit();
	}
}
