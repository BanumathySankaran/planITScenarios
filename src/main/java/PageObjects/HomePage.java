package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ElementUtil.ElementUtilOperations;

import java.util.List;
import java.util.logging.Logger;

public class HomePage extends ElementUtilOperations{
	static Logger logger = Logger.getLogger(HomePage.class.getName());
	@FindBy(how = How.XPATH, using  ="/html/body/div[2]/div/div/div[1]/h1")
	List<WebElement> homePpageTitle;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(),'Contact')]")
	WebElement contactLink;
	
	@FindBy(how = How.XPATH, using ="(//*[contains(text(),'Shop')])[1]")
	WebElement shopLink;
	

	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void checkIfOnHomePage() throws InterruptedException {
		implicitWait(5);
		this.assertIfElementIsDisplayed(homePpageTitle);
	}
	
	public void navigateToContactPage() throws InterruptedException {
		this.checkIfElementIsDisplayed(contactLink);
		this.clickOnElementUsingActions(contactLink);
	}
	
	public void navigateToShopsPage() throws InterruptedException {
		this.checkIfElementIsDisplayed(shopLink);
		this.clickOnElementUsingActions(shopLink);
	}
	
	

}
