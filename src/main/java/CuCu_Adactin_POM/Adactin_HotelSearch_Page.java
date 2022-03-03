package CuCu_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_HotelSearch_Page {
public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
   
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement datepickIn;
	
	@FindBy(id="datepick_out")
	private WebElement datepickOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement Submit;
	public Adactin_HotelSearch_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	
}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomtype;
	}
	public WebElement getRoomNos() {
		return roomnos;
	}
	public WebElement getDatePickIn() {
		return datepickIn;
	}
	
	public WebElement getDatePickOut() {
		return datepickOut;
	}
	
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	

}



