Feature: Hotel Booking In Adactin Application

Scenario: Login

Given user Launch The Application 

When user Enter The Username In Username Field

And user Enter The Passowrd In Password Field

Then user Click On The Login Button And It  Navigates To The Search Hotel Page

Scenario: 	Search Hotel

When user Select The Hotel Location

And user Slect The Hotel Name

And user Slect The Room Type

And user Slect The Number Of Rooms

And user Slect The Check In Date

And user Slect The  Check Out Date

And user Slect The Adults Per Room

And user Slect The Children Per Room

Then user Clicks On The Search Button And It Navigates To The Select Hotel Page

Scenario: Selects Hotel

When user Slects The Hotel

Then user Clicks On The Continue Button And It Navigates To Book A Hotel Page

Scenario: Book A Hotel By Payment 

When user Enters First Name In First Name Field

And user Enters Last Name In Last Name Field

And user Enters Billing Address In Billing Address Field

And user Enters Credit Card NO In Credit Card NO Field

And user Enters Credit Card Type  In Credit Card Type  Field

And user Selects Expiry Month In Expiry Month Field

And user Selects Expiry Year In Expiry Year Field

And user Enters CVV In CVV Field

Then user Clicks On The Book Now Button And It Navigates To Hotel Booking Confirmation page




