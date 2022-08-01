package bdd.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayElements {
	
	@FindBy(xpath = "//i[@id='gh-shop-ei']")
	public WebElement category;

	@FindBy(xpath = "//a[@_sp='m570.l3413']")
	public WebElement elect;
	
}
