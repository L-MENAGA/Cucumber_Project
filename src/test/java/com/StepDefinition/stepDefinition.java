package com.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Cucu_BDD_BaseClass.Cucu_BDD_BaseClass;
import com.Cucumber.Rrunner.Test_Runner;

import CuCu_BDD_POM_Manager.Addatin_PageObjectManager;
import Cucu_Bdd_PropertyFile.file_Reader_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinition  extends Cucu_BDD_BaseClass{
	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Addatin_PageObjectManager pom = new Addatin_PageObjectManager(driver);  
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	  String url= file_Reader_Manager.getInstanceFRM().getInstanceCR().getAdactinurl();
	 url(url);  
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	   
		inputValueElement(pom.getinstanceHp().getUsername(), "LGMVina22");
	  
	}

	@When("^user Enter The Passowrd In Password Field$")
	public void user_Enter_The_Passowrd_In_Password_Field() throws Throwable {
		inputValueElement(pom.getinstanceHp().getPassword(), "lg61071@gmail.com");   
	}

	@Then("^user Click On The Login Button And It  Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	   clickIt(pom.getinstanceHp().getSubmitLogin()) ;
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		dropdown("index",pom.getinstanceHs().getLocation(),"2");
	    
	} 

	@When("^user Slect The Hotel Name$")
	public void user_Slect_The_Hotel_Name() throws Throwable {
		dropdown("Text",pom.getinstanceHs().getHotel(), "Hotel Sunshine");    
	}

	@When("^user Slect The Room Type$")
	public void user_Slect_The_Room_Type() throws Throwable {
		dropdown("index",pom.getinstanceHs().getRoomType(), "2");  
	}

	@When("^user Slect The Number Of Rooms$")
	public void user_Slect_The_Number_Of_Rooms() throws Throwable {
		dropdown("index",pom.getinstanceHs().getRoomNos(), "2"); 
	}

	@When("^user Slect The Check In Date$")
	public void user_Slect_The_Check_In_Date() throws Throwable {
		inputValueElement(pom.getinstanceHs().getDatePickIn(), "14/12/2021");   
	}

	@When("^user Slect The  Check Out Date$")
	public void user_Slect_The_Check_Out_Date() throws Throwable {
		inputValueElement(pom.getinstanceHs().getDatePickOut(), "16/12/2021");
	}

	@When("^user Slect The Adults Per Room$")
	public void user_Slect_The_Adults_Per_Room() throws Throwable {
		dropdown("Byvalue",pom.getinstanceHs().getAdultRoom(), "2");    
	}

	@When("^user Slect The Children Per Room$")
	public void user_Slect_The_Children_Per_Room() throws Throwable {
		dropdown("index",pom.getinstanceHs().getChildRoom(),  "2");   
	}

	@Then("^user Clicks On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Clicks_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickIt(pom.getinstanceHs().getSubmit()); 
	}

	@When("^user Slects The Hotel$")
	public void user_Slects_The_Hotel() throws Throwable {
		clickIt(pom.getinstanceSh().getRadioButton());
	}

	@Then("^user Clicks On The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Clicks_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		clickIt(pom.getinstanceSh().getContinue());
	}

	@When("^user Enters First Name In First Name Field$")
	public void user_Enters_First_Name_In_First_Name_Field() throws Throwable {
		inputValueElement(pom.getinstanceAp().getFirstName(),"Logav");
	}

	@When("^user Enters Last Name In Last Name Field$")
	public void user_Enters_Last_Name_In_Last_Name_Field() throws Throwable {
		inputValueElement(pom.getinstanceAp().getLastName(),"Logav");    
	}

	@When("^user Enters Billing Address In Billing Address Field$")
	public void user_Enters_Billing_Address_In_Billing_Address_Field() throws Throwable {
		inputValueElement(pom.getinstanceAp().getAddress(),"6808 south blvd , Mary land, Tx zip:40584");
	}

	@When("^user Enters Credit Card NO In Credit Card NO Field$")
	public void user_Enters_Credit_Card_NO_In_Credit_Card_NO_Field() throws Throwable {
		inputValueElement(pom.getinstanceAp().getCCNum(),"1234123412341234");  
	}

	@When("^user Enters Credit Card Type  In Credit Card Type  Field$")
	public void user_Enters_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		dropdown("index",pom.getinstanceAp().getCCType(),"2");    
	}

	@When("^user Selects Expiry Month In Expiry Month Field$")
	public void user_Selects_Expiry_Month_In_Expiry_Month_Field() throws Throwable {
		dropdown("text",pom.getinstanceAp().getCCExpMonth(),"October");
	}

	@When("^user Selects Expiry Year In Expiry Year Field$")
	public void user_Selects_Expiry_Year_In_Expiry_Year_Field() throws Throwable {
		dropdown("index",pom.getinstanceAp().getCCExpYear(),"4");   
	}

	@When("^user Enters CVV In CVV Field$")
	public void user_Enters_CVV_In_CVV_Field() throws Throwable {
		inputValueElement(pom.getinstanceAp().getCCCVV(),"789");   
	}

	@Then("^user Clicks On The Book Now Button And It Navigates To Hotel Booking Confirmation page$")
	public void user_Clicks_On_The_Book_Now_Button_And_It_Navigates_To_Hotel_Booking_Confirmation_page() throws Throwable {
		clickIt(pom.getinstanceAp().getBookNow());    
	}



}
