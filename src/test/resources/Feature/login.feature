Feature: login to flipkart find the mobile phones

  #@smoke_test_001
  Scenario: login to smartfix find the technician workorder page.
    Given login to dispatcher profile
    When dispatcher profile having username and password
    Then Navigating through the login page


  Scenario Outline: login to smartfix find the technician workorder page.
      Given login to dispatcher profile
      When dispatcher profile having <username> and <password>
      Then Navigating through the login page
      
      Examples: 
      
      |username |password|
      |user1| pass1|
    |user2| pass2|

