Feature: This feature file is to validate the payment functionalities of Cyclos Website.

@DataTable
Scenario: Validate whether payment is being made to any existing user is successful.
Given Required website is launches also the business user is able to loggin with the authorized credentials
When Below are the payment details like payee and amount
|User|Amount|
|Nicola  Tesla |1|
|Hotel  Oasis|1|
|Henry  George|1|
Then System is able to make the payments to desired user with specified amount

@PayUser_ScenarioOutline
Scenario Outline: Validate whether payment is being made to existing user is successful through ScnOutline
Given Website launched after that business user is able to loggin with the authorized credentials
When Data details are User "<User>"  Amount "<Amount>" system is able to make the payment.
Then System is able to make the required payment to the users
Examples:
|User|Amount|
|Nicola  Tesla|2|
|Hotel  Oasis|2|
|Henry  George|2|


@PayUser_DataDrivenExternalSource
Scenario: Validate whether payment is being made to existing user is successful by fetching data from external csv file
Given Launching the Cyclos website after that using the account id with passowrd to gain access to proceed further 
When Data is being fetched from "./TestData/CyclosNew.csv"
Then Payment is being made by the system
