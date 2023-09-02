#Feature: validate Login Functionality for Rediff Application
# Scenario Outline: Check the search functionality for valid data
#  Given user is on the home page of Rediff
# When User enter <keyword>
#    When user gives keyword in search feild
#     | News        |
#    | Latest news |
# And User clicks on search btn
#Then Search should be successful
#    Examples:
#     | keyword     |
#    | Latest news |
#   | News        |
#Feature: create account functionality

#  Scenario: validate create account form
 #   Given user is on create account page
#When data full_name , mailId , password , repassword , alternateMailId , mobileNo is entered from excel sheet
#    |Megha Shanbhag|
 #   |megha123|
  #  |Megha@123|
   # |Megha@123|
    #|megha123@gmail.com|
    #|9876543219|
#When user enters full keyword,redmail1,pass1,conpass1,altmail1,mobno1
#|Megha Shanbhag|megha123|Megha@123|Megha@123|megha123@gmail.com|9876543219|
  #  And click on create my account button
   # Then The message box should display

   
 @login
Feature: create account functionality
Background:
Given user should be on homepage

@log1
  Scenario: validate create account form
    When user should click create account link
    And user enters full keyword,redmail1,pass1,conpass1,altmail1,mobno1
    And click on create my account button
    Then The message box should display 
    
#@log2
#  Scenario: validate create account form
#    When user should click create account link
#    And user enters invalid keyword,redmail1,pass1,conpass1,altmail1,mobno1
#    And click on create my account button
#    Then The message box should display     