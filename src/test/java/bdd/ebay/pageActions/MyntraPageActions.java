package bdd.ups.pageActions;

import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import bdd.ups.pageElements.MyntraPageElements;
import bdd.ups.utilities.GetWebDriver;

public class MyntraPageActions {

	MyntraPageElements elements;

	public MyntraPageActions() {
		this.elements = new MyntraPageElements();
		PageFactory.initElements(GetWebDriver.webdriver, this.elements);
	}

	public void navigateToMyntraPage() {
		GetWebDriver.webdriver.get("https://www.myntra.com/");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void navigateToKidsMenu() throws InterruptedException {
		Actions actions = new Actions(GetWebDriver.webdriver);
		actions.moveToElement(elements.kidsMenu);
		actions.perform();
		Thread.sleep(3000);
	}

	public void navigateToKidsTShirts() throws InterruptedException {
		Actions actions = new Actions(GetWebDriver.webdriver);
		actions.moveToElement(elements.tShirts);
		actions.click();
		actions.perform();
		Thread.sleep(2000);
	}

	public void validateKidsTshirtsCategory() {
		Assert.assertTrue(elements.tShirtCheckBox.isSelected());
	}

}
