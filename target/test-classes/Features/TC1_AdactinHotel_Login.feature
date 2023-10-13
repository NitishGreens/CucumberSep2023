@Login
Feature: Verify Adactin Hotel Login Page

  @Reg @Smoke
  Scenario: Verify Login Page With Valid Credential
    Given User is on adactin login page
    When User enters username and password and click on login button
      | userName       | password |
      | mani@gmail.com | mani@123 |
    Then User verify login success message

  @Reg @Sanity
  Scenario: Verify Login Page With Invalid Credential
    Given User is on adactin login page
    When User enters username and password and click on login button
      | userName       | password |
      | bala@gmail.com | bala@123 |
    Then User verify login success message
