Feature: View Pages


  @exclude
  Scenario: User can successfully view Products page
    Given I navigate to Brother Homepage
    When I click on Products Menu
    Then the Products menu page will successfully be displayed

  @exclude
  Scenario: User can successfully view Suppliers menu pages
    Given I navigate to Brother Homepage
    When I click on suppliers page
    Then the MenuPage will successfully be displayed

@exclude
  Scenario: User can successfully view Brother For Home menu pages
    Given I navigate to Brother Homepage
    When I click on Brother for home menu
    Then the Brother for home Page will successfully be displayed


  Scenario: User can successfully Register a product
    Given I navigate to Brother Homepage
    And I click on Account logo
    When I click on the sign In button
    And I type in a valid email "vepejir192@cohodl.com"
    And I type in a valid password "test123_567"
    And I click on SignIn to Brother Online
    Then user is successfully signed in