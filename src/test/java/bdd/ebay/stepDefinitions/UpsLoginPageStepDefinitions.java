package bdd.ups.stepDefinitions;

import org.testng.Assert;
import bdd.ups.pageActions.UpsLoginPageActions;
import bdd.ups.utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpsLoginPageStepDefinitions {
	UpsLoginPageActions actions = new UpsLoginPageActions();

	@Given("Customer in UPS login page")
	public void customer_in_UPS_login_page() {
		actions.navigateToUpsLoginPage();
		actions.validateUpsLoginPage();
	}

	@When("Customer clicks on the Twitter link")
	public void customer_clicks_on_the_Twitter_link() {
		actions.clickTwitterExternalLink();
		Helper.getPageTitle();
	}

	@Then("A new popup windows should be available for Twitter login navigation")
	public void a_new_popup_windows_should_be_available_for_Twitter_login_navigation() {
//		Assert.assertTrue(actions.switchToTwitterWindow());
		Assert.assertTrue(actions.ValidateExternalLinks());
	}

}
