Feature: Hotel Booking In Adactin Application

Scenario: Login Functionality

Given user launch The Application
When user Enter The User name In The User Field
And user Enter The Passward In the Passward Field
Then user  Click On The Login Button And Its  Navigate To Search Hotel Page

Scenario: Search Hotel Functionality

When user Select The Location In Location Field
And user Select The Hotel In Hotel Field
And user Select The Room Type in Room Field
And user Select The Number Of Rooms In Number Of RoomField
And user Check In Date In Check In Date Field 
And user Check Out Date In Check Out Date Field
And user Select The Room For Adults
And user Select The Room For Children
Then user Click On The Search Button And its Navigate To Select Hotel

Scenario: Select Hotel Functionality

When user Click On The Radio Button 
Then user Clickon The Continue Button And Its Navigate To Book A Hotel Class

Scenario: User Select A Hotel Functionality

And user Enter The First Name
And user Enter The Last Name
And user Enter The BillingAddress
And user Select The Credit Card Number
And  user Select The Credit CardType
And user Select The month
And user Select The Year
And user Enter The cvv Number
Then user Click The Book Noe Button And Its Navigate to Booking Confirmation

Scenario: Select A Booking Confirmation Page

Then user Click On Logout Button To Leave That Page







 