package CuCu_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Homepage {
public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement password;
   
	@FindBy(id="login")
	private WebElement Login;
	
	public Adactin_Homepage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmitLogin() {
		return Login;
	}
	
	
	

}



