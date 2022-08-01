package bdd.ups.stepDefinitions;

import bdd.ups.pageActions.MyntraPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyntraPageActionsStepDefinitions {
	MyntraPageActions actions = new MyntraPageActions();

	@Given("Customer navigated to the Myntra home page")
	public void customer_navigated_to_the_Myntra_home_page() {
		actions.navigateToMyntraPage();
	}

	@When("Customer explotes the KIDS menu options")
	public void customer_explotes_the_KIDS_menu_options() throws InterruptedException {
		actions.navigateToKidsMenu();
	}

	@Then("Customer should eba able to access the T-Shirts")
	public void customer_should_eba_able_to_access_the_T_Shirts() throws InterruptedException {
		actions.navigateToKidsTShirts();
		actions.validateKidsTshirtsCategory();
	}
}
