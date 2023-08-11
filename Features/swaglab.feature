
Feature: To Validate the login page
  I want to use this template for my feature file


 @tag1
  Scenario Outline: user able to log in with valid credentials
    Given user open the url "<url>"
    When user enter the valid username "<username>"
    And user enter the valid password "<password>"
    And user click the submit button
    Then user able to login sucessfully

    Examples: 
      | url | username| password |
      | https://www.saucedemo.com/ | standard_user | secret_sauce |
      | https://www.saucedemo.com/ | problem_user | secret_sauce  |
      | https://www.saucedemo.com/ | performance_glitch_user |  secret_sauce  |
@tag2
    Scenario Outline: user able to login with invalid credentials
    Given user open the url "<url>"
    When user enter the invalid username "<username>"
    And user enter the invalid password "<password>"
    And user click the submit button
    Then user see some error msg

    Examples: 
      | url | username| password |
      | https://www.saucedemo.com/ | standard_user |pathi_abc |
      | https://www.saucedemo.com/ | pathi_abc |  secret_sauce  |
      | https://www.saucedemo.com/ | demousername | depassword  |
      
      
      