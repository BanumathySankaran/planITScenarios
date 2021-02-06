package PageObjects;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ElementUtil.ElementUtilOperations;

public class ShopsPage extends ElementUtilOperations{
	static Logger logger = Logger.getLogger(ShopsPage.class.getName());
	
	public ShopsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(),'Teddy Bear')]")
	WebElement shopsPageVerify;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(),'Cart')]")
	WebElement cart;
	

	
	
	public void checkIfOnShopsPage() {
		Assert.assertTrue(checkIfElementIsDisplayed(shopsPageVerify));
	}

	public void clickOnBuyBtn(int noOFTimes,String item) {
		logger.info("click On buy");
		String buyXpath = "(//*[contains(text(),'"+item.trim()+"')]/parent::*/child::*)[3]/child::*/following-sibling::*";
		WebElement buyEle = driver.findElement(By.xpath(buyXpath));
		for(int i=0;i<noOFTimes;i++) {
		implicitWait(4);
		clickOnElement(buyEle);		
		}
	}
	
	public void clickOnCartMenu() {
		logger.info("click On cart");
		clickOnElement(cart);
	}
	

}
