package seleniumgluecode;

import ElementUtil.ElementUtilOperations;
import PageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PlanIT_HomePageVerification extends ElementUtilOperations{
	
	ElementUtilOperations browserLaunching;
	HomePage homePagePlanIT;
	
	
	@Given("^I am on Home Page$")
	public void i_am_on_Home_Page() throws Throwable {
		super.finalize();
		browserLaunching = new ElementUtilOperations();
		browserLaunching.launchSite("firefox");
		homePagePlanIT = new HomePage(driver);
		homePagePlanIT.checkIfOnHomePage();
	}
	
	@When("^I navigate to \"([^\"]*)\" page$")
	public void i_navigate_to_respective_page(String pageType) throws Throwable {
		super.finalize();
		homePagePlanIT = new HomePage(driver);
		if(pageType.equalsIgnoreCase("contact")){
	    homePagePlanIT.navigateToContactPage();
		}else if(pageType.equalsIgnoreCase("shops")) {
			homePagePlanIT.navigateToShopsPage();
		}
	     
	}
}
