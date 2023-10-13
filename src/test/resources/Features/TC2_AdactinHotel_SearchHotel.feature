@Search
Feature: Verify Adactin Hotel Search Page

  @Smoke @Sanity
  Scenario Outline: Validate Search Hotel with valid information
    Given User is on adactin login page
    When User enters "<userName>" and "<password>" and click on login button
    And User select "<location>","<hotel>","<roomType>","<numberOfRooms>","<adultsPerRoom>" and "<childrenPerRoom>"
    And User click on search Button

    Examples: 
      | userName  | password | location | hotel       | roomType | numberOfRooms | adultsPerRoom | childrenPerRoom |
      | nitish123 | O55U1Z   | Sydney   | Hotel Creek | Standard | 2 - Two       | 2 - Two       | 2 - Two         |
