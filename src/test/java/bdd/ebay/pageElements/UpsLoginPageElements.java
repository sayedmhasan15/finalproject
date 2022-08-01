package bdd.ups.pageElements;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class UpsLoginPageElements {

	@FindBy(xpath = "//span[@class='ups-socialicon ups-socialicon_twitter']")
	public WebElement twitterExternalLink;

	@FindAll(@FindBy(xpath = "//button[@type='button']"))
	public List<WebElement> externallLinks;

}
