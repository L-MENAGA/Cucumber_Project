package CuCu_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_AddressPage {
	
	public WebDriver driver;
	@FindBy(name="first_name")
	private WebElement firstName;
	@FindBy(name="last_name")
	private WebElement lastName;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement ccnum;
	@FindBy(name="cc_type")
	private WebElement cctype;
	@FindBy(name="cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(name="cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(name="cc_cvv")
	private WebElement cccvv;
	@FindBy(name="book_now")
	private WebElement bookNow;
	public Adactin_AddressPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCCNum() {
		return ccnum;
	}
	public WebElement getCCType() {
		return cctype;
	}
	public WebElement getCCExpMonth() {
		return ccexpmonth;
	}
	public WebElement getCCExpYear() {
		return ccexpyear;
	}
	public WebElement getCCCVV() {
		return cccvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}

}
