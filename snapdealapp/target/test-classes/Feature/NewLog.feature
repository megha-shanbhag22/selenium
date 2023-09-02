Feature: validate Login Functionality for swag labs Application

  Scenario Outline: Check the login functionality for valid data
    Given user is on the login page of Swag Lab
    When User enter <uname>&<pwd>
    And User clicks on login button
    Then Login should be successful

    Examples: 
      | uname         | pwd          |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
