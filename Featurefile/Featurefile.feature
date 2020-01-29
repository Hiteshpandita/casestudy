Feature: Register
@Register
Scenario: Register on TestMe App
Given user open TestMeApp
When user click signup
And enter user name as "Hitesh50"
And enter first name as "Hitesh"
And enter last name as "Pandita"
And enter password as "Pandita"
And enter confirm password as "Pandita"
And user select gender as "Male"
And enter email as "a.a@a.com"
And enter mobile as "4574747523"
And enter dob as "01/01/2019"
And enter address as "HinjewadiPuneMaharashtra"
And select security question as "What is your Pet Name?"
And enter answer as "Yellow"
Then user click Register

@Login
Scenario: Login using datatable
Given user open TestMeApp
When user click signin
And user enter credentials as 
    |lalitha    |
    |Password123|
