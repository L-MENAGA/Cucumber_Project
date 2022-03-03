package CuCu_BDD_POM_Manager;

import org.openqa.selenium.WebDriver;

import CuCu_Adactin_POM.Adactin_AddressPage;
import CuCu_Adactin_POM.Adactin_Homepage;
import CuCu_Adactin_POM.Adactin_HotelSearch_Page;
import CuCu_Adactin_POM.Adactin_HotelSelection_Page;

public class Addatin_PageObjectManager {
public WebDriver driver;
private Adactin_Homepage Hp ;
private Adactin_HotelSearch_Page Hs;
private Adactin_HotelSelection_Page Sh;
private Adactin_AddressPage Ap ;

public Addatin_PageObjectManager (WebDriver driver2) {
	this.driver=driver2;
	
}
public  Adactin_Homepage getinstanceHp() {
	if(Hp==null) {
		Hp= new Adactin_Homepage(driver);
	}
	return Hp;
	
}
public  Adactin_HotelSearch_Page getinstanceHs() {
	if(Hs==null) {
		Hs= new Adactin_HotelSearch_Page(driver);
		
	}
	return Hs;
}
public Adactin_HotelSelection_Page getinstanceSh() {
	if(Sh==null) {
		Sh= new Adactin_HotelSelection_Page(driver);
	}
	return Sh;
	
}
public Adactin_AddressPage  getinstanceAp() {
	if(Ap==null) {
		Ap= new Adactin_AddressPage(driver);
	}
	return Ap;
}
}
