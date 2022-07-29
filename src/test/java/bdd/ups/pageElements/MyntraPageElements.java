package bdd.ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraPageElements {

	@FindBy(xpath = "//a[@data-group='kids']")
	public WebElement kidsMenu;

	@FindBy(linkText = "T-Shirts")
	public WebElement tShirts;
	
	@FindBy(xpath="//input[@type='checkbox' and @value='Tshirts']")
	public WebElement tShirtCheckBox;

}
