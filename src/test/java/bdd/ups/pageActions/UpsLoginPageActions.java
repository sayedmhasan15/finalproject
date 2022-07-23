package bdd.ups.pageActions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.ups.pageElements.UpsLoginPageElements;
import bdd.ups.utilities.GetWebDriver;
import bdd.ups.utilities.Helper;

public class UpsLoginPageActions {

	UpsLoginPageElements elements;

	public UpsLoginPageActions() {
		this.elements = new UpsLoginPageElements();
		PageFactory.initElements(GetWebDriver.webdriver, this.elements);
	}

	public void navigateToUpsLoginPage() {
		GetWebDriver.webdriver.get("https://www.ups.com/lasso/login?");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void validateUpsLoginPage() {
		Assert.assertEquals(Helper.getPageTitle(), "Login | UPS - United States");
	}

	public void clickGoogleExternalLink() {
		elements.externallLinks.get(1).click();
	}

	public void clickFacebookExternalLink() {
		elements.externallLinks.get(2).click();
	}

	public void clickAmazonExternalLink() {
		elements.externallLinks.get(3).click();
	}

	public void clickAppleExternalLink() {
		elements.externallLinks.get(4).click();
	}

	public void clickTwitterExternalLink() {
		elements.externallLinks.get(5).click();
		// elements.twitterExternalLink.click();
	}

	public boolean switchToTwitterWindow() {
		boolean bool = false;
		Set<String> windows = GetWebDriver.webdriver.getWindowHandles();
		for (String str : windows) {
			GetWebDriver.webdriver.switchTo().window(str);
			GetWebDriver.webdriver.manage().window().maximize();
			if (Helper.getPageTitle().contains("Twitter")) {
				bool = true;
			}
		}
		return bool;
	}

	public boolean ValidateExternalLinks() {
		boolean bool = false;
		String parentWindow = GetWebDriver.webdriver.getWindowHandle();
		clickGoogleExternalLink();
		Set<String> windows = GetWebDriver.webdriver.getWindowHandles();
		for (String str : windows) {
			GetWebDriver.webdriver.switchTo().window(str);
			GetWebDriver.webdriver.manage().window().maximize();
			if (Helper.getPageTitle().contains("Google")) {
				bool = true;
			} else {
				bool = false;
			}
			GetWebDriver.webdriver.switchTo().window(parentWindow);
		}

		clickFacebookExternalLink();
		windows = GetWebDriver.webdriver.getWindowHandles();
		for (String str : windows) {
			GetWebDriver.webdriver.switchTo().window(str);
			GetWebDriver.webdriver.manage().window().maximize();
			if (Helper.getPageTitle().contains("Facebook")) {
				bool = true;
			} else {
				bool = false;
			}
			GetWebDriver.webdriver.switchTo().window(parentWindow);
		}

		clickAmazonExternalLink();
		windows = GetWebDriver.webdriver.getWindowHandles();
		for (String str : windows) {
			GetWebDriver.webdriver.switchTo().window(str);
			GetWebDriver.webdriver.manage().window().maximize();
			if (Helper.getPageTitle().contains("Amazon")) {
				bool = true;
			} else {
				bool = false;
			}
			GetWebDriver.webdriver.switchTo().window(parentWindow);
		}

		clickAppleExternalLink();
		windows = GetWebDriver.webdriver.getWindowHandles();
		for (String str : windows) {
			GetWebDriver.webdriver.switchTo().window(str);
			GetWebDriver.webdriver.manage().window().maximize();
			if (Helper.getPageTitle().contains("Google")) {
				bool = true;
			} else {
				bool = false;
			}
			GetWebDriver.webdriver.switchTo().window(parentWindow);
		}
		clickTwitterExternalLink();
		windows = GetWebDriver.webdriver.getWindowHandles();
		for (String str : windows) {
			GetWebDriver.webdriver.switchTo().window(str);
			GetWebDriver.webdriver.manage().window().maximize();
			if (Helper.getPageTitle().contains("Twitter")) {
				bool = true;
			} else {
				bool = false;
			}
			GetWebDriver.webdriver.switchTo().window(parentWindow);
		}

		return bool;
	}
}
