package CuCu_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_HotelSelection_Page {
	


public WebDriver driver;
@FindBy(xpath=("//input[@type='radio']"))
private WebElement radibutton;

@FindBy(id="continue")
	private WebElement proceed;

public Adactin_HotelSelection_Page(WebDriver driver2) {
	this.driver =driver2;
	PageFactory.initElements(driver,this);
}
public WebElement getRadioButton() {
	return radibutton;
	
}
public WebElement getContinue() {
	return proceed;
}
}
