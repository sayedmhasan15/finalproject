package bdd.ebay.pageActions;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.ebay.pageElements.EbayElements;
import bdd.ebay.utilities.GetWebDriver;

public class EbayPageAction {
	EbayElements elements;

	public EbayPageAction() {
		this.elements = new EbayElements();
		PageFactory.initElements(GetWebDriver.webdriver, this.elements);
	}

	public void navigateToEbayPage() {
		GetWebDriver.webdriver.get("https://www.ebay.com/");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void navigateToCategory() throws InterruptedException {
		elements.category.click();
	}

	public void navigateToElectronic() throws InterruptedException {
		Actions actions = new Actions(GetWebDriver.webdriver);
		actions.moveToElement(elements.elect);
		actions.click();
		actions.perform();
		Thread.sleep(3000);
	}
public void closebrowser() {
	GetWebDriver.webdriver.close();
}
	


}
