package bdd.ebay.stepDefinitions;
import bdd.ebay.pageActions.EbayPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EbayStepDef {
	
	EbayPageAction action = new EbayPageAction();
	
	@Given("user at eBay homepage")
	public void user_at_eBay_homepage() {
	   action.navigateToEbayPage();
	   
	}

	@Given("click on category")
	public void click_on_category() throws InterruptedException {
	   action.navigateToCategory();
	   
	}

	@Given("select electronic")
	public void select_electronic() throws InterruptedException {
	   action.navigateToElectronic();
	   
	}

	@Then("close the browser")
	public void close_the_browser() {
	  action.closebrowser();
	   
	}

}
