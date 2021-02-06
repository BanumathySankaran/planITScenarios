package PageObjects;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ElementUtil.ElementUtilOperations;

public class ContactPage extends ElementUtilOperations{
	static Logger logger = Logger.getLogger(ContactPage.class.getName());
	
	@FindBy(how = How.XPATH,using = "//span[@id='forename-err']")
	WebElement errorMsg1;
	
	@FindBy(how = How.XPATH,using = "//span[@id='email-err']")
	WebElement errorMsg2;
	
	@FindBy(how = How.XPATH,using = "//span[@id='message-err']")
	WebElement errorMsg3;
	
	@FindBy(how = How.ID,using = "forename")
	WebElement foreNameField;
	
	@FindBy(how = How.ID,using = "email")
	WebElement emailField;
	
	@FindBy(how = How.ID,using = "message")
	WebElement MessageField;
	
	@FindBy(how = How.XPATH,using = "//*[contains(text(),'Thanks')]")
	WebElement successSub;
	
	@FindBy(how = How.XPATH,using = "//*[contains(text(),'Submit')]")
	WebElement submitButton;
	
	public String errorMessage1 = "//span[@id='forename-err']";
	public String errorMessage2 = "//span[@id='email-err']";
	public String errorMessage3 = "//span[@id='message-err']";
	
	@FindBy(how = How.XPATH,using = "//*[contains(text(),'We welcome your')]")
	WebElement errorMsgForeName;
	
	@FindBy(how = How.XPATH,using = "//*[contains(text(),'enter a valid email')]")
	WebElement errorMsgValidEmail;
	
	@FindBy(how = How.XPATH,using = "//*[contains(text(),'Only provide your')]")
	WebElement clickOutSide;
	
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void errorMsgPopulated() throws InterruptedException {
		logger.info("check if error message is displayed");
		Assert.assertTrue(this.checkIfElemIsDisplayed(errorMsg1));
		Assert.assertTrue(this.checkIfElemIsDisplayed(errorMsg2));
		Assert.assertTrue(this.checkIfElemIsDisplayed(errorMsg3));
	}
	
	public void fillMandatoryFields() {
		logger.info("fill the Mandatory Fields");
		String foreName = generateRandom(7);
		this.foreNameField.sendKeys(foreName);
		String emailId = foreName.concat("@abc.com");
		this.emailField.sendKeys(emailId);
		String randMessage = foreName.substring(0, Math.min(foreName.length(), 16));
		this.MessageField.sendKeys(randMessage);
	}
	
	public void hitOnSubmit() throws Exception {
		logger.info("check if errors resolved");
		this.clickByJse(submitButton, "Click Submit");
	}
	
	public void errorResolvedSuccessfully() throws InterruptedException {
		logger.info("check if errors resolved");
		implicitWait(4);
		assertIfTheElementIsNotDisplayed(By.xpath(errorMessage1));
		logger.info("error Message 1 is not appearing");
		implicitWait(4);
		assertIfTheElementIsNotDisplayed(By.xpath(errorMessage2));
		logger.info("error Message 2 is not appearing");
		implicitWait(4);
		assertIfTheElementIsNotDisplayed(By.xpath(errorMessage3));
		logger.info("error Message 3 is not appearing");
		driver.quit();
	}
	
	public void checkIfSuccessfullySubmitted() throws InterruptedException {
		logger.info("check if the contact details are successfully submitted");
		implicitWait(18);
		Assert.assertTrue(checkIfElemIsDisplayed(successSub));
		driver.quit();
	}
	
	public void fillTheContactsPageWithInvalidData() throws Exception {
		logger.info("Fill contact page with invalid details");
		int int_random = ThreadLocalRandom.current().nextInt();
		foreNameField.sendKeys(String.valueOf(int_random));
		clickByJse(emailField, "email Field");
		implicitWait(4);	
		String incorrEmail = generateRandom(5);
		emailField.sendKeys(incorrEmail);
		implicitWait(6);
		clickOnElement(clickOutSide);
	}
	
	public void errorMsgsAfterfillingInvDta() {
		implicitWait(6);
		Assert.assertTrue(this.checkIfElementIsDisplayed(errorMsgForeName));
		Assert.assertTrue(this.checkIfElementIsDisplayed(errorMsgValidEmail));
		logger.info("error messages are populated");
		driver.quit();
	}
}
