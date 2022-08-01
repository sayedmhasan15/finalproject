package bdd.ups.stepDefinitions;

import org.testng.Assert;

import bdd.ups.pageActions.UpsTrackingPackagePageActions;
import bdd.ups.utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpsTrackingPackageStepDefinitions {

	UpsTrackingPackagePageActions action = new UpsTrackingPackagePageActions();

	@Given("Customer in UPS tracking page")
	public void customer_in_UPS_tracking_page() {
		action.navigateToUpsTrackingPackagePage();
		action.validateUpsTrackingPackagePage();
	}

	@When("Customer gives an invalid tacking number {string} input")
	public void customer_gives_an_invalid_tacking_number_input(String trackingNumber) {
		action.inputTrackingNumber(trackingNumber);
	}

	@When("Customer clicks on the track button")
	public void customer_clicks_on_the_track_button() {
		action.clickTrackButton();
	}

	@Then("Customer should receive an error message {string}")
	public void customer_should_receive_an_error_message(String expectedErrorMsg) {
		String actualErrorMsg = action.getTrackingErrorMessage_1();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}

	@When("Customer gives a valid tracking number {string} input")
	public void customer_gives_a_valid_tracking_number_input(String trackingNumber) {
		action.inputTrackingNumber(trackingNumber);
	}

	@Then("Delivered {string} should be available for successful package delivery")
	public void delivered_should_be_available_for_successful_package_delivery(String expectedMsg) {
		String actualMsg = action.getDeliveredMessage();
		Assert.assertEquals(actualMsg, expectedMsg);
	}

}
