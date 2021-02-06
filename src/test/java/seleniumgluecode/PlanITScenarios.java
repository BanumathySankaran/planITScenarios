package seleniumgluecode;

import cucumber.api.java.en.When;
import ElementUtil.ElementUtilOperations;
import PageObjects.CartPage;
import PageObjects.ContactPage;
import PageObjects.ShopsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PlanITScenarios extends ElementUtilOperations{

	ContactPage contactPg;
	ShopsPage shopsPage;
	CartPage cartPage;

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		contactPg = new ContactPage(driver);
		contactPg.hitOnSubmit();
	}

	@And("^validate the errors$")
	public void validate_the_errors() throws Throwable {
		contactPg.errorMsgPopulated();
	}

	@Then("^populate Mandatory fields$")
	public void populate_Mandatory_fields() throws Throwable {
		contactPg.fillMandatoryFields();	
	}

	@Then("^resolve the errors$")
	public void resolve_the_errors() throws Throwable {
		contactPg.errorResolvedSuccessfully();
	}

	@When("^Fill up all the mandatory fields with the correct details$")
	public void fill_up_all_the_mandatory_fields_with_the_correct_details() throws Throwable {
		contactPg = new ContactPage(driver);
		contactPg.fillMandatoryFields();
	}

	@When("^Submit the details$")
	public void submit_the_details() throws Throwable {
		contactPg.hitOnSubmit();
	}

	@Then("^a valid message successful submission message is displayed$")
	public void a_valid_message_successful_submission_message_is_displayed() throws Throwable {
		contactPg.checkIfSuccessfullySubmitted();
	}

	@When("^fill up the contacts page with invalid data$")
	public void fill_up_the_contacts_page_with_invalid_data() throws Throwable {
		contactPg = new ContactPage(driver);
		contactPg.fillTheContactsPageWithInvalidData();
	}

	@Then("^error messages should be seen$")
	public void error_messages_should_be_seen() throws Throwable {
		contactPg.errorMsgsAfterfillingInvDta();
	}

	@When("^click on buy button (\\d+) on \"([^\"]*)\"$")
	public void click_on_buy_button_on(int arg1, String arg2) throws Throwable {
		shopsPage = new ShopsPage(driver);
		shopsPage.clickOnBuyBtn(arg1, arg2);
	}

	@When("^click on the cart menu$")
	public void click_on_the_cart_menu() throws Throwable {
		shopsPage.clickOnCartMenu();
	}

	@Then("^the items selected are displayed in the cart$")
	public void the_items_selected_are_displayed_in_the_cart() throws Throwable {
		cartPage = new CartPage(driver);
		cartPage.checkIfItemsDisplayedInCart();
		driver.quit();
	}

}
