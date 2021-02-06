package PageObjects;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ElementUtil.ElementUtilOperations;

public class CartPage extends ElementUtilOperations {
	static Logger logger = Logger.getLogger(CartPage.class.getName());
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using ="(//*[contains(@class,'cart-item')]/child::*)[3]")
	WebElement itemInCart;
	
	@FindBy(how = How.XPATH, using ="(//*[contains(@class,'cart-item')]/child::*)[5]/child::*[@value]")
	WebElement quantityOfItem;
	
	public void checkIfItemsDisplayedInCart() throws InterruptedException {
		Thread.sleep(8000);
		logger.info("checking if item is in cart");
		Assert.assertTrue(this.checkIfElementIsDisplayed(itemInCart));
		String textInItem = fetchTextValFromElement(itemInCart);
		logger.info("item is: " + textInItem);
		Assert.assertTrue(this.checkIfElementIsDisplayed(quantityOfItem));
		String textInQuantityOFItem = fetchTextValFromElement(quantityOfItem);
		logger.info("Quantity of item is displayed " + textInQuantityOFItem);
	}
}
